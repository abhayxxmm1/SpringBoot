package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jsp.entity.Developer;
import com.jsp.repo.DevRepo;

@Service
public class DevServiceImp implements DevService{

	@Override
	public Developer save(Developer dev) {
		
		return repo.save(dev);
	}

	@Override
	public List<Developer> fetchAll() {
		return repo.findAll();
	}

	@Override
	public Developer getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Developer compUpdate(Developer dev) {
		
		return repo.save(dev);
	}

	@Override
	public Developer partUpdate(int id, String skill) {
		Developer developer = repo.findById(id).get();
		developer.setSkill(skill);
		return developer;
	}

	@Override
	public Developer deleteById(int id) {
		Developer developer = repo.findById(id).get();
		repo.deleteById(id);
		return developer;
	}

	@Autowired
	private DevRepo repo;

	@Override
	public List<Developer> fetchAllbyOrder() {
		Sort by = Sort.by("name");
	
		return repo.findAll(by.descending());
	}

	@Override
	public List<Developer> fetchAllbyid() {
		Sort by = Sort.by("id");
		return repo.findAll(by.ascending());
	}
	
	

}
