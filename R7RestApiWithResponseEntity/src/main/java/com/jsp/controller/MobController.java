package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.model.Mobile;
import com.jsp.service.MobService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MobController {

	@Autowired
	private MobService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Mobile>> getMethodName() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@PostMapping("/p")
	public ResponseEntity<Mobile> getAll(@RequestBody Mobile entity) {
		//TODO: process POST request
		
		return new ResponseEntity<>(service.save(entity), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Mobile> postMethodName(@PathVariable int id) {
		return new ResponseEntity<>(service.deleteByid(id), HttpStatus.NO_CONTENT);
	}
	
	
	
	
}
