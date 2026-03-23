package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{

}
