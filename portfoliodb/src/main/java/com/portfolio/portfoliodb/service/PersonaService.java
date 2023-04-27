
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.PersonaDTO;
import com.portfolio.portfoliodb.model.Persona;
import com.portfolio.portfoliodb.repository.PersonaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersona{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona pers) {
        persoRepo.save(pers);
    }
    
    // Código para lso DTO
    public void crearPersonaDTO(PersonaDTO personanuevaDTO){
    
        Persona personanueva=
                Persona.builder()
                .id(personanuevaDTO.getId_persona())
                .nombre(personanuevaDTO.getNombre())
                .apellido(personanuevaDTO.getApellido())
                .dni(personanuevaDTO.getDni())
                .profesion(personanuevaDTO.getProfesion())
                .acerca_de(personanuevaDTO.getAcerca_de())
                .url_foto(personanuevaDTO.getUrl_foto())
                .correo_electronico(personanuevaDTO.getCorreo_electronico())
                .celular(personanuevaDTO.getCelular())
                .fecha_Nac(personanuevaDTO.getFecha_Nac())
                .build();
        this.crearPersona(personanueva);
    }
    
    public List<PersonaDTO> verPersonasDTO(){
    // Lista de usuarios de los dto
        List<PersonaDTO> ListaPersonasdto = new ArrayList<>();
        
        // Lista de Usuarios desde la entidad Habilidad
        List<Persona> ListaPersonas= this.verPersonas();
        
        // Asigno los valores de la entidad al dto
        for (Persona persona : ListaPersonas) {
            
            PersonaDTO dto=
                    PersonaDTO.builder()
                    .id_persona(persona.getId())
                    .apellido(persona.getApellido())
                    .nombre(persona.getNombre())
                    .dni(persona.getDni())
                    .profesion(persona.getProfesion())
                    .acerca_de(persona.getAcerca_de())
                    .url_foto(persona.getUrl_foto())
                    .correo_electronico(persona.getCorreo_electronico())
                    .celular(persona.getCelular())
                    .fecha_Nac(persona.getFecha_Nac())
                    .build();
            ListaPersonasdto.add(dto);
        
        }
        
        return ListaPersonasdto;
    }
    
    public void modificarPersonaDTO(PersonaDTO personaDTO){
                
        //Busco la persona y la guardo en un objeto
        Persona personaaModificar=this.buscarPersona(personaDTO.getId_persona());
        
        //Cargo los datos desde el DTO
        personaaModificar.setApellido(personaDTO.getApellido());
        personaaModificar.setNombre(personaDTO.getNombre());
        personaaModificar.setDni(personaDTO.getDni());
        personaaModificar.setProfesion(personaDTO.getProfesion());
        personaaModificar.setAcerca_de(personaDTO.getAcerca_de());
        personaaModificar.setCorreo_electronico(personaDTO.getCorreo_electronico());
        personaaModificar.setCelular(personaDTO.getCelular());
        personaaModificar.setUrl_foto(personaDTO.getUrl_foto());
        personaaModificar.setFecha_Nac(personaDTO.getFecha_Nac());
                                      
                                      
        //Lo guardo en la base de datos
        this.modificarPersona(personaaModificar);
        
    
    }
    
    public void borrarPersonaDTO(Long id){
    this.borrarPersona(id);
    }
    
    
    @Override
    public PersonaDTO buscarPersonaDTO(Long id){
         
     //Busco la persona y la guardo en un objeto
        Persona personaBuscada=this.buscarPersona(id);
        
     // Mapeo la persona a personaDTO
     
     PersonaDTO personaBuscadaDTO =
             
             PersonaDTO.builder()
                     .id_persona(personaBuscada.getId())
                     .nombre(personaBuscada.getNombre())
                     .apellido(personaBuscada.getApellido())
                     .dni(personaBuscada.getDni())
                     .url_foto(personaBuscada.getUrl_foto())
                     .acerca_de(personaBuscada.getAcerca_de())
                     .profesion(personaBuscada.getProfesion())
                     .correo_electronico(personaBuscada.getCorreo_electronico())
                     .celular(personaBuscada.getCelular())
                     .fecha_Nac(personaBuscada.getFecha_Nac())
                  .build();
    
             return personaBuscadaDTO;   
    }
    
     
    
}
