package com.jsp.service;

import java.util.List;

import com.jsp.config.ResponseStructure;
import com.jsp.entity.Employee;

public interface EmployeeService {

	ResponseStructure<Employee> saveEmp(Employee employee);
	
	ResponseStructure<Employee> deleteEmpById(int id);
	
	ResponseStructure<Employee> findById(int id);
	
	ResponseStructure<Employee> findAll();
	
	
}
