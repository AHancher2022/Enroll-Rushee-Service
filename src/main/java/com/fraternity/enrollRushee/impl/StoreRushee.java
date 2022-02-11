package com.fraternity.enrollRushee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollRushee.api.model.EnrollRusheeBody;
import com.fraternity.enrollRushee.model.Rushee;
import com.fraternity.enrollRushee.repository.RusheeRepository;
import com.enrollRushee.api.model.EnrollRusheeResponse;

@Service
public class StoreRushee {

	@Autowired
	private RusheeRepository rusheeRepository;
	
	/*
	 * Takes in rushee information and converts it to the rushee object to be stored
	 */
	
	public EnrollRusheeResponse takeInRusheeInformation(String firstName, String lastName, EnrollRusheeBody enrollRusheeBody) {
		
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
		EnrollRusheeResponse enrollRusheeResponse = new EnrollRusheeResponse();
		enrollRusheeResponse.setResponse("Successfuly Loaded Response");
		
		return enrollRusheeResponse;
	}
	
	private void saveRusheeInformation(Rushee rushee) {
		rusheeRepository.save(rushee);
	}
	/**
	 * Check to see if rushee is in the table
	 */

	
	/**
	 * This method will look up the rushee by there first and last name
	 */
	
	public List<Rushee> lookUpRushee(String firstName, String lastName) {
		return rusheeRepository.findRusheeByName(firstName, lastName);
		
	}
	
	
	
	
	
	
}
