package com.fraternity.enrollRushee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fraternity.enrollRushee.model.Rushee;

public interface RusheeRepository extends JpaRepository<Rushee, Long> {
	
	List<Rushee> findByUserNameAndPassWord(String userName, String passWord);
	List<Rushee> findByLastName(String lastName);
//	@Modifying
//	@Query("update rushee r set r.acceptedBid = acceptedBid, r.fraternityName = :fraternity where r.firstName = :firstName, r.lastName = :lastName")
//	void updateRushee(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("acceptedBid") boolean acceptedBid,
//			@Param("fraternity") String fraternity);
	
}