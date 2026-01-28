package com.jsp.springdatajpa.repo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springdatajpa.entity.Mobile;
import com.jsp.springdatajpa.entity.Mobile2;

public interface M2jpa extends JpaRepository<Mobile2, Integer>{
	
	List<Mobile2> findByBrandOrModel(String brand,String model);
	
	List<Mobile2> findByBrandAndModel(String brand,String model);
	
////	┌─┐┬ ┬┌─┐┌┬┐┌─┐┌┬┐  ┌─┐ ┬ ┬┌─┐┬─┐┬ ┬
////	│  │ │└─┐ │ │ ││││  │─┼┐│ │├┤ ├┬┘└┬┘
////	└─┘└─┘└─┘ ┴ └─┘┴ ┴  └─┘└└─┘└─┘┴└─ ┴ 
//	
//	List<Mobile2> getMobile2DataByName(String name);
//	
	@Query(value="From Mobile2") 	/// custom hql query
	List<Mobile2> datatDe();
//	
	@Query(value="From Mobile2 m WHERE m.id=?1") 	/// custom hql query
	Object ekchDe(@Param("id") int id);
	
	@Query(value="From Mobile2 m WHERE m.price<?1and m.brand=?2") 	/// custom hql query
	Object doonDe(@Param("price") double id, @Param("brand") String name);
//	
	@NativeQuery(value= "SELECT * FROM Mobile2")
	List<Mobile2> giveAllMobile2();
	
	
	
}
