
package com.portfolio.portfoliodb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Basic;
import javax.persistence.Entity;
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String institucion;
    private String titulo;
    private String url_logoinst;
    private String fecha_inicio;
    private String fecha_final;
    
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name ="id_persona")
    private Persona pers;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String titulo, String url_logoinst, String fecha_inicio, String fecha_final, Persona pers) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.url_logoinst = url_logoinst;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.pers = pers;
    }

    
    
    
}
