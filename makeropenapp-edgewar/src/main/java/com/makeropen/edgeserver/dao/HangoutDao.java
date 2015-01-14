package com.makeropen.edgeserver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.makeropen.edgeserver.domain.Hangout;

public interface HangoutDao {
	@Select("select * from hangout")
	List<Hangout> queryHangoutByCity();
}
