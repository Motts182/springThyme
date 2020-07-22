package com.test.possumus.model;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Entity
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreCandidato;
    private String apellidoandidato;
    private String fechaNacCandidato;

    //Skill
    @ManyToMany
    @JoinTable(name = "candidato_skills"
        ,joinColumns = @JoinColumn(name = "candidato_id")
        ,inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<Skill> skills;

    //Contacto
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="contacto_id", unique = true)
    private Contacto contacto;


    //
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="historial_id", unique = true)
    private HistorialLaboral historialLaboral;
}
