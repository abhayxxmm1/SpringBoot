package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jsp.entity.Teacher;
import com.jsp.repo.Trepo;

@Service
public class TServiceImp implements Tservice{

	@Autowired
	Trepo trepo;
	
	public Teacher save(Teacher t) {
		return trepo.save(t);
	}

	public List<Teacher> getAll() {
		Sort by = Sort.by("name"); // id, fee
		Sort ascending = by.ascending();	// descending() all done	
		return trepo.findAll(ascending);
	}

}
