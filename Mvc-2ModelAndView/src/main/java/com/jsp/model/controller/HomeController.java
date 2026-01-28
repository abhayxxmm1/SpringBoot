package com.jsp.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/get")
	public ModelAndView sendMessage() {

		ModelAndView mnv = new ModelAndView();
		mnv.addObject("name", "RAM");
		mnv.addObject("Password", "****");

		mnv.setViewName("home");
		
		return mnv;
	}
}
