package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Developer;
import com.jsp.service.DevService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DevController {

	@Autowired
	private DevService service;
	
	@PostMapping("/s")
	public ResponseEntity<Developer> ins(@RequestBody Developer dev){
		
		return new ResponseEntity<Developer>(service.save(dev), HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/path")
	public ResponseEntity<List<Developer>> getMethodName() {
		return new ResponseEntity<>(service.fetchAll(),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Developer> getById(@PathVariable int id) {
		return new ResponseEntity<Developer>(service.getById(id),HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/com")
	public ResponseEntity<Developer> postMethodName(@RequestBody Developer entity) {
		
		return new ResponseEntity<Developer>(service.compUpdate(entity), HttpStatusCode.valueOf(200));
	}
	
	@PatchMapping("/{id}/{name}")
	public ResponseEntity<Developer> partialUpdate(@PathVariable int id, @PathVariable String name) {
		
		return new ResponseEntity<Developer>(service.partUpdate(id,name), HttpStatusCode.valueOf(200));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Developer> deleteId(@PathVariable int id){
		return new ResponseEntity<>(service.deleteById(id),HttpStatusCode.valueOf(204));
	}
	
	@GetMapping("/order")
	public ResponseEntity<List<Developer>>  fetchBYOrder() {
		return new ResponseEntity<>(service.fetchAllbyOrder(),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/com.jsp.service.DevService.fetchAllbyid()")
	public ResponseEntity<List<Developer>>  fetchBYOrderofId() {
		return new ResponseEntity<>(service.fetchAllbyid(),HttpStatusCode.valueOf(200));
	}
	
	
	
}
