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
                .nombreCandidato("Matias ")
                .apellidoandidato("Diaz")
                .fechaNacCandidato("2020-07-12")
                .build();

        Candidato candidato1 = Candidato.builder()
                .nombreCandidato("Canela ")
                .apellidoandidato("Nuñez")
                .fechaNacCandidato("1989-02-06")
                .build();

        Candidato candidato2 = Candidato.builder()
                .nombreCandidato("Cubo ")
                .apellidoandidato("Diaz")
                .fechaNacCandidato("1989-08-10")
                .build();

        Candidato candidato3 = Candidato.builder()
                .nombreCandidato("Pepe ")
                .apellidoandidato("Hon")
                .fechaNacCandidato("1910-01-21")
                .build();

        candidatoRepository.save(candidato);
        candidatoRepository.save(candidato1);
        candidatoRepository.save(candidato2);
        candidatoRepository.save(candidato3);
    }
}
