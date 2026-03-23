package com.jsp.service;

import java.util.List;

import org.slf4j.helpers.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.entity.Student;
import com.jsp.repo.StudentReop;

@Service
public class StudentServiceImp1 implements StudentService{

	@Autowired
	private StudentReop stuRepo;
	
	public StudentServiceImp1() {
	}
	
	@Override
	public Student save(Student student) {

		return stuRepo.save(student);
	}


	@Override
	public List<Student> getAllStudents() {

		return stuRepo.findAll();
	}

	@Override
	public Student updateStatemetnById(Student stu) {

		Student student = stuRepo.findById(stu.getId()).get();
		student.setAge(stu.getAge());
		student.setName(stu.getName());
		stuRepo.save(student);
		return student;
	}

	@Override
	public Student deleteByid(int id) {

		Student student = stuRepo.findById(id).get();
		stuRepo.deleteById(id);
		return student;
	}

	@Override
	public Student updateStudentNameById(int id, String name, int age) {

		Student s1 = stuRepo.findById(id).get();
		s1.setName(name);
		s1.setAge(age);
		stuRepo.save(s1);
		return s1;
	}

}
