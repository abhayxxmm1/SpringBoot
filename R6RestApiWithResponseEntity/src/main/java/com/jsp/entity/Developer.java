package com.jsp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Developer {

	@Id
	private int id;
	private String name;
	private String skill;
	
	public Developer() {
	}
	
	

	public Developer(int id, String name, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
}
