package com.jsp.service;

import java.util.List;

import com.jsp.entity.Teacher;

public interface Tservice {
	Teacher save(Teacher t);
	
	List<Teacher> getAll();
}
