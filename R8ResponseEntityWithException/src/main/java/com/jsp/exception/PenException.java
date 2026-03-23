package com.jsp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/// @ControllerAdvice
/// +
/// @ResponseBody // methodArgument as well as class lvl annotation
@RestControllerAdvice
public class PenException {

///	printStackTrace is a default()
	//yye method konsa exception hadle karega
	// spring container ko aisa pata chalega
	
	
	@ExceptionHandler(value = ResoureceNotFoundException.class)
//	@ResponseBody
	public String NoResource(ResoureceNotFoundException e) {
		
		return e.getMessage();
	}
	// 2nd
//	public ResponseEntity<String> NoResource(ResoureceNotFoundException e) {
//		
//		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
//	}

	
	
	
	
//	@ResponseBody
//	@ExceptionHandler(value = NullPointerException.class)
//	public String handelNullPointer(NullPointerException e) {
//		
//		return e.getMessage();
//	}
	// 2nd
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<String> handelNullPointer(NullPointerException e) {
		
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NO_CONTENT);
	}
	
//	what are the spring boot layesrs
//	102 diya to exception layer
//	101 diya to controller layer
}
