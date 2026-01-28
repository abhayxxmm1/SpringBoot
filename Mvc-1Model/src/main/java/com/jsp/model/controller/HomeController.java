package com.jsp.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String get(Model m) {
		
		m.addAttribute("name", "amitKumar");
		m.addAttribute("pass", "****");
		
		return "hi";
		
	}
}
