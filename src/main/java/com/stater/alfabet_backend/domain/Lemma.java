package com.stater.alfabet_backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lemma {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String beschrijving;
	String url;
	
	@ManyToOne
	Letter l;

	// Getters and setters
	

}
