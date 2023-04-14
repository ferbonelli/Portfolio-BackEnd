
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String nombre;
    private String descripcion;
    private String url_proyecto;
    private String fecha_inicio;
    private String fecha_final;
    
    @ManyToOne
    @JoinColumn(name ="id_persona")
    private Persona pers;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String url_proyecto, String fecha_inicio, String fecha_final, Persona pers) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.pers = pers;
    }

    

    
    
    
    
    
}
