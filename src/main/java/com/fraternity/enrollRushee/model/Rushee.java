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

	private  String firstName, lastName;
	private  String age, major, hometown, state;
}
