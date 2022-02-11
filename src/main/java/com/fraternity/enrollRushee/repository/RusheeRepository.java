package com.fraternity.enrollRushee.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fraternity.enrollRushee.model.Rushee;

public interface RusheeRepository extends JpaRepository<Rushee, Long> {
	
	
	List<Rushee> findRusheeByName(String firstName, String lastName);
	
	@Modifying
	@Query("update rushee r set r.acceptedBid = acceptedBid, r.fraternityName = :fraternity where r.firstName = :firstName, r.lastName = :lastName")
	void updateRushee(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("acceptedBid") boolean acceptedBid,
			@Param("fraternity") String fraternity);
	
}
