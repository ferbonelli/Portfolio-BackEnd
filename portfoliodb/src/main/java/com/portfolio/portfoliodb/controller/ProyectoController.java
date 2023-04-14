
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.ProyectoDTO;
import com.portfolio.portfoliodb.model.Proyecto;
import com.portfolio.portfoliodb.service.IProyecto;
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
public class ProyectoController {
    
    // Para usar el servicio de acceso a datos de entidad Proyecto
    @Autowired
    private IProyecto proyectoServ;
    
    // Endpoint para agregar un proyecto
    @PostMapping("/new/proyecto")
    public void agregarProyecto (@RequestBody ProyectoDTO proyecto) {
         proyectoServ.crearProyectoDTO(proyecto);
    }
    
    // Endpoint para ver Proyectos
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<ProyectoDTO> verProyecto(){
        return proyectoServ.verProyectosDTO();
    }
    
    //Endpoint para modificar proyectos
    @PutMapping("modificar/proyecto")
    public void modificarProyecto (@RequestBody ProyectoDTO proyecto){
        proyectoServ.modificarProyectoDTO(proyecto);
    }
    
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyectoDTO(id);
    }
    
}
