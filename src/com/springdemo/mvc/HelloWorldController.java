package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/home") - set a root directory to the web application. 
public class HelloWorldController {
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	
	// need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm";
	}
	
	// Adding data to spring model
	@RequestMapping("/processFormV2")
	public String letsShout(HttpServletRequest request, Model model) {
		String username = request.getParameter("user");
		username = username.toUpperCase();
		String result = "Hello " + username;
		model.addAttribute("usernamedata", result);
		
		return "processForm";
	}
	
	// Binding ReuqestPram option
	@RequestMapping("/processFormV3")
	public String version3(@RequestParam("user") String username, Model model) {
		username = username.toUpperCase();
		String result = "Hello " + username + " from version 3!";
		model.addAttribute("usernamedata", result);
		
		return "processForm";
	}
}
