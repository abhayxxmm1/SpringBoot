package com.jsp.service;

import java.util.List;

import com.jsp.entity.Developer;

public interface DevService {

	Developer save(Developer dev);
	List<Developer> fetchAll();
	List<Developer> fetchAllbyOrder();
	List<Developer> fetchAllbyid();
	Developer  getById(int id);
	Developer compUpdate(Developer dev);
	Developer partUpdate(int id, String skill);
	Developer  deleteById(int id);
	
	
	
}
