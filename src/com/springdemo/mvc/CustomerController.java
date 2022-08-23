package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	// add and init binder to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation 
	
	// pre-process all web requests coming into our Controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// removes whitespace. true - means trim to null
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		// Pre-process every String form data (string.class)
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		// @Valid perform validation rules on the Customer Object
		// BindingResult - Results of validation placed in the BindingResult
		
		if(theBindingResult.hasErrors()) {
			System.out.println(theBindingResult.getAllErrors()); 
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
	}
}
