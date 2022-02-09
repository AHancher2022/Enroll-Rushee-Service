package com.fraternity.enrollRushee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollRushee.api.model.EnrollRusheeBody;
import com.fraternity.enrollRushee.model.Rushee;
import com.fraternity.enrollRushee.repository.RusheeRepository;


@Service
public class StoreRushee {

	@Autowired
	private RusheeRepository rusheeRepository;
	
	@Autowired
	Rushee rushee;
	
	/*
	 * Takes in rushee information and converts it to the rushee object to be stored
	 */
	
	public String takeInRusheeInformation(String firstName, String lastName, EnrollRusheeBody enrollRusheeBody) {
		
		rushee.setFirstName(firstName);
		rushee.setLastName(lastName);
		rushee.setAge(enrollRusheeBody.getAge());
		rushee.setHometown(enrollRusheeBody.getHometown());
		rushee.setMajor(enrollRusheeBody.getMajor());
		rushee.setState(enrollRusheeBody.getState());
		
		saveRusheeInformation(rushee);
		
		return null;
	}
	
	private void saveRusheeInformation(Rushee rushee) {
		rusheeRepository.save(rushee);
	}
	
	
	
	
	
	
}
