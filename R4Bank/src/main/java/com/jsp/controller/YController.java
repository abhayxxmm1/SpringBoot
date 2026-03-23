package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.entity.You;
import com.jsp.service.YService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@ResponseBody
public class YController {

	@Autowired
	private YService yourService;
	
	@PostMapping("/path")
	public You yourInsert(@RequestBody You entity) {
		//TODO: process POST request
		
		return yourService.save(entity);
	}
	
	@PatchMapping("/patch")
	public You yourUpdate(@RequestBody You entity) {
		
		return yourService.patchYou(entity);
	}
	
	@GetMapping("/info")
	public List<You> getYourInfo() {
		return yourService.getAllInfo();
	}
	
	@DeleteMapping("/willOfD")
	public void deleteYou(@RequestBody You id) {
		yourService.deleteYou(id);
	}
	@GetMapping("/g")
	public List<You> getMethodName(@RequestParam String param) {
		return yourService.youOrder();
	}
	
}
