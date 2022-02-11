package com.fraternity.enrollRushee.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.enrollRushee.api.RusheeApi;
import com.enrollRushee.api.model.EnrollRusheeBody;
import com.enrollRushee.api.model.EnrollRusheeInFraternityBody;
import com.enrollRushee.api.model.EnrollRusheeInFraternityResponse;
import com.enrollRushee.api.model.EnrollRusheeResponse;
import com.fraternity.enrollRushee.impl.StoreRushee;
import com.fraternity.enrollRushee.model.Rushee;

/*
 * The purpose of this class is to implement the first part of the API which
 * takes in the rushee and enrolls him to the database.
 */

@Controller
public class EnrollRusheeAdapter implements RusheeApi {
	
	@Autowired
	StoreRushee storeRushee;
	
	
	/**
	 * Take in the request and pass it on through to the database to enroll the customer
	 */
	
	@Override
	public ResponseEntity<List<EnrollRusheeResponse>> rusheeEnrollRusheePost(String firstName, String lastName, EnrollRusheeBody enrollRusheeBody) {
		EnrollRusheeResponse enrollRusheeResponse = new EnrollRusheeResponse();
		List<EnrollRusheeResponse> response = new ArrayList<>();
		enrollRusheeResponse = storeRushee.takeInRusheeInformation(firstName, lastName, enrollRusheeBody);
		response.add(enrollRusheeResponse);
		
		return (ResponseEntity<List<EnrollRusheeResponse>>) response;
	}
	
	@Override
	public ResponseEntity<List<EnrollRusheeInFraternityResponse>> rusheeEnrollRusheeInFraternityPost(String firstName, String lastName, EnrollRusheeInFraternityBody enrollRusheeInFraternityBody) {
			List<Rushee> rushee = storeRushee.lookUpRushee(firstName, lastName);
			
			
			
		return null;
	}

}
