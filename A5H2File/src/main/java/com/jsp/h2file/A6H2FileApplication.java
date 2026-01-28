package com.jsp.h2file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.h2file.entity.Mob;
import com.jsp.h2file.repo.MobRepo;

@SpringBootApplication
public class A6H2FileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(A6H2FileApplication.class, args);
		MobRepo r = run.getBean(MobRepo.class);
		r.save(new Mob(101, "iphone"));
	}

}
