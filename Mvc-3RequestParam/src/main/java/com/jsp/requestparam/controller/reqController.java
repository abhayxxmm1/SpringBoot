package com.jsp.requestparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class reqController {

	@GetMapping("/")
	public String get() {
		return "home";
	}
	
	@GetMapping("/read")
	public void recive(@RequestParam("name") String name,@RequestParam("pass") String pass,
			@RequestParam("email") String email,@RequestParam("age") int age) {
		System.out.println("name :" + name);
		System.out.println("password :" + pass);
		System.out.println("email :" + email);
		System.out.println("age :" + age);
	}
}
