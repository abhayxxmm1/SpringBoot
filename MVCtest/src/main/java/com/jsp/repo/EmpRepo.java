package com.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
