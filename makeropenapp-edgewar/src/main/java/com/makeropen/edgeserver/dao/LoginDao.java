package com.makeropen.edgeserver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.makeropen.edgeserver.domain.LoginToken;
import com.makeropen.edgeserver.domain.User;

public interface LoginDao {
	
	@Select("select ownerId from login_id where loginId=#{loginId}")
	Long queryUserIdByLoginId(String loginId);

	@Select("select * from user where userId=#{userId}")
	User queryUserAndPassword(long userId);
	
	@Select("select * from login_token where ownerId=#{ownerId}")
	List<LoginToken> queryTokenListByOwnerId(@Param("ownerId") long ownerId);

	@Select("select * from login_token where machineId=#{machineId}")
	List<LoginToken> queryTokenListByMachineId(String MachineId);
}
