
package com.portfolio.portfoliodb.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class UsuarioDTO {
    
    private Long id_usuario;
    private String username;
    private String password;
    private Long id_persona;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id_usuario, String username, String password, Long id_persona) {
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
        this.id_persona = id_persona;
    }
    
    
    
}
