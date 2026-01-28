package com.jsp.springdatajpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.jsp.springdatajpa.entity.Mobile;
import com.jsp.springdatajpa.entity.Mobile2;

public interface M2repo extends CrudRepository<Mobile2, Integer> {

	
	
}
