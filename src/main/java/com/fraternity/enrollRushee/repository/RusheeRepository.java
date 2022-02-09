package com.fraternity.enrollRushee.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fraternity.enrollRushee.model.Rushee;

public interface RusheeRepository extends JpaRepository<Rushee, Long> {
	
	
	List<Rushee> findByLastName(String lastName);

}
