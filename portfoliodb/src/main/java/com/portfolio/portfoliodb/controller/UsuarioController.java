
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.UsuarioDTO;
import com.portfolio.portfoliodb.service.IUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuario usuarioServ;
    
     @PostMapping("/usuario")
    public void agregarUsuario (@RequestBody UsuarioDTO usuario) {
         usuarioServ.crearUsuarioDTO(usuario);
    }
    
    @GetMapping("/ver/usuarios")
    @ResponseBody
    public List<UsuarioDTO> verUsuarios(){
        return usuarioServ.verUsuariosDTO();
    }
    
    @DeleteMapping("/usuario/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServ.borrarUsuarioDTO(id);
    }
    
    @PutMapping("/usuario")
    public void modificarUsuario (@RequestBody UsuarioDTO usuario){
        usuarioServ.modificarUsuarioDTO(usuario);
    }
    
    // Endpoint para devolver datos del usuario por id
    @GetMapping("/usuario/{id}")
    @ResponseBody
    public UsuarioDTO verUsuario(@PathVariable Long id){
        return usuarioServ.buscarUsuarioDTO(id);
    }
    
}
