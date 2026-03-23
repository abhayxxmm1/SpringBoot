package com.jsp.service;

import java.util.List;

import com.jsp.entity.You;

public interface YService {

	You save(You u);
	
	You patchYou(You u);

	List<You> getAllInfo();
	
	void deleteYou(You id);
	
	List<You> youOrder();
	
}
