
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String nombre;
    private String descripcion;
    private String url_proyecto;
    
    
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_final;
    
    @ManyToOne
    private Persona pers;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String url_proyecto, Date fecha_inicio, Date fecha_final, Persona pers) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.pers = pers;
    }

    
    
    
    
    
}
