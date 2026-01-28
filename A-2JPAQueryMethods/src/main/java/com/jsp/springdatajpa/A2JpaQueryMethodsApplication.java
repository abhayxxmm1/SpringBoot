package com.jsp.springdatajpa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springdatajpa.entity.UserCricketer;
import com.jsp.springdatajpa.repo.UserCricketerJpaRepo;
import com.jsp.springdatajpa.repo.UserCricketerRepository;


@SpringBootApplication
public class A2JpaQueryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(A2JpaQueryMethodsApplication.class, args);
		
		UserCricketerRepository u1 = run.getBean(UserCricketerRepository.class);
			
//		List<UserCricketer> list = Arrays.asList(
//			    new UserCricketer(0, "Virat Kohli", 35, LocalDate.of(2011, 8, 15), true),
//			    new UserCricketer(0, "Rohit Sharma", 37, LocalDate.of(2010, 5, 20), true),
//			    new UserCricketer(0, "MS Dhoni", 42, LocalDate.of(2005, 7, 7), false),
//			    new UserCricketer(0, "Ravindra Jadeja", 36, LocalDate.of(2012, 2, 10), true),
//			    new UserCricketer(0, "Jasprit Bumrah", 31, LocalDate.of(2016, 1, 6), true),
//			    new UserCricketer(0, "Sachin Tendulkar", 50, LocalDate.of(1989, 11, 15), false),
//			    new UserCricketer(0, "Shubman Gill", 24, LocalDate.of(2019, 9, 28), true),
//			    new UserCricketer(0, "KL Rahul", 32, LocalDate.of(2014, 12, 26), true),
//			    new UserCricketer(0, "Hardik Pandya", 30, LocalDate.of(2015, 10, 16), true),
//			    new UserCricketer(0, "Bhuvneshwar Kumar", 34, LocalDate.of(2012, 12, 30), false),
//			    new UserCricketer(0, "Yuzvendra Chahal", 33, LocalDate.of(2016, 6, 11), true),
//			    new UserCricketer(0, "Rishabh Pant", 26, LocalDate.of(2017, 2, 1), true),
//			    new UserCricketer(0, "Shikhar Dhawan", 38, LocalDate.of(2010, 10, 20), false),
//			    new UserCricketer(0, "Suryakumar Yadav", 33, LocalDate.of(2014, 7, 25), true),
//			    new UserCricketer(0, "Mohammed Shami", 34, LocalDate.of(2013, 1, 23), true),
//			    new UserCricketer(0, "Ishant Sharma", 35, LocalDate.of(2007, 5, 25), false),
//			    new UserCricketer(0, "Cheteshwar Pujara", 36, LocalDate.of(2010, 2, 17), false),
//			    new UserCricketer(0, "Ajinkya Rahane", 35, LocalDate.of(2011, 3, 22), false),
//			    new UserCricketer(0, "Axar Patel", 30, LocalDate.of(2014, 6, 15), true),
//			    new UserCricketer(0, "Washington Sundar", 24, LocalDate.of(2017, 12, 13), true)
//			);


//		u1.saveAll(list);
		
//		u1.deleteAll();
		
		UserCricketerJpaRepo uCJ = run.getBean(UserCricketerJpaRepo.class);
		
		uCJ.findByJoinDateAfter(LocalDate.of(2012, 2, 10)).forEach(System.err::println);
		
		uCJ.findByJoinDateBefore(LocalDate.of(2016, 1, 6)).forEach(System.err::println);
		uCJ.findByjoinDateBetween(LocalDate.of(2010, 5, 20), LocalDate.of(2019, 9, 28)).forEach(System.err::println);
		
		uCJ.findByAgeLessThan(30).forEach(System.err::println);
		uCJ.findByAgeLessThanEqual(37).forEach(System.err::println);
		uCJ.findByAgeGreaterThan(37).forEach(System.err::println);
		uCJ.findByAgeGreaterThanEqual(37).forEach(System.err::println);
		
		uCJ.findByNameLike("Virat Kohli").forEach(System.err::println);
		uCJ.findByNameNotLike("Virat Kohli").forEach(System.err::println);
		uCJ.findByNameStartingWith("Rohit").forEach(System.err::println);
		uCJ.findByNameEndingWith("Bumrah").forEach(System.err::println);
		
		uCJ.findByNameContaining("a").forEach(System.err::println);
		uCJ.findByAgeOrderByNameDesc(37, "Virat Kohli").forEach(System.err::println);
		uCJ.findByNameNot("Virat Kohli").forEach(System.err::println);
		uCJ.findByNameIgnoreCase("virat kohli").forEach(System.err::println);

		uCJ.findByAgeIsNull().forEach(System.err::println);
		uCJ.findByAgeIsNotNull().forEach(System.err::println);
		uCJ.findByActiveFalse().forEach(System.err::println);
		uCJ.findByActiveTrue().forEach(System.err::println);
		
		
		
		uCJ.findByAgeIn(Arrays.asList(31, 30, 32, 33, 34)).forEach(System.err::println);
		uCJ.findByAgeNotIn(Arrays.asList(31, 30, 32, 33, 34)).forEach(System.err::println);
		
		
		uCJ.findDistinctByNameAndName("Virat Kohli", "Virat Kohli").forEach(System.err::println);
		
	}

}
