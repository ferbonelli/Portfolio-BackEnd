
package com.portfolio.portfoliodb.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
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
    
    
    @Temporal(TemporalType.DATE)
    private Date fecha_desde;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_hasta;
    
    @ManyToOne
    private Persona pers;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id, String empresa, String descripcion, String url_logo, Boolean es_actual, Date fecha_desde, Date fecha_hasta, Persona pers) {
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
