
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.EducacionDTO;
import com.portfolio.portfoliodb.model.Educacion;
import java.util.List;


public interface IEducacion {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);
    
    public void modificarEducacion(Educacion edu);
    
    // Código para DTO
    
    public List<EducacionDTO> verEducacionDTO();
    
    public void crearEducacionDTO(EducacionDTO educacionNuevoDTO);
    
    public void modificarEducacionDTO(EducacionDTO educacionDTO);
    
    public void borrarEducacionDTO(Long id);
    
    public EducacionDTO buscarEducacionDTO(Long id);
    
    
}
