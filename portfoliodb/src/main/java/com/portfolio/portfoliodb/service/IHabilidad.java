
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.HabilidadDTO;
import com.portfolio.portfoliodb.model.Habilidad;
import java.util.List;


public interface IHabilidad {
    
    public List<Habilidad> verHabilidad();
    
    public void crearHabilidad(Habilidad habil);
          
    public void borrarHabilidad(Long id);
    
    public Habilidad buscarHabilidad(Long id);
    
    public void modificarHabilidad(Habilidad habil);
    
    //Para los DTO de Habilidades
    
    public void crearHabilidadDTO(HabilidadDTO habilidadNuevaDTO);
    
    public List<HabilidadDTO> verHabilidadesDTO();
    
    public void modificarHabilidadDTO(HabilidadDTO habilidadDTO);
    
    public void borrarHabilidadDTO(Long id);
    
    public HabilidadDTO buscarHabilidadDTO(Long id);
}
