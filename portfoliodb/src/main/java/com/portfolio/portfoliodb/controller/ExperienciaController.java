
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.ExperienciaDTO;
import com.portfolio.portfoliodb.service.IExperiencia;
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
public class ExperienciaController {
    
    @Autowired
    private IExperiencia experienciaServ;
    
    @PostMapping("/experiencia")
    public void agregarExperiencia (@RequestBody ExperienciaDTO experiencia) {
         experienciaServ.crearExperienciaDTO(experiencia);
    }
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<ExperienciaDTO> verExperiencia(){
        return experienciaServ.verExperienciaDTO();
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperienciaDTO(id);
    }
    
    @PutMapping("/experiencia")
    public void modificarExperiencia (@RequestBody ExperienciaDTO experiencia){
        experienciaServ.modificarExperienciaDTO(experiencia);
    }
    
    // Endpoint para devolver datos de una experiencia por id
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public ExperienciaDTO verExperienciaDTO(@PathVariable Long id){
        return experienciaServ.buscarExperienciaDTO(id);
    }
    
}
