package com.jsp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jsp.config.ResponseStructure;
import com.jsp.entity.Employee;
import com.jsp.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	public ResponseStructure<Employee> postMethodName(@RequestBody Employee entity) {
		//TODO: process POST request
		
		return service.saveEmp(entity);
	}
	
	@GetMapping("/get/{id}")
	public ResponseStructure<Employee> getMethodName(@PathVariable int id) {
		
		return service.findById(id);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseStructure<Employee> del(@PathVariable int id) {
		
		return service.deleteEmpById(id);
	}
	
	@GetMapping("all")
	public ResponseStructure<List<Employee>> getAllData() {
		return service.findAll();
	}
	
}
