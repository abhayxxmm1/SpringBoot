package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.entity.Emp;
import com.jsp.repo.EmpRepo;

@Service
public class EmpServiceImplimentation1 implements EmpService{

	@Autowired
	private EmpRepo empRepo;

	public EmpServiceImplimentation1() {
	}
	
	@Override
	public Emp save(Emp e) {
		return empRepo.save(e);
	}

	@Override
	public List<Emp> getAll() {
		return empRepo.findAll();
	}
	
	
}
