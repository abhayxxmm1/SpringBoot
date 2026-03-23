package com.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Teacher;

public interface Trepo extends JpaRepository<Teacher, Integer>{

}
