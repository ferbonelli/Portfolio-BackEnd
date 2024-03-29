
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.HabilidadDTO;
import com.portfolio.portfoliodb.service.IHabilidad;
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
public class HabilidadController {
    
    // Para usar el servicio de acceso a datos de entidad Habilidad
    @Autowired
    private IHabilidad habilidadServ;
    
    // Endpoint para agregar una habilidad
    @PostMapping("/habilidad")
    public void agregarHabilidad (@RequestBody HabilidadDTO habilidad) {
         habilidadServ.crearHabilidadDTO(habilidad);
    }
           
    
    // Endpoint para recuperar las habilidades
    @GetMapping("/habilidad")
    @ResponseBody
    public List<HabilidadDTO> verHabilidad(){
        return habilidadServ.verHabilidadesDTO();
    }
    
    @PutMapping("/habilidad")
    public void modificarHabilidad (@RequestBody HabilidadDTO habilidad){
        habilidadServ.modificarHabilidadDTO(habilidad);
    }
    
    @DeleteMapping("/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habilidadServ.borrarHabilidadDTO(id);
    }
    
    // Endpoint para devolver datos de una habilidad por id
    @GetMapping("/habilidad/{id}")
    @ResponseBody
    public HabilidadDTO verHabilidad(@PathVariable Long id){
        return habilidadServ.buscarHabilidadDTO(id);
    }
    
}
