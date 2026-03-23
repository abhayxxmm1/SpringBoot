package com.jsp.service;

import java.util.List;

import com.jsp.model.Mobile;

public interface MobService {

	Mobile save(Mobile m);
	
	List<Mobile> getAll();
	
	Mobile deleteByid(int m);
	
//	Mobile partialByArg(int id,String name,double  price);
}
