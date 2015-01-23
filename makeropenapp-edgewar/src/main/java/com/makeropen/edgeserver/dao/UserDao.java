package com.makeropen.edgeserver.dao;

import org.apache.ibatis.annotations.Select;

import com.makeropen.edgeserver.domain.User;

public interface UserDao {
	
	/**
	 * FIXME 从*中去除password相关内容
	 * @param userId
	 * @return
	 */
	@Select("select * from user where userId=#{userId}")
	User queryUserById(long userId);

}
