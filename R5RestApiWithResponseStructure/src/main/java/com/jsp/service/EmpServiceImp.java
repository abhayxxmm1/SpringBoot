package com.jsp.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.config.ResponseStructure;
import com.jsp.entity.Employee;
import com.jsp.repo.EmpRepo;

@Service
public class EmpServiceImp implements EmployeeService{
	
	@Autowired
	private EmpRepo repo;

	@Override
	public ResponseStructure<Employee> saveEmp(Employee employee) {

		ResponseStructure<Employee> structure=new ResponseStructure<>();
		
		try {

			structure.setData(repo.save(employee));
			structure.setExceptionMessage("The Oject is created Sucesfully");
			structure.setStatusCode(201);
		} catch (Exception e) {
			structure.setData(null);
			structure.setExceptionMessage(e.getMessage());
			structure.setStatusCode(500);
		}finally {
			structure.setDate(LocalDate.now());;
		}
		return structure;
	}

	
//		@Override
//		public Student updateStudentNameById(int id, String name, int age) {
//
//			Student s1 = stuRepo.findById(id).get();
//			s1.setName(name);
//			s1.setAge(age);
//			stuRepo.save(s1);
//			return s1;
//		}
//		@Override
//		public Student deleteByid(int id) {
//
//			Student student = stuRepo.findById(id).get();
//			stuRepo.deleteById(id);
//			return student;
//		}
	@Override
	public ResponseStructure<Employee> deleteEmpById(int id) {

		ResponseStructure<Employee> structure=new ResponseStructure<>();
		try {

			repo.deleteById(id);
			structure.setData(null);
			structure.setExceptionMessage("The Oject is deleted Sucesfully");
			structure.setStatusCode(200);
		} catch (Exception e) {
			structure.setData(null);
			structure.setExceptionMessage(e.getMessage());
			structure.setStatusCode(404);
		}finally {
			structure.setDate(LocalDate.now());;
		}
		return structure;
	}

	@Override
	public ResponseStructure<Employee> findById(int id) {
		ResponseStructure<Employee> structure=new ResponseStructure<>();
		
//		Optional<Employee> optional = repo.findById(id);
		try {

			structure.setData(repo.findById(id).get());
			structure.setExceptionMessage("The Oject is extracted Sucesfully");
			structure.setStatusCode(201);
		} catch (Exception e) {
			structure.setData(null);
			structure.setExceptionMessage(e.getMessage());
			structure.setStatusCode(500);
		}finally {
			structure.setDate(LocalDate.now());;
		}
		return structure;
	}


	@Override
	public ResponseStructure<Employee> findAll() {

		ResponseStructure<Employee> structure = new ResponseStructure<>();
		try {
			repo.findAll();
			structure.setData(null);
			structure.setExceptionMessage("The Oject's are extracted Sucesfully");
			structure.setStatusCode(201);
		} catch (Exception e) {
			structure.setData(null);
			structure.setExceptionMessage(e.getMessage());
			structure.setStatusCode(500);
		}finally {
			structure.setDate(LocalDate.now());;
		}
		return structure;
	}

}
