package com.jsp.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseStructure<T> {

	private int statusCode;
	private String exceptionMessage;
	private LocalDate date;
	private T data;
	
	public ResponseStructure() {
	}

	public ResponseStructure(int statusCode, String exceptionMessage, LocalDate date, T data) {
		this.statusCode = statusCode;
		this.exceptionMessage = exceptionMessage;
		this.date = date;
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data= data;
	}
	
}
