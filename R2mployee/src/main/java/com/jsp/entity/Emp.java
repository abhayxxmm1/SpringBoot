package com.jsp.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {

	@Id
	private int id;
	private int salary;
	private int yoe;
	private String name;
	private String skill;
	private String designation;

	public Emp() {
	}

	public Emp(int id, int salary, int yoe, String name, String skill, String designation) {
		this.id = id;
		this.salary = salary;
		this.yoe = yoe;
		this.name = name;
		this.skill = skill;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", salary=" + salary + ", yoe=" + yoe + ", name=" + name + ", skill=" + skill
				+ ", designation=" + designation + "]";
	}
	
	
}
