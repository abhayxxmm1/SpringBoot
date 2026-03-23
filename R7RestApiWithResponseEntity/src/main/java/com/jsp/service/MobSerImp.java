package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jsp.model.Mobile;
import com.jsp.repo.MobileRepo;
@Service
public class MobSerImp implements MobService{

	@Autowired
	private MobileRepo repo;
	
	@Override
	public Mobile save(Mobile m) {
		return repo.save(m);
	}

	@Override
	public List<Mobile> getAll() {
		return repo.findAll(Sort.by("id").descending());
	}

	@Override
	public Mobile deleteByid(int m) {
		Mobile mobile = repo.findById(m).get();
		repo.deleteById(m);
		return mobile;
	}

}
