package com.jsp.exception;
/// runtime means unchecked
/// 
public class ResoureceNotFoundException extends RuntimeException{

	String message;
	public ResoureceNotFoundException(String message) {

		super(message);
	}
}
