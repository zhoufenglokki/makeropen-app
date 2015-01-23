package com.makeropen.edgeserver.domain.result;

import github.rpcappmodel.domain.result.BaseResult;

import com.makeropen.edgeserver.domain.LoginToken;
import com.makeropen.edgeserver.domain.User;

public class LoginResult extends BaseResult {
	private static final long serialVersionUID = 7794899803213388132L;

	private User user;
	private LoginToken loginToken;

	public LoginResult() {
	}

	public LoginResult(User user, LoginToken loginToken) {
		this.user = user;
		this.loginToken = loginToken;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginToken getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(LoginToken loginToken) {
		this.loginToken = loginToken;
	}
}
