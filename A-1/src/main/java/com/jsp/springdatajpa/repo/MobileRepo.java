package com.jsp.springdatajpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.jsp.springdatajpa.entity.Mobile;

public interface MobileRepo extends CrudRepository<Mobile, Integer> {

	
}
