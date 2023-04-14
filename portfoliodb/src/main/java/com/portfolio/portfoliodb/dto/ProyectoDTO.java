
package com.portfolio.portfoliodb.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class ProyectoDTO implements Serializable{
    
    private Long id_proyecto;
    private String nombre;
    private String descripcion;
    private String url_proyecto;
    private String fecha_inicio;
    private String fecha_final;
    private Long id_persona;

    public ProyectoDTO() {
    }

    public ProyectoDTO(Long id_proyecto, String nombre, String descripcion, String url_proyecto, String fecha_inicio, String fecha_final, Long id_persona) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.id_persona = id_persona;
    }
  
    
    
}
