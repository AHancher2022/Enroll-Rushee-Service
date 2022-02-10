package com.fraternity.enrollRushee.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.enrollRushee.api.EnrollRusheeApi;
import com.enrollRushee.api.model.EnrollRusheeBody;
import com.enrollRushee.api.model.EnrollRusheeResponse;
import com.fraternity.enrollRushee.impl.StoreRushee;

/*
 * The purpose of this class is to implement the first part of the API which
 * takes in the rushee and enrolls him to the database.
 */

@Controller
public class EnrollRusheeAdapter implements EnrollRusheeApi {
	
	@Autowired
	StoreRushee storeRushee;
	
	
	/**
	 * Take in the request and pass it on through to the database to enroll the customer
	 */
	
	@Override
	public ResponseEntity<List<EnrollRusheeResponse>> enrollRusheePost(String firstName, String lastName, EnrollRusheeBody enrollRusheeBody) {
			storeRushee.takeInRusheeInformation(firstName, lastName, enrollRusheeBody);
	
		
		return null;
	}

}
