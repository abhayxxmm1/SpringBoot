package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.entity.Student;
import com.jsp.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@ResponseBody
public class StudetCotroller {

	@Autowired
	private StudentService service;
	
	
	@PostMapping("/save")
	public Student insert(@RequestBody Student student) {
		
		return  service.save(student);
	}
	
	@GetMapping("/all")
	public List<Student> getAll(){
		return service.getAllStudents();
		
	}
	
	@PutMapping("yoo")
	public Student putMethodName(@RequestBody Student id) {
		
		return service.updateStatemetnById(id);
	}
	
	@DeleteMapping("/{id}")
	public Student deleteById(@PathVariable int id) {
		return service.deleteByid(id);
	}
	
	@PatchMapping("/{id}/{name}/{age}")
	public Student update(@PathVariable int id,@PathVariable String name,@PathVariable int age) {
		return service.updateStudentNameById(id, name, age);
		
	}
}
