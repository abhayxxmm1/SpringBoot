package com.jsp.springdatajpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springdatajpa.entity.Mobile;
import com.jsp.springdatajpa.repo.MobileRepo;

@SpringBootApplication
public class A1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(A1Application.class, args);
		
		MobileRepo bean = run.getBean(MobileRepo.class);
		
		
		System.out.println("child class Name is "+bean.getClass().getName() + "is a design pattern where spring ");		
//		Mobile mobile = new Mobile(101, "oppo", 23.0);
//		Mobile mobile2 = new Mobile(102, "Apple", 23000.0);
//		Mobile mobile3 = new Mobile(103, "samsung", 23.0);
//		
//		
//		bean.save(mobile);
//		bean.save(mobile2);
//		bean.save(mobile3);
//		
		List<Mobile> list = Arrays.asList(new Mobile(105, "mac", 3445447.0),new Mobile(106, "lol", 344547.0));
		bean.saveAll(list);
		
	}

}
