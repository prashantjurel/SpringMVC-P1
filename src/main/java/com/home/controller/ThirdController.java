package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThirdController {
	
	@ResponseBody
	@RequestMapping("/third")
	public String thirdControllerString(){
		return "This is the Third Controller String";
	}

}
