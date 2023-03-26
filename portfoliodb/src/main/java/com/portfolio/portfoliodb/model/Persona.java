
package com.portfolio.portfoliodb.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String url_foto;
    private String acerca_de;
    private String correo_electronico;
    private String celular;
    private Date fecha_Nac;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String dni, String url_foto, String acerca_de, String correo_electronico, String celular, Date fecha_Nac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.url_foto = url_foto;
        this.acerca_de = acerca_de;
        this.correo_electronico = correo_electronico;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }
    
    
    
    
}
