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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Letter getL() {
		return l;
	}

	public void setL(Letter l) {
		this.l = l;
	}

	// Getters and setters
	

}
