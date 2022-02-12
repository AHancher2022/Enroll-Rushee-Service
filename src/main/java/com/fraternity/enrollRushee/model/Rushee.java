package com.fraternity.enrollRushee.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@Setter
@Getter
public class Rushee {

	private @Id @GeneratedValue Long id;
	private String userName, passWord;
	private  String firstName, lastName;
	private  String age, major, hometown, state;
	private boolean acceptBid;
	private String fraternityTheyAccepted;
	
	//Need to know where the rushee has accepted his bid
	//Im going to make the key for this based on a couple different things. 
	//this is going to be the first complicated part, because we need to be able to look up the rushee
	//and assign him to the correct fratesrnity and the correct school. 
	// IE if(acceptBid becomes true, then we need to know where
	
}
