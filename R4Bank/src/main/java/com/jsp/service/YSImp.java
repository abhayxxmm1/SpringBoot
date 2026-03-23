package com.jsp.service;

import java.util.List;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jsp.entity.You;
import com.jsp.repo.YRepo;

@Service
public class YSImp implements YService{

	@Autowired
	private YRepo youRepo;
	
	@Override
	public You save(You u) {
		return youRepo.save(u);
	}

	@Override
	public You patchYou(You u) {
		return youRepo.save(u);
	}

	@Override
	public List<You> getAllInfo() {
		return youRepo.findAll();
	}

	@Override
	public void deleteYou(You id) {
		youRepo.delete(id);
	}

	@Override
	public List<You> youOrder() {
		Sort by = Sort.by("id");
		Sort ascMap = by.descending();
		
		return youRepo.findAll(ascMap);
	}

}
