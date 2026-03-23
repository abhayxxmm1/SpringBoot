package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Pen;
import com.jsp.service.PenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//============================================================================
@RestController
@RequestMapping("/java.util.List<E>")
/// 
/// @Common_Mapping to the controller class
//============================================================================
public class PenController2 {

	@Autowired
	private PenService service;
	
//	@PostMapping("/insert")
//	public ResponseEntity<Pen> insert(@RequestBody Pen entity) {
//		
//		return new ResponseEntity<>(service.save(entity), HttpStatus.CREATED);
//	}
	
	@GetMapping("/")
	public ResponseEntity<List<Pen>> getInfo() {
		return new ResponseEntity<>(service.getALl(), HttpStatus.OK);
	}
	
}
