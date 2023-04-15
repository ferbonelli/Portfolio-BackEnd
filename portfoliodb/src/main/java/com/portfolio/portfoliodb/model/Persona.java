
package com.portfolio.portfoliodb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
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
    private String profesion;
    private String correo_electronico;
    private String celular;
    private String fecha_Nac;
    
        
    @JsonIgnore
    @OneToMany(mappedBy="pers",fetch=FetchType.LAZY)
    List<Habilidad> listaHabilidades;
    
    @JsonIgnore
    @OneToMany(mappedBy="pers",fetch=FetchType.LAZY)
    List<Educacion> listaEducacion;

    @JsonIgnore
    @OneToMany(mappedBy="pers",fetch=FetchType.LAZY)
    List<Experiencia> listaExperiencia;
    
    @JsonIgnore
    @OneToMany(mappedBy="pers",fetch=FetchType.LAZY)
    List<Proyecto> listaProyecto;
    
    @JsonIgnore
    @OneToOne(mappedBy="pers",fetch=FetchType.LAZY)
    private Usuario username;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String dni, String url_foto, String acerca_de, String profesion, String correo_electronico, String celular, String fecha_Nac, List<Habilidad> listaHabilidades, List<Educacion> listaEducacion, List<Experiencia> listaExperiencia, List<Proyecto> listaProyecto, Usuario username) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.url_foto = url_foto;
        this.acerca_de = acerca_de;
        this.profesion = profesion;
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
