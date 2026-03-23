package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jsp.entity.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String get() {
		return "home";
	}
	
	@GetMapping("/recieve")
	public String accept(@ModelAttribute Student stu) {
		System.out.println(stu);
		return  "home";
	}
	
}
