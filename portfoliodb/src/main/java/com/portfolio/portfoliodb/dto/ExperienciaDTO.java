
package com.portfolio.portfoliodb.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class ExperienciaDTO {
    
    private Long id_experiencia;
    private String empresa;
    private String puesto;
    private String descripcion;
    private String url_logo;
    private String fecha_desde;
    private String fecha_hasta;
    private Long id_persona;

    public ExperienciaDTO() {
    }

    public ExperienciaDTO(Long id_experiencia, String empresa, String puesto, String descripcion, String url_logo, String fecha_desde, String fecha_hasta, Long id_persona) {
        this.id_experiencia = id_experiencia;
        this.empresa = empresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.url_logo = url_logo;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.id_persona = id_persona;
    }

    
    
}
