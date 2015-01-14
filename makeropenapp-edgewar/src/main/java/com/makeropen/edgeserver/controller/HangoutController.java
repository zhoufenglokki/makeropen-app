package com.makeropen.edgeserver.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.makeropen.edgeserver.domain.Hangout;
import com.makeropen.edgeserver.manager.HangoutManager;

@Controller
public class HangoutController {
	Logger log = LoggerFactory.getLogger(getClass());

	@Resource(name = "hangoutManager")
	private HangoutManager hangoutManager;
	
	@RequestMapping("/queryHangoutByCity.json")
	public Model queryHangoutByCity(Model model){
		Map<String, Hangout> hangoutList = hangoutManager.queryHangoutMapByCity();
		model.addAttribute("hangoutList", hangoutList);
		model.addAttribute("success", true);
		return model;
	}
}
