
package ar.com.portfolio.portfoliobe.Model;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Usuario {
    
    private int id;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    
}
    
   
