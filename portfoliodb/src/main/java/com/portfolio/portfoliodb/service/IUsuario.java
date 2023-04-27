
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.UsuarioDTO;
import com.portfolio.portfoliodb.model.Usuario;
import java.util.List;


public interface IUsuario {
    
    public List<Usuario> verUsuarios();
    
    public void crearUsuario(Usuario usuario);
    
    public void borrarUsuario(Long id);
    
    public Usuario buscarUsuario(Long id);
    
    public void modificarUsuario(Usuario usuario);
    
    // Código de los DTO
    public List<UsuarioDTO> verUsuariosDTO();
    
    public void crearUsuarioDTO(UsuarioDTO usuarioNuevoDTO);
    
    public void modificarUsuarioDTO(UsuarioDTO usuarioDTO);
    
    public void borrarUsuarioDTO(Long id);
    
    public UsuarioDTO buscarUsuarioDTO(Long id);
    
    
    
}
