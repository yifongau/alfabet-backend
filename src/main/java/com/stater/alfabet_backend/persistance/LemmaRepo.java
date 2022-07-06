package com.stater.alfabet_backend.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.stater.alfabet_backend.domain.Lemma;

@Component
public interface LemmaRepo extends JpaRepository<Lemma, Long> {

}
