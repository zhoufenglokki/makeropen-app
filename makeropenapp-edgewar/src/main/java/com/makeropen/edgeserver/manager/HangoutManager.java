package com.makeropen.edgeserver.manager;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.makeropen.edgeserver.domain.Hangout;

@Component("hangoutManager")
public class HangoutManager {
	public Map<String, Hangout> queryHangoutByCity(){
		Map<String, Hangout> hangoutList = new HashMap<>();
		Hangout hangout = new Hangout();
		hangout.setId(1);
		hangout.setName("南山创客岛");
		hangout.setPhone("88888888");
		hangout.setAddr("南山区科技园");
		hangoutList.put(hangout.getId() + "", hangout);
		return hangoutList;
	}
}
