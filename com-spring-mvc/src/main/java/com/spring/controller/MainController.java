package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/homePage")
	public String homePage() {
		return "homePage";
	}
	
	@GetMapping("/success")
	public String successPage() {
		return "success";
	}
	
	@GetMapping("/failure")
	public String failurePage() {
		return "failure";
	}
}