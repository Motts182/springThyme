package com.test.possumus.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private Integer tiempo;

//    @Override
//    public String toString(){
//        return this.id.toString();
//    }

//    @Override
//    public boolean equals(Object o) {
//        Skill skill = (Skill) o;
//        return  this.id != null && this.id.equals(skill.getId());
//    }

}
