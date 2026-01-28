package com.jsp.springdatajpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.jsp.springdatajpa.entity.Mobile;
import com.jsp.springdatajpa.entity.Mobile2;
import com.jsp.springdatajpa.repo.M2jpa;
import com.jsp.springdatajpa.repo.M2repo;
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

		
		
//		  ▗▄▄▖▗▄▄▖ ▗▖ ▗▖▗▄▄▄ ▗▄▄▖ ▗▄▄▄▖▗▄▄▖  ▗▄▖     ▗▄▄▖ ▗▄▄▖ ▗▄▄▄    ▗▄▄▄ ▗▄▄▄▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖▗▄▄▄▖▗▄▄▄     ▗▖  ▗▖▗▄▄▄▖▗▄▄▖ ▗▖ ▗▖ ▗▄▖ ▗▄▄▄  ▗▄▄▖
//		 ▐▌   ▐▌ ▐▌▐▌ ▐▌▐▌  █▐▌ ▐▌▐▌   ▐▌ ▐▌▐▌ ▐▌    ▐▌ ▐▌▐▌ ▐▌▐▌      ▐▌  █▐▌   ▐▌     █  ▐▛▚▖▐▌▐▌   ▐▌  █    ▐▛▚▞▜▌▐▌   ▐▌ ▐▌▐▌ ▐▌▐▌ ▐▌▐▌  █▐▌   
//		 ▐▌   ▐▛▀▚▖▐▌ ▐▌▐▌  █▐▛▀▚▖▐▛▀▀▘▐▛▀▘ ▐▌ ▐▌    ▐▛▀▘ ▐▛▀▚▖▐▛▀▀▘   ▐▌  █▐▛▀▀▘▐▛▀▀▘  █  ▐▌ ▝▜▌▐▛▀▀▘▐▌  █    ▐▌  ▐▌▐▛▀▀▘▐▛▀▚▖▐▛▀▜▌▐▌ ▐▌▐▌  █ ▝▀▚▖
//		 ▝▚▄▄▖▐▌ ▐▌▝▚▄▞▘▐▙▄▄▀▐▌ ▐▌▐▙▄▄▖▐▌   ▝▚▄▞▘    ▐▌   ▐▌ ▐▌▐▙▄▄▖   ▐▙▄▄▀▐▙▄▄▖▐▌   ▗▄█▄▖▐▌  ▐▌▐▙▄▄▖▐▙▄▄▀    ▐▌  ▐▌▐▙▄▄▖▐▌ ▐▌▐▌ ▐▌▝▚▄▞▘▐▙▄▄▀▗▄▄▞▘
		
//		bean.save(mobile);
//		bean.save(mobile2);
//		bean.save(mobile3);
//////////////////////////////////////////////////////////////////////////////////////
		
		
//		List<Mobile> list = Arrays.asList(
//				new Mobile(108, "opp0", 30407.0),
//				new Mobile(109, "realme", 9447.0),
//				new Mobile(110, "redmi", 4547.0),
//				new Mobile(111, "moto", 30407.0),
//				new Mobile(112, "huwai", 9447.0),
//				new Mobile(113, "poco", 4547.0)
//				);
//		bean.saveAll(list);
		
		
		M2repo m2 = run.getBean(M2repo.class);
//		List<Mobile2> mobiles = Arrays.asList(
//			    new Mobile2(1, "Apple", "iPhone 15", 79999),
//			    new Mobile2(2, "Samsung", "Galaxy S24", 74999),
//			    new Mobile2(3, "OnePlus", "OnePlus 12", 69999),
//			    new Mobile2(4, "Google", "Pixel 8", 65999),
//			    new Mobile2(5, "Xiaomi", "Mi 14", 59999),
//			    new Mobile2(6, "Realme", "GT 5 Pro", 49999),
//			    new Mobile2(7, "Vivo", "X100 Pro", 89999),
//			    new Mobile2(8, "Nothing", "Phone (2)", 44999)
//			);
//		m2.saveAll(mobiles);
		
		
		
		
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

		
		long count = bean.count();
		System.err.println(count);
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
		
//		  ▗▄▄▖ ▗▄▖ ▗▄▄▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖
//		 ▐▌   ▐▌ ▐▌▐▌ ▐▌ █    █  ▐▛▚▖▐▌▐▌   
//		  ▝▀▚▖▐▌ ▐▌▐▛▀▚▖ █    █  ▐▌ ▝▜▌▐▌▝▜▌
//		 ▗▄▄▞▘▝▚▄▞▘▐▌ ▐▌ █  ▗▄█▄▖▐▌  ▐▌▝▚▄▞▘
		
		MobileJpaRepo jpaRepo = run.getBean(MobileJpaRepo.class);
//		System.out.println("jpaRepo---------" + jpaRepo.getClass().getName());
//		
//		Sort by = Sort.by("price");
//		Sort ascending = by.ascending();
//		jpaRepo.findAll(ascending).forEach(System.out::println);
//		
//		System.out.println("Now printing the data in decOrder");
//		Sort by2 = Sort.by("name");
//		Sort descending = by2.descending();
//		jpaRepo.findAll(descending).forEach(System.out::println);
		
		
		
