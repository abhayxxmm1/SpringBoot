package com.jsp.service;

import java.util.List;

import com.jsp.entity.Student;

public interface StudentService {
//	why creating service layer as interface
///	to achive abstraction, dataHiding 
/// this will have all the business logic

	Student save(Student student);
	
	List<Student> getAllStudents();
	
	Student updateStatemetnById(Student stu);
	
	Student deleteByid(int id);
	
	Student updateStudentNameById(int id, String name, int age);
}
