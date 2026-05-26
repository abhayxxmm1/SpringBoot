package com.jsp.register.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.register.entity.Person;

public interface PersonRepo extends JpaRepository<Person, String>{

	Optional<Person> findByFnameIgnoreCaseAndLnameIgnoreCaseAndPassword(
		    String fname, String lname, String password);

}

