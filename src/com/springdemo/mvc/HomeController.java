package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// create new path in the web application. 
	@RequestMapping("/")
	public String showPage() {
		// returning the name of the .jsp file which will be the front-end. 
		// in servlet.xml file we defined the prefix and suffix for the filename. 
		return "main-menu";
	}
}
