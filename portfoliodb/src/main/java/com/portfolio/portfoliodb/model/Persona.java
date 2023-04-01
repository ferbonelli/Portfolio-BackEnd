
package com.portfolio.portfoliodb.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;
    
    @Basic
    private String nombre;
    private String apellido;
    private String dni;
    private String url_foto;
    private String acerca_de;
    private String correo_electronico;
    private String celular;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_Nac;
    
        
    
    @OneToMany(mappedBy="pers")
    List<Habilidad> listaHabilidades;
    
    @OneToMany(mappedBy="pers")
    List<Habilidad> listaEducacion;

    @OneToMany(mappedBy="pers")
    List<Habilidad> listaExperiencia;
    
    @OneToMany(mappedBy="pers")
    List<Habilidad> listaProyecto;
    
    @OneToOne(mappedBy="pers")
    private Usuario username;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String dni, String url_foto, String acerca_de, String correo_electronico, String celular, Date fecha_Nac, List<Habilidad> listaHabilidades, List<Habilidad> listaEducacion, List<Habilidad> listaExperiencia, List<Habilidad> listaProyecto, Usuario username) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.url_foto = url_foto;
        this.acerca_de = acerca_de;
        this.correo_electronico = correo_electronico;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
        this.listaHabilidades = listaHabilidades;
        this.listaEducacion = listaEducacion;
        this.listaExperiencia = listaExperiencia;
        this.listaProyecto = listaProyecto;
        this.username = username;
    }

    

    
    
    
    
    
}
