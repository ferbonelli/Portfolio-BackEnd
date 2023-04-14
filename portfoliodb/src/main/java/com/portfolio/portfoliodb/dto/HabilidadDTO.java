
package com.portfolio.portfoliodb.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class HabilidadDTO implements Serializable{
    
    private Long id_habilidad;
    private String nombre;
    private int porcentaje;
    private Long id_persona;

    public HabilidadDTO() {
    }

    public HabilidadDTO(Long id_habilidad, String nombre, int porcentaje, Long id_persona) {
        this.id_habilidad = id_habilidad;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.id_persona = id_persona;
    }
    
    

    
   
    
    
    
    
}
