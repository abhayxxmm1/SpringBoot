package com.jsp.h2db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {

	@Id
	private int id;
	private String name;
	private int screenSize;
	public Mobile(int id, String name, int screenSize) {
		super();
		this.id = id;
		this.name = name;
		this.screenSize = screenSize;
	}
	
	public Mobile() {
		// TODO Auto-generated constructor stub
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

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", screenSize=" + screenSize + "]";
	}
	
	
}
