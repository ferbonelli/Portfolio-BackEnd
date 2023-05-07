
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.UsuarioDTO;
import com.portfolio.portfoliodb.model.Usuario;
import com.portfolio.portfoliodb.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuario {

    @Autowired
    public UsuarioRepository usuarioRepo;
    
    @Autowired
    private IPersona persoServ;
    
    
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
    @Override
    public void crearUsuarioDTO(UsuarioDTO usuarioNuevoDTO){
    
        Usuario usuarionuevo=
                Usuario.builder()
                        .id(usuarioNuevoDTO.getId_usuario())
                        .username(usuarioNuevoDTO.getUsername())
                        .password(usuarioNuevoDTO.getPassword())
                        .pers(persoServ.buscarPersona(usuarioNuevoDTO.getId_persona()))
                        .build();
        this.crearUsuario(usuarionuevo);
    }
    
    @Override
    public List<UsuarioDTO> verUsuariosDTO(){
    
    // Lista de usuarios de los dto
        List<UsuarioDTO> ListaUsuariosdto = new ArrayList<>();
        
        // Lista de Usuarios desde la entidad Habilidad
        List<Usuario> ListaUsuarios= this.verUsuarios();
        
        // Asigno los valores de la entidad al dto
        for (Usuario usuario :ListaUsuarios) {
            UsuarioDTO dto = 
                    UsuarioDTO.builder()
                        .id_usuario(usuario.getId())
                            .username(usuario.getUsername())
                            .password(usuario.getPassword())
                            .id_persona(usuario.getPers().getId())
                        .build();
            ListaUsuariosdto.add(dto);
                             
        }
        return ListaUsuariosdto;
                
    }
    
    @Override
    public void modificarUsuarioDTO(UsuarioDTO usuarioDTO){
    
        //Busco el usuario y la guardo en un objeto
        Usuario usuarioaModificar=this.buscarUsuario(usuarioDTO.getId_persona());
        
        //Cargo los datos desde el DTO
        usuarioaModificar.setUsername(usuarioDTO.getUsername());
        usuarioaModificar.setPassword(usuarioDTO.getPassword());
                
        //Lo guardo en la base de datos
        this.modificarUsuario(usuarioaModificar);
    }
    
    @Override
    public void borrarUsuarioDTO(Long id){
    this.borrarUsuario(id);
    }
    
    @Override
    public UsuarioDTO buscarUsuarioDTO(Long id){
    
    //Busco el usuario y la guardo en un objeto
        Usuario usuarioBuscado=this.buscarUsuario(id);
        
     // Mapeo el usuario a usuarioDTO
     
     UsuarioDTO usuarioBuscadoDTO =
             
             UsuarioDTO.builder()
                     .id_usuario(usuarioBuscado.getId())
                     .username(usuarioBuscado.getUsername())
                     .password(usuarioBuscado.getPassword())
                     .id_persona(usuarioBuscado.getPers().getId())
                                       .build();
    
             return usuarioBuscadoDTO;   
    }
    @Override
    public Boolean autorizarUsuario(String usuario, String clave){
    
        //Busco mi usuario y la guardo en un objeto
        long id=2;
        Usuario usuarioAutenticar=this.buscarUsuario(id);
          
        System.out.println (usuarioAutenticar.getUsername()); 
          System.out.println (usuarioAutenticar.getPassword()); 
          System.out.println (usuario);
          System.out.println (clave);
        
        
        if (usuario.equals(usuarioAutenticar.getUsername())  &&
                clave.equals(usuarioAutenticar.getPassword()))
    
            {
                return true;
            }
        
            else
            {
               return false;
            }
    
    }
    
}
