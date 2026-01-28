package com.jsp.springdatajpa.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class UserCricketer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private LocalDate joinDate;
	private boolean active;
	
	public UserCricketer() {

	}

	public UserCricketer(int id, String name, int age, LocalDate joinDate, boolean active) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.joinDate = joinDate;
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserCricketer [id=" + id + ", name=" + name + ", age=" + age + ", joinDate=" + joinDate + ", active="
				+ active + "]";
	}

	
	
	

}
