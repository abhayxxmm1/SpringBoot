package com.jsp.h2file.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mob {

	@Id
	private int  id;
	private String  name;
	
	public Mob() {
		// TODO Auto-generated constructor stub
	}

	public Mob(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Mob [id=" + id + ", name=" + name + "]";
	}
	
	
}
