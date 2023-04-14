
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

    public HabilidadDTO() {
    }

    public HabilidadDTO(Long id_habilidad, String nombre, int porcentaje) {
        this.id_habilidad = id_habilidad;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
    
    
    
}
