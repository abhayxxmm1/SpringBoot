package com.jsp.service;

import java.util.List;

import com.jsp.entity.Emp;

public interface EmpService {

	Emp save(Emp e);
	
	List<Emp> getAll();

}
