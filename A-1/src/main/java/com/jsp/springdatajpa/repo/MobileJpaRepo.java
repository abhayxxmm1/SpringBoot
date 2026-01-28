package com.jsp.springdatajpa.repo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springdatajpa.entity.Mobile;

public interface MobileJpaRepo extends JpaRepository<Mobile, Integer>{
	
//	1
	java.util.List<Mobile> findById(int id);
//	2
	List<Mobile> findByName(String name);
//	3
//	List<Mobile> findByFirstnameIgnoreCase(String name);
//	4
//	List<Mobile> findByLastnameAndFirstname(String name);
//	5
//	List<Mobile> findByLastnameOrFirstname(String name, int id);
//	6
//	List<Mobile> findByFirstname(String name);
//	List<Mobile> findByFirstnameIs(String name);
//	List<Mobile> findByFirstnameEquals(String name);
	
//	7
//	List<Mobile> findByStartDateBetween(LocalDate date);
	
//	8
	List<Mobile> findByPriceLessThan(double price);
//	9
	List<Mobile> findByPriceLessThanEqual(double price);
//	10
	List<Mobile> findByPriceGreaterThan(double price);
//	11
	List<Mobile> findByPriceGreaterThanEqual(double price);
//	12
//	List<Mobile> findByStartDateAfter(LocalDate date);
//	13
//	List<Mobile> findByStartDateBefore(LocalDate date);
	
//	14
//	List<Mobile> findByAge(Is)Null
//	15
//	List<Mobile> findByAge(Is)NotNull
//	16
//	List<Mobile> findByFirstnameLike(String name);
	
//	17
//	List<Mobile> findByFirstnameNotLike(String name);
//	18
//	List<Mobile> findByFirstnameNotLike(String name);
//	19
//	List<Mobile> findByFirstnameStartingWith(String name) ;
	
//	20
//	List<Mobile> findByFirstnameEndingWith(String name);
//	21
//	List<Mobile> findByFirstnameContaining(String name);
//	22
//	List<Mobile> findByAgeOrderByLastnameDesc(int age, String name);
//	23
//	List<Mobile> findByLastnameNot(String name);
	
//	24
//	List<Mobile> findByAgeIn(Collection<Mobile> ages);
//	25
//	List<Mobile> findByAgeNotIn(Collection<Mobile> ages);
	
//	26
//	boolean findByActiveTrue();
//	27
//	boolean findByActiveFalse();
//	28
//	List<Mobile> findByFirstnameIgnoreCase(String name);
	
	
////┌─┐┬ ┬┌─┐┌┬┐┌─┐┌┬┐  ┌─┐ ┬ ┬┌─┐┬─┐┬ ┬
////│  │ │└─┐ │ │ ││││  │─┼┐│ │├┤ ├┬┘└┬┘
////└─┘└─┘└─┘ ┴ └─┘┴ ┴  └─┘└└─┘└─┘┴└─ ┴ 
	
	List<Mobile> getMobileDataByName(String name);
	
	@Query(value="From Mobile") 	/// custom hql query
	List<Mobile> getAllMobileData();
	
	@Query(value="From Mobile m WHERE m.id=?1") 	/// custom hql query
	List<Mobile> getAllMobileById(@Param("id") int id);
	
	@NativeQuery(value= "SELECT * FROM Mobile")
	List<Mobile> giveAllMobile();
	
}
