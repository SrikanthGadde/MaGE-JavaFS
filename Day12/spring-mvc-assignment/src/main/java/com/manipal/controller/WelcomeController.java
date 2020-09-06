package com.manipal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.model.User;


@Controller
public class WelcomeController {

	@RequestMapping(value="/loginform", method=RequestMethod.GET)
	public String loginForm() {
		return "loginform";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.GET)
	public ModelAndView greetWithName(@RequestParam("studentName") String studentName, @RequestParam("studentPassword") String studentPassword) {
		//check the condition
		if (studentName.equals("admin") & studentPassword.equals("admin123")) {
			ModelAndView modelAndView = new ModelAndView("greeting-name","studentName",studentName);
			return modelAndView;
		}
		else {
			ModelAndView modelAndView = new ModelAndView("loginform","status","Login failed, please try again");
			return modelAndView;
		}
		
	}
	
}
