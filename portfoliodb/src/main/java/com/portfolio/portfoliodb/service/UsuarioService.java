
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.UsuarioDTO;
import com.portfolio.portfoliodb.model.Usuario;
import com.portfolio.portfoliodb.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuario {

    @Autowired
    public UsuarioRepository usuarioRepo;
    
    
    @Override
    public List<Usuario> verUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }
    
    // Código para los DTO
    public void crearUsuarioDTO(UsuarioDTO usuarioNuevoDTO){
    
        Usuario usuarionuevo=
                Usuario.builder()
                        .id(usuarioNuevoDTO.getId_usuario())
                        .username(usuarioNuevoDTO.getUsername())
                        .password(usuarioNuevoDTO.getPassword())
                        .build();
    }
    
    
}
