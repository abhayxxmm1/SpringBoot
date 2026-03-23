package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Emp;
import com.jsp.service.EmpService;

@Controller
@ResponseBody
//@RestController = @Controller + @ResponseBody
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@PostMapping("/saveMe")
	public Emp insert(@RequestBody Emp e) {
		return empService.save(e);
	}
	
	@GetMapping("/iWillFindYou&KillYouAll")
	public List<Emp> findAll(){
		return empService.getAll();
	}
}
