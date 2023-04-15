
package com.portfolio.portfoliodb.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String username;
    private String password;
    
    @OneToOne
    @JoinColumn(name ="id_persona")
    private Persona pers;

    public Usuario() {
    }

    public Usuario(Long id, String username, String password, Persona pers) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.pers = pers;
    }

    
       
        
}
