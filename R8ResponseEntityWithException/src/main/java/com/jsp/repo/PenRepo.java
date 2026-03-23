package com.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Pen;

public interface PenRepo extends JpaRepository<Pen, Integer>{

}
