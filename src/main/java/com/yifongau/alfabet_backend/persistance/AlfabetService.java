package com.yifongau.alfabet_backend.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yifongau.alfabet_backend.domain.Lemma;

@Service
public class AlfabetService {
	
	@Autowired
	LemmaRepo lemmarepo;
	LetterRepo letterrepo;
	
	
	// Lemmafuncties
	public void newLemma(Lemma l) {
		Lemma lemma = l;
		lemmarepo.save(lemma);
	}
	
	public Iterable<Lemma> allLemma() {
		return lemmarepo.findAll();
	}

}
