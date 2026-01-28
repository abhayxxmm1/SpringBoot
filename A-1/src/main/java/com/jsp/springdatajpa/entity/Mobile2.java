package com.jsp.springdatajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile2 {

	@Id
	private int id;
	private String brand;
	private String model;	
	private double price;
	
	public Mobile2() {
		// TODO Auto-generated constructor stub
	}

	public Mobile2(int id, String brand, String model, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile2 [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	

	
	
}
