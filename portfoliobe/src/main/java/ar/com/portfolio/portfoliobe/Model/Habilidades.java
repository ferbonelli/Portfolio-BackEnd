
package ar.com.portfolio.portfoliobe.Model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Habilidades {
    
    private int id;
    private String nombre;
    private String porcentaje;

    public Habilidades() {
    }

    public Habilidades(int id, String nombre, String porcentaje) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
    
}
