package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.entity.Teacher;
import com.jsp.service.Tservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@ResponseBody
public class Tcontroller {

	@Autowired
	private Tservice tservice;
	
	@PostMapping("/s")
	public Teacher s(@RequestBody Teacher entity) {
		//TODO: process POST request
		
		return tservice.save(entity);
	}
	
	
	@GetMapping("/getThem")
	public List<Teacher> get() {
		return tservice.getAll();
	}
	
	
}
