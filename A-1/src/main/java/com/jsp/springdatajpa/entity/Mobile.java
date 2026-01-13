package com.jsp.springdatajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {

	@Id
	private int id;
	private String name;
	private double price;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
