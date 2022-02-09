package com.fraternity.enrollRushee.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class Rushee {

	private @Id @GeneratedValue Long id;

	private final String firstName, lastName;
	private final String age, major, hometown, state;
}
