
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
public class Experiencia_laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String empresa;
    private String descripcion;
    private String url_logo;
    private Boolean es_actual;
    private String fecha_desde;
    private String fecha_hasta;
    
    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name ="id_persona")
    private Persona pers;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id, String empresa, String descripcion, String url_logo, Boolean es_actual, String fecha_desde, String fecha_hasta, Persona pers) {
        this.id = id;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.url_logo = url_logo;
        this.es_actual = es_actual;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.pers = pers;
    }

    

    
    
    
    
}
