package com.test.possumus;

import com.test.possumus.model.Candidato;
import com.test.possumus.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInit {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @PostConstruct
    public void init(){
        Candidato candidato = Candidato.builder()
                .nombreCandidato("Matias Diaz").build();

        Candidato candidato1 = Candidato.builder()
                .nombreCandidato("Leandro Diaz").build();

        Candidato candidato2 = Candidato.builder()
                .nombreCandidato("Facundo Murcia").build();

        Candidato candidato3 = Candidato.builder()
                .nombreCandidato("Cubo Diaz").build();

        candidatoRepository.save(candidato);
        candidatoRepository.save(candidato1);
        candidatoRepository.save(candidato2);
        candidatoRepository.save(candidato3);
    }
}
