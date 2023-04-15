
package com.portfolio.portfoliodb.model;

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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String empresa;
    private String puesto;
    private String descripcion;
    private String url_logo;
    private String fecha_desde;
    private String fecha_hasta;
    
    @ManyToOne
    @JoinColumn(name ="id_persona")
    private Persona pers;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, String descripcion, String url_logo, String fecha_desde, String fecha_hasta, Persona pers) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.url_logo = url_logo;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.pers = pers;
    }

      
    
    
}
