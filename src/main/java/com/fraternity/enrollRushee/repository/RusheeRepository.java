package com.fraternity.enrollRushee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fraternity.enrollRushee.model.Rushee;

public interface RusheeRepository extends CrudRepository<Rushee, Long> {
	
	

}
