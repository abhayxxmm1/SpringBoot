package com.jsp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.entity.Pen;
import com.jsp.exception.ResoureceNotFoundException;
import com.jsp.repo.PenRepo;

@Service
public class PenServImp implements PenService{

	@Autowired
	private PenRepo repo;
	@Override
	public Pen save(Pen p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	@Override
	public List<Pen> getALl() {

		return repo.findAll();
	}
	@Override
	public Pen getById(int id) {
		Optional<Pen> byId = repo.findById(id);
		if (byId.isPresent()) {
			return byId.get(); 
		}
		throw new ResoureceNotFoundException(id + " Object not present in DB");
	}

}
