
package ar.com.portfolio.portfoliobe.Model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Proyecto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private String url_proyecto;
    private Date fecha_inicio;
    private Date fecha_final;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String descripcion, String url_proyecto, Date fecha_inicio, Date fecha_final) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }
    
    
    
}
