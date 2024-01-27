package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondController {
	
	@RequestMapping("/second")
	@ResponseBody
	public String secondControllerString(){
		return "Here's the Second Controller String";
	}
}
