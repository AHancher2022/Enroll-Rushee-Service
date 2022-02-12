package com.fraternity.enrollRushee.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollRushee.api.model.EnrollRusheeBody;
import com.enrollRushee.api.model.EnrollRusheeInFraternityBody;
import com.enrollRushee.api.model.EnrollRusheeInFraternityResponse;
import com.fraternity.enrollRushee.model.Rushee;
import com.fraternity.enrollRushee.repository.RusheeRepository;

@Service
public class StoreRushee {

	@Autowired
	private RusheeRepository rusheeRepository;
	
	/*
	 * Takes in rushee information and converts it to the rushee object to be stored
	 */
	
	public void takeInRusheeInformation(String firstName, String lastName, EnrollRusheeBody enrollRusheeBody) {
		
		Rushee rushee = new Rushee();
		rushee.setFirstName(firstName);
		rushee.setLastName(lastName);
		rushee.setAge(enrollRusheeBody.getAge());
		rushee.setHometown(enrollRusheeBody.getHometown());
		rushee.setMajor(enrollRusheeBody.getMajor());
		rushee.setState(enrollRusheeBody.getState());
		rushee.setAcceptBid(false);
		rushee.setFraternityTheyAccepted(null);
		saveRusheeInformation(rushee);
		
	}
	
	private void saveRusheeInformation(Rushee rushee) {
		
		rushee = rusheeRepository.save(rushee);
	}
	/**
	 * Check to see if rushee is in the table
	 */

	
	/**
	 * This method will look up the rushee by there first and last name
	 */
	
	public EnrollRusheeInFraternityResponse enrollRusheeInFraternity(String firstName, String lastName, EnrollRusheeInFraternityBody eb) {
		Rushee rushee = new Rushee();
		rushee.setFirstName(firstName);
		rushee.setLastName(lastName);
		rushee.setAcceptBid(eb.getAcceptBid());
		rushee.setFraternityTheyAccepted(eb.getFraternity());
		return null;
	}
	
	
	
	
	
}
