package com.jsp.customId;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.customId.entity.Employee;
import com.jsp.customId.repo.EmployeeJpaRepo;

@SpringBootApplication
public class A3CustomIdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(A3CustomIdApplication.class, args);
		
		EmployeeJpaRepo repo = run.getBean(EmployeeJpaRepo.class);
		Employee employee = new Employee(25, "Abhay");
		repo.save(employee);
	}

}
