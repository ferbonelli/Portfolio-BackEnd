
package ar.com.portfolio.portfoliobe.Model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private String url_foto;
    private String dni;
    private String acerca_de;
    private String correo_e;
    private String celular;
    private Date fecha_nac;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String url_foto, String dni, String acerca_de, String correo_e, String celular, Date fecha_nac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.url_foto = url_foto;
        this.dni = dni;
        this.acerca_de = acerca_de;
        this.correo_e = correo_e;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
    }

    

    
    
    
    
}
