
package com.portfolio.portfoliodb.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String institucion;
    private String titulo;
    private String url_logoinst;
    
    
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_final;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String titulo, String url_logoinst, Date fecha_inicio, Date fecha_final) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.url_logoinst = url_logoinst;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }
    
    
    
    
    
}
