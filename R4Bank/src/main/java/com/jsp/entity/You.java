package com.jsp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class You {

	@Id
	private int id;
	private String name;
	private String location;
	private int ifsc;
	private String mangerName;
	
	public You() {
	}

	public You(int id, String name, String location, int ifsc, String mangerName) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.ifsc = ifsc;
		this.mangerName = mangerName;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public String getMangerName() {
		return mangerName;
	}

	public void setMangerName(String mangerName) {
		this.mangerName = mangerName;
	}

	@Override
	public String toString() {
		return "You [id=" + id + ", name=" + name + ", location=" + location + ", ifsc=" + ifsc + ", mangerName="
				+ mangerName + "]";
	}

	
}
