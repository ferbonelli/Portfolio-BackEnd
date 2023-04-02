
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Usuario;
import java.util.List;


public interface IUsuario {
    
    public List<Usuario> verUsuarios();
    
    public void crearUsuario(Usuario usuario);
    
    public void borrarUsuario(Long id);
    
    public Usuario buscarUsuario(Long id);
    
    public void modificarUsuario(Usuario usuario);
}
