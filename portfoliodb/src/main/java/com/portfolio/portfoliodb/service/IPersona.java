
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.PersonaDTO;
import com.portfolio.portfoliodb.model.Persona;
import java.util.List;


public interface IPersona {
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona pers);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public void modificarPersona(Persona pers);
    
    // Código para los DTO
    
    public List<PersonaDTO> verPersonasDTO();
    
    public void crearPersonaDTO(PersonaDTO personanuevaDTO);
    
    public void modificarPersonaDTO(PersonaDTO personaDTO);
    
    public void borrarPersonaDTO(Long id);
    
    
    
}
