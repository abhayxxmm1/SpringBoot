package com.jsp.entity;

import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String Company="Qspider's";
	private String sub;
	private int fee;
	
	public Teacher() {
	}

	
	
	

//	public Teacher(int id, String name, String sub, int fee) {
//		this.id = id;
//		this.name = name;
//		this.sub = sub;
//		this.fee = fee;
//	}

//	public Teacher( String name, String sub, int fee) {
//		this.name = name;
//		this.sub = sub;
//		this.fee = fee;
//	}


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



	public String getCompany() {
		return Company;
	}



	public void setCompany(String company) {
		Company = company;
	}



	public String getSub() {
		return sub;
	}



	public void setSub(String sub) {
		this.sub = sub;
	}



	public int getFee() {
		return fee;
	}



	public void setFee(int fee) {
		this.fee = fee;
	}




	
	
}
