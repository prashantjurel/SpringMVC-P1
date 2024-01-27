package com.home.cafeController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePageString(Model model) {
		String myWebsiteNameString = "YOUR CAFE";
		model.addAttribute("websiteTitle", myWebsiteNameString);
		//sending data to jsp page
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrderString(HttpServletRequest httpServletRequest, Model model) {
		String userEnteredValue = httpServletRequest.getParameter("foodType");
		model.addAttribute("userInput",userEnteredValue);
		
		return "processOrder";
	}
	
	

}
