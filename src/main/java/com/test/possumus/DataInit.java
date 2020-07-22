package com.test.possumus;

import com.test.possumus.model.Candidato;
import com.test.possumus.model.Contacto;
import com.test.possumus.model.Skill;
import com.test.possumus.repository.CandidatoRepository;
import com.test.possumus.repository.ContactoRepository;
import com.test.possumus.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
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

    @PostConstruct
    public void init(){

//        Contacto contacto1 = Contacto.builder()
//                .email("mnd.matias.diaz@gmail.com")
//                .telefono("154123122")
//                .build();
//
//        contactoRepository.save(contacto1);

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
                .contacto(Contacto.builder().build())
                .build();

        Candidato candidato1 = Candidato.builder()
                .nombreCandidato("Canela ")
                .apellidoandidato("Nuñez")
                .fechaNacCandidato("1989-02-06")
                .skills(Arrays.asList(skill1))
                .contacto(Contacto.builder().build())
                .build();

        Candidato candidato2 = Candidato.builder()
                .nombreCandidato("Cubo ")
                .apellidoandidato("Diaz")
                .fechaNacCandidato("1989-08-10")
                .skills(skillsList)
                .contacto(new Contacto())
                .build();

        Candidato candidato3 = Candidato.builder()
                .nombreCandidato("Pepe ")
                .apellidoandidato("Hon")
                .fechaNacCandidato("1910-01-21")
                .skills(Arrays.asList(skill3))
                .contacto(Contacto.builder().build())
                .build();

        candidatoRepository.save(candidato);
        candidatoRepository.save(candidato1);
        candidatoRepository.save(candidato2);
        candidatoRepository.save(candidato3);

    }
}
