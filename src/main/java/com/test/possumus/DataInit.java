package com.test.possumus;

import com.test.possumus.model.*;
import com.test.possumus.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInit {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private ContactoRepository contactoRepository;

    @Autowired
    private HistorialRepository historialRepository;

    @Autowired
    private EmpleoRepository empleoRepository;

    @PostConstruct
    public void init(){

        Skill skill1 = Skill.builder()
                .descripcion("Java").build();

        Skill skill2 = Skill.builder()
                .descripcion("C#").build();

        Skill skill3 = Skill.builder()
                .descripcion("Js").build();

        List<Skill> skillsList = Arrays.asList(skill3,skill2);

        skillRepository.save(skill1);
        skillRepository.save(skill2);
        skillRepository.save(skill3);

        Candidato candidato = Candidato.builder()
                .nombreCandidato("Matias ")
                .apellidoandidato("Diaz")
                .fechaNacCandidato("2020-07-12")
                .skills(skillsList)
                .contacto(Contacto.builder()
                        .telefono("42460201")
                        .email("madas.s@gmail.comm")
                        .build())
                .empleos(Arrays.asList(Empleo.builder().nombreEmpresa("GlobalLogic").build()))
                .historialLaboral(HistorialLaboral.builder().build())
                .build();


        Candidato candidato1 = Candidato.builder()
                .nombreCandidato("Canela ")
                .apellidoandidato("Nuñez")
                .fechaNacCandidato("1989-02-06")
                .skills(Arrays.asList(skill1))
                .contacto(Contacto.builder()
                        .telefono("4246001662")
                        .email("cacaas.s@gmail.comm")
                        .build())
                .historialLaboral(HistorialLaboral.builder().build())
                .build();

        Candidato candidato2 = Candidato.builder()
                .nombreCandidato("Cubo ")
                .apellidoandidato("Diaz")
                .fechaNacCandidato("1989-08-10")
                .skills(skillsList)
                .contacto(Contacto.builder()
                        .telefono("422244444")
                        .email("irri.aaas@gmail.comm")
                        .build())
                .historialLaboral(HistorialLaboral.builder().build())
                .empleos(Arrays.asList(Empleo.builder().nombreEmpresa("GLOBANT").build()))
                .build();

        Candidato candidato3 = Candidato.builder()
                .nombreCandidato("Pepe ")
                .apellidoandidato("Hon")
                .fechaNacCandidato("1910-01-21")
                .skills(Arrays.asList(skill3))
                .contacto(Contacto.builder()
                        .telefono("121212")
                        .email("madas.mddd.s@bbt.comm")
                        .build())
                .historialLaboral(HistorialLaboral.builder().build())
                .build();

        candidatoRepository.save(candidato);
        candidatoRepository.save(candidato1);
        candidatoRepository.save(candidato2);
        candidatoRepository.save(candidato3);

    }
}
