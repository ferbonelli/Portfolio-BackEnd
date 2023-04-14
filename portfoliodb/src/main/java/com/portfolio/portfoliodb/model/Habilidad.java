
package com.portfolio.portfoliodb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombre;
    private int porcentaje;
    
    @ManyToOne
    @JoinColumn(name ="id_persona")
    private Persona pers;

    public Habilidad() {
    }

    public Habilidad(Long id, String nombre, int porcentaje, Persona pers) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.pers = pers;
    }

    
       
    
    
    
}
