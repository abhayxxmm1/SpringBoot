package com.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Developer;


public interface DevRepo extends JpaRepository<Developer, Integer>{

}
