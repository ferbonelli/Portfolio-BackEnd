
package com.portfolio.portfoliodb.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class EducacionDTO implements Serializable{
    
    private Long id_educacion;
    private String institucion;
    private String titulo;
    private String url_logoinst;
    private String fecha_inicio;
    private String fecha_final;
    private Long id_persona;

    public EducacionDTO() {
    }

    public EducacionDTO(Long id_educacion, String institucion, String titulo, String url_logoinst, String fecha_inicio, String fecha_final, Long id_persona) {
        this.id_educacion = id_educacion;
        this.institucion = institucion;
        this.titulo = titulo;
        this.url_logoinst = url_logoinst;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.id_persona = id_persona;
    }
    
    
    
    
    
}
