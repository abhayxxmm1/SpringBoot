package com.jsp.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.register.controller.ReqController;
import com.jsp.register.entity.Person;
import com.jsp.register.repo.PersonRepo;

@SpringBootApplication
public class ZProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZProjectApplication.class, args);
		
	}

}
