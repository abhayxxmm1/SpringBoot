package com.jsp.h2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.h2db.entity.Mobile;
import com.jsp.h2db.repo.MobileRepo;

@SpringBootApplication
public class A4H2DbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(A4H2DbApplication.class, args);
		
		MobileRepo m1 = run.getBean(MobileRepo.class);
		m1.save(new Mobile(101, "Onkar", 10));
	}

}
  