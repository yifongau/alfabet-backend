package com.yifongau.alfabet_backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yifongau.alfabet_backend.domain.Lemma;
import com.yifongau.alfabet_backend.persistance.AlfabetService;

@RestController
public class AlfabetEndPoints {
	
	@Autowired
	AlfabetService as;
	
	
	// Lemmafuncties
	@GetMapping("lemma")
	public Iterable<Lemma> allLemma(){
		return as.allLemma();
	}
	
	@PostMapping("lemma")
	public void newLemma(@RequestBody Lemma l){
		as.newLemma(l);
	}
	
	

}
