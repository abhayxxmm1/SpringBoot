package com.jsp.register.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.register.config.CustomIdConfig;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Person {

	@Id
	@GeneratedValue(generator = "custom_id")
	@GenericGenerator(name = "custom_id", type = CustomIdConfig.class)
	private String id;
	private String fname;
	private String lname;
	private String password;
	private int age;
	
	public Person() {
	}

	public Person(String fname, String lname
			, String password, int age) {
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", password=" + password + ", age=" + age
				+ "]";
	}
	
	
}
