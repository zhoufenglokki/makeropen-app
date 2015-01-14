package com.makeropen.edgeserver.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.makeropen.edgeserver.dao.HangoutDao;
import com.makeropen.edgeserver.domain.Hangout;

@Component("hangoutManager")
public class HangoutManager {
	@Resource(name = "hangoutDao")
	private HangoutDao hangoutDao;

	public Map<String, Hangout> queryHangoutMapByCity() {
		Map<String, Hangout> hangoutMap = new HashMap<>();
		List<Hangout> hangoutList = hangoutDao.queryHangoutByCity();
		hangoutList.parallelStream().forEach(hangout -> hangoutMap.put(hangout.getId() + "", hangout));

		return hangoutMap;
	}
}
