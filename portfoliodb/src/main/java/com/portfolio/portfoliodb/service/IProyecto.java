
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.ProyectoDTO;
import com.portfolio.portfoliodb.model.Proyecto;
import java.util.List;


public interface IProyecto {
    
    public List<Proyecto> verProyecto();
    
    public void crearProyecto(Proyecto proye);
    
    public void borrarProyecto(Long id);
    
    public Proyecto buscarProyecto(Long id);
    
    public void modificarProyecto(Proyecto proye);
    
    // Código de DTO
    public void crearProyectoDTO(ProyectoDTO proyectoNuevoDTO);
    
    public List<ProyectoDTO> verProyectosDTO();
    
    public void modificarProyectoDTO(ProyectoDTO proyectoDTO);
    
    public void borrarProyectoDTO(Long id);
}
