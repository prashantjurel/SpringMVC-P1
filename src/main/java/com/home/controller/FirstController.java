package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@ResponseBody
	@RequestMapping("/first")
	public String firstMessageString() {
		return "Here's the First Controller String";
	}

}
