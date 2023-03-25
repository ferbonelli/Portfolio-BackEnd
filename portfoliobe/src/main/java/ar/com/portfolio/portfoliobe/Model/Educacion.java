
package ar.com.portfolio.portfoliobe.Model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Educacion {
    
    private int id;
    private String institucion;
    private String titulo;
    private String url_logoinst;
    private Date fecha_inicio;
    private Date fecha_final;

    public Educacion() {
    }

    public Educacion(int id, String institucion, String titulo, String url_logoinst, Date fecha_inicio, Date fecha_final) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.url_logoinst = url_logoinst;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }
    
    
}
