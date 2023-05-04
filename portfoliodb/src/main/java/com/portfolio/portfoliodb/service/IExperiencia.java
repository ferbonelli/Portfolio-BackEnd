
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.ExperienciaDTO;
import com.portfolio.portfoliodb.model.Experiencia;
import java.util.List;


public interface IExperiencia {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia expe);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia buscarExperiencia(Long id);
    
    public void modificarExperiencia(Experiencia expe);
    
    // Código de DTO
    
    public void crearExperienciaDTO(ExperienciaDTO experienciaNuevaDTO);
    
    public List<ExperienciaDTO> verExperienciaDTO();
    
    public void modificarExperienciaDTO(ExperienciaDTO experienciaDTO);
    
    public void borrarExperienciaDTO(Long id);
    
    public ExperienciaDTO buscarExperienciaDTO(Long id);
    
    
    
}
