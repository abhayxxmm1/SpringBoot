package com.jsp.springdatajpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.jsp.springdatajpa.entity.Mobile;
import com.jsp.springdatajpa.repo.MobileJpaRepo;
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
//////////////////////////////////////////////////////////////////////////////////////
		
		
//		List<Mobile> list = Arrays.asList(new Mobile(104, "linux", 34407.0),new Mobile(105, "mac", 3445447.0),new Mobile(106, "lol", 344547.0));
//		bean.saveAll(list);
//////////////////////////////////////////////////////////////////////////////////////
		
//		Optional<Mobile> optional = bean.findById(101);
//		System.out.println(optional);
//		Mobile mobile = optional.get();
//		System.out.println(mobile);
		
//		boolean existsById = bean.existsById(106);
//		System.out.println(existsById);
		
//		Iterable<Mobile> all = bean.findAll();
//		all.forEach(System.out :: println);		/// wow
//		
//		for (Mobile m : all) {
//			System.out.println(m);
//		}
		
//////////////////////////////////////////////////////////////////////////////////////
		List<Integer> asList = Arrays.asList(101,102,103,104,105,106);
///		Iterable<Mobile> allById = bean.findAllById(asList);
///		allById.forEach(System.out::println);
		bean.findAllById(asList).forEach(System.out::println);
		
//		for (Integer i : asList) {
//			System.out.println(i);
//		}
//////////////////////////////////////////////////////////////////////////////////////

		
//		long count = bean.count();
//		System.err.println(count);
//////////////////////////////////////////////////////////////////////////////////////

		
//		bean.deleteById(105);
//////////////////////////////////////////////////////////////////////////////////////


//		DeleteEntity
//		bean.delete(new Mobile(106, "lol", 344547.0));
		
		
//////////////////////////////////////////////////////////////////////////////////////

		
//		bean.deleteAll();
//////////////////////////////////////////////////////////////////////////////////////
		
		
//		List<Mobile> list = Arrays.asList(new Mobile(104, "linux", 34407.0),new Mobile(105, "mac", 3445447.0),new Mobile(106, "lol", 344547.0));
//		bean.deleteAll(list);
//////////////////////////////////////////////////////////////////////////////////////
		
		
		
		MobileJpaRepo jpaRepo = run.getBean(MobileJpaRepo.class);
		System.out.println("jpaRepo---------" + jpaRepo.getClass().getName());
		
		Sort by = Sort.by("price");
		Sort ascending = by.ascending();
		jpaRepo.findAll(ascending).forEach(System.out::println);
		
		System.out.println("Now printing the data in decOrder");
		Sort by2 = Sort.by("name");
		Sort descending = by2.descending();
		jpaRepo.findAll(descending).forEach(System.out::println);
	}

}
