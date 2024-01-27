package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/3")
public class ThirdController {
	
	@RequestMapping("/third")
	public String thirdControllerString(){
		return "thirdControllerView";
	}
	
	@ResponseBody
	@RequestMapping("/other")
	public String otherControllerString(){
		return "This is the Other Controller String";
	}

}
