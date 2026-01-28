package com.jsp.springdatajpa.repo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springdatajpa.entity.UserCricketer;

public interface UserCricketerJpaRepo extends JpaRepository<UserCricketer, Integer>{
	
	List<UserCricketer> findByJoinDateAfter(LocalDate date);
	
	List<UserCricketer> findByJoinDateBefore(LocalDate date);
	List<UserCricketer> findByjoinDateBetween(LocalDate date,LocalDate d2);
	
	List<UserCricketer> findByAgeLessThan(int age);
	List<UserCricketer> findByAgeLessThanEqual(int age);
	List<UserCricketer> findByAgeGreaterThan(int age);
	List<UserCricketer> findByAgeGreaterThanEqual(int age);
	


	List<UserCricketer> findByAgeIsNull();

	List<UserCricketer> findByAgeIsNotNull();

	
	
	
	
	List<UserCricketer> findByNameLike(String name);
	List<UserCricketer> findByNameNotLike(String name);
	List<UserCricketer> findByNameStartingWith(String name);
	List<UserCricketer> findByNameEndingWith(String name);
	List<UserCricketer> findByNameContaining(String name);
	List<UserCricketer> findByAgeOrderByNameDesc(int age, String name);
	List<UserCricketer> findByNameNot(String name);
	
	
	List<UserCricketer> findByActiveFalse();

	List<UserCricketer> findByActiveTrue();
	
	
	List<UserCricketer> findByAgeIn(Collection<Integer> ages);
	
	List<UserCricketer> findByAgeNotIn(Collection<Integer> ages);
	
	
	List<UserCricketer> findByNameIgnoreCase(String name);
	
	List<UserCricketer> findDistinctByNameAndName(String name,String name2);
	
}