//		▗▄▄▖  ▗▄▖  ▗▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▖▗▄▄▄▖▗▄▄▄▖ ▗▄▖ ▗▖  ▗▖
//		▐▌ ▐▌▐▌ ▐▌▐▌     █  ▐▛▚▖▐▌▐▌ ▐▌ █    █  ▐▌ ▐▌▐▛▚▖▐▌
//		▐▛▀▘ ▐▛▀▜▌▐▌▝▜▌  █  ▐▌ ▝▜▌▐▛▀▜▌ █    █  ▐▌ ▐▌▐▌ ▝▜▌
//		▐▌   ▐▌ ▐▌▝▚▄▞▘▗▄█▄▖▐▌  ▐▌▐▌ ▐▌ █  ▗▄█▄▖▝▚▄▞▘▐▌  ▐▌
		
		PageRequest of = PageRequest.of(0, 3);

//		Page<Mobile> all = jpaRepo.findAll(of);
//		all.getContent().forEach(System.out::println);
//		
//		
//		
//		PageRequest of2 = PageRequest.of(1, 3,Sort.by("id"));
//		Page<Mobile> all2 = jpaRepo.findAll(of2);
//		all2.forEach(System.out::println);
//		
//		
//		PageRequest of3 = PageRequest.of(2, 3,Sort.by("price").descending());
//		Page<Mobile> all3 = jpaRepo.findAll(of3);
//		all3.forEach(System.out::println);
		
		
		
		
//		   ▗▖▗▄▄▖  ▗▄▖     ▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▖ ▗▖ ▗▄▖ ▗▄▄▄  ▗▄▄▖
//		   ▐▌▐▌ ▐▌▐▌ ▐▌    ▐▛▚▞▜▌▐▌     █  ▐▌ ▐▌▐▌ ▐▌▐▌  █▐▌   
//		   ▐▌▐▛▀▘ ▐▛▀▜▌    ▐▌  ▐▌▐▛▀▀▘  █  ▐▛▀▜▌▐▌ ▐▌▐▌  █ ▝▀▚▖
//		▗▄▄▞▘▐▌   ▐▌ ▐▌    ▐▌  ▐▌▐▙▄▄▖  █  ▐▌ ▐▌▝▚▄▞▘▐▙▄▄▀▗▄▄▞▘
		
//		1
//		List<Mobile> mobile = jpaRepo.findById(103);
//		System.err.println(mobile);

//		2
//		List<Mobile> byName = jpaRepo.findByName("redmi");
//		System.out.println(byName);
//		3
//		List<Mobile> byPriceLessThan = jpaRepo.findByPriceLessThan(5000.0);
//		byPriceLessThan.forEach(System.err::println);
//		4
//		jpaRepo.findByPriceGreaterThanEqual(5000.0).forEach(System.err::println);
		
		
//		5 
		/// for applying u must require brand and model
//		List<Mobile> findByLastnameOrFirstname(String name);
//		List<Mobile> byLastnameOrFirstname = jpaRepo.findBynameOrname("realme");
//		System.err.println(byLastnameOrFirstname);

		
		
		M2jpa m2jpa = run.getBean(M2jpa.class);
		M2jpa m2jpa2= run.getBean(M2jpa.class);
		
		System.err.println(m2jpa);
		System.err.println(m2jpa2);
//		System.err.println(bean);
		
		
//		List<Mobile2> bybrandOrmodel = m2jpa.findByBrandOrModel("iPhone 15");
		List<Mobile2> byBrandAndModel = m2jpa.findByBrandAndModel("Apple", "iPhone 15");
		List<Mobile2> byBrandOrModel = m2jpa.findByBrandOrModel("Apple", "iPhone 15");
		System.err.println(byBrandAndModel);
		System.err.println(byBrandOrModel);
		
		
		
		
////	┌─┐┬ ┬┌─┐┌┬┐┌─┐┌┬┐  ┌─┐ ┬ ┬┌─┐┬─┐┬ ┬
////	│  │ │└─┐ │ │ ││││  │─┼┐│ │├┤ ├┬┘└┬┘
////	└─┘└─┘└─┘ ┴ └─┘┴ ┴  └─┘└└─┘└─┘┴└─ ┴ 


		
//		m2jpa.getMobile2DataByName("brand").forEach(System.err::println);
//		m2jpa.getAllMobile2Data().forEach(System.err::println);
//		m2jpa.getAllMobile2ById(8).forEach(System.err::println);
//		m2jpa.giveAllMobile2().forEach(System.err::println);
		
		jpaRepo.getMobileDataByName("apple").forEach(System.err::println);
		jpaRepo.getAllMobileData().forEach(System.err::println);
		jpaRepo.getAllMobileById(102).forEach(System.err::println);
		jpaRepo.giveAllMobile().forEach(System.err::println);
		
		m2jpa.datatDe().forEach(System.out::println);
		Object ekchDe = m2jpa.ekchDe(7);
		System.out.println(ekchDe);
		
		Object doonDe = m2jpa.doonDe(100000.0,"Apple");
		System.err.println(doonDe);
	}

}
