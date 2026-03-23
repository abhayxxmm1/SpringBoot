package com.jsp.service;

import java.util.List;

import com.jsp.entity.Pen;

public interface PenService {

	Pen save(Pen p);
	
	List<Pen> getALl();
	
	Pen getById(int id);
}
