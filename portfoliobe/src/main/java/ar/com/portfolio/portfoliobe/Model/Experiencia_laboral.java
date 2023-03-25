package ar.com.portfolio.portfoliobe.Model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Experiencia_laboral {
    
    private int id;
    private String empresa;
    private String descripcion;
    private String url_logo;
    private Boolean es_actual;
    private Date fecha_desde;
    private Date fecha_hasta;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(int id, String empresa, String descripcion, String url_logo, Boolean es_actual, Date fecha_desde, Date fecha_hasta) {
        this.id = id;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.url_logo = url_logo;
        this.es_actual = es_actual;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }
    
    
    
    
    
}
