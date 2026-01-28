package com.jsp.customId.entity;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.customId.config.CustomIdConfig;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(generator = "custom_id")
	@GenericGenerator(name = "custom_id", type= CustomIdConfig.class)
	private String id;
	private int age;
	private String name;
	public Employee(int age, String name) {

		
		//		this.id = id;
		this.age = age;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
