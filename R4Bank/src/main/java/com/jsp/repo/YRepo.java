package com.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.You;

public interface YRepo extends JpaRepository<You, Integer>{

}
