package com.jsp.customId.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.customId.entity.Employee;

public interface EmployeeJpaRepo extends JpaRepository<Employee, String>{

}
