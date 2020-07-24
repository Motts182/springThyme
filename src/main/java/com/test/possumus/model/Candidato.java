package com.test.possumus.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
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
public class Candidato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="contacto_id", unique = true)
    private Contacto contacto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="historial_id", unique = true)
    private HistorialLaboral historialLaboral;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="empleos_id", unique = true)
    private List<Empleo> empleos;

}
