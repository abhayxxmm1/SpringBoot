package com.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
