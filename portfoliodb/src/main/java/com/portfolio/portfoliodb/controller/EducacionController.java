
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.EducacionDTO;
import com.portfolio.portfoliodb.service.IEducacion;
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
public class EducacionController {
    
    // Para usar el servicio de acceso a datos de entidad Educacion
    @Autowired
    private IEducacion educacionServ;
    
    // Endpoint para agregar educacion
    @PostMapping("/educacion")
    public void agregarEducacion (@RequestBody EducacionDTO educacion) {
         educacionServ.crearEducacionDTO(educacion);
    }
    
    // Endpoint para listar educación
    @GetMapping("/educacion")
    @ResponseBody
    public List<EducacionDTO> verEducacion(){
        return educacionServ.verEducacionDTO();
    }
    
    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionServ.borrarEducacionDTO(id);
    }
    
    @PutMapping("/educacion")
    public void modificarEducacion (@RequestBody EducacionDTO educacion){
        educacionServ.modificarEducacionDTO(educacion);
    }
    
    // Endpoint para devolver datos de una educacion por id
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public EducacionDTO verEducacionDTO(@PathVariable Long id){
        return educacionServ.buscarEducacionDTO(id);
    }
    
    
}
