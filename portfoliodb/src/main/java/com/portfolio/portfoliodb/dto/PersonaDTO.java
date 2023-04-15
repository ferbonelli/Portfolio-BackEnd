
package com.portfolio.portfoliodb.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class PersonaDTO {
    
    private Long id_persona;
    private String nombre;
    private String apellido;
    private String dni;
    private String url_foto;
    private String acerca_de;
    private String profesion;
    private String correo_electronico;
    private String celular;
    private String fecha_Nac;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id_persona, String nombre, String apellido, String dni, String url_foto, String acerca_de, String profesion, String correo_electronico, String celular, String fecha_Nac) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.url_foto = url_foto;
        this.acerca_de = acerca_de;
        this.profesion = profesion;
        this.correo_electronico = correo_electronico;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }
    
    
    
    
    
}
