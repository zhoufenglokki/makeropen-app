package com.makeropen.edgeserver.manager;

import java.util.List;

import github.rpcappmodel.domain.result.ModelResult;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.makeropen.edgeserver.dao.LoginDao;
import com.makeropen.edgeserver.dao.UserDao;
import com.makeropen.edgeserver.domain.LoginToken;
import com.makeropen.edgeserver.domain.User;
import com.makeropen.edgeserver.domain.result.LoginResult;

//@Component("loginManager")
public class LoginManager {
	@Resource(name = "loginDao")
	private LoginDao loginDao;

	@Resource(name = "userDao")
	private UserDao userDao;

	public LoginResult loginByPassword(String loginId, String passwordMd5, String machineId) {
		Long userId = loginDao.queryUserIdByLoginId(loginId);
		if (userId == null) {
			return new LoginResult().withError("db.loginId.notfound", "帐号或密码错误");
		}
		User user = loginDao.queryUserAndPassword(userId);
		if (user == null) {
			return new LoginResult().withError("db.user.notfound", "帐号有误，请与客服联系");
		}
		if (user.getStatus() != 0) {
			return new LoginResult().withError("db.user.notActive", "帐号或密码错误");
		}
		if (passwordMd5.equals(user.getPasswordMd5AndSalt())) {
			user.clearPassword();
			LoginToken loginToken = changeLoginToken();
			return new LoginResult(user, loginToken);
		}
		return new LoginResult().withError("code.notfinished", "帐号或密码错误");
	}

	private LoginToken changeLoginToken() {
		return null;
	}

	public ModelResult<User> loginByToken(String loginId, String loginToken, String machineId) {
		Long userId = loginDao.queryUserIdByLoginId(loginId);
		if (userId == null) {
			return new LoginResult().withError("db.loginId.notfound", "帐号或密码错误");
		}
		List<LoginToken> tokenList = loginDao.queryTokenListByOwnerId(userId);
		boolean tokenOk = false;
		for(LoginToken token : tokenList) {
			if(!machineId.equals(token.getMachineId())){
				continue;
			}
			if(!loginToken.equals(token.getToken())){
				return new ModelResult<User>().withError("login.needLoginWithPassword", "请重新输入密码");
			}else{
				tokenOk = true;
				break;
			}
		};
		if(!tokenOk){
			return new ModelResult<User>().withError("login.needLoginWithPassword", "请重新输入密码");
		}

		User user = userDao.queryUserById(userId);
		if (user == null) {
			return new LoginResult().withError("db.user.notfound", "帐号有误，请与客服联系");
		}
		if (user.getStatus() != 0) {
			return new LoginResult().withError("db.user.notActive", "帐号或密码错误");
		}
		return new ModelResult<>(user);
	}
}
