package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage() {
		return "redirect:/student/list";
	}
	
//	@RequestMapping("/login")
//	public String showLoginPage() {
//		return "login_form";
//	}

}
