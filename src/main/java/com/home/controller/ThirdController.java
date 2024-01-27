package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/3")
public class ThirdController {
	
	@ResponseBody
	@RequestMapping("/third")
	public String thirdControllerString(){
		return "This is the Third Controller String";
	}
	
	@ResponseBody
	@RequestMapping("/other")
	public String otherControllerString(){
		return "This is the Other Controller String";
	}

}
