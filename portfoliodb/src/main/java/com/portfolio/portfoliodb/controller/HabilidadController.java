
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.HabilidadDTO;
import com.portfolio.portfoliodb.service.IHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadController {
    
    // Para usar el servicio de acceso a datos de entidad Habilidad
    @Autowired
    private IHabilidad habilidadServ;
    
    // Endpoint para agregar una habilidad
    @PostMapping("/new/habilidad")
    public void agregarHabilidad (@RequestBody HabilidadDTO habilidad) {
         habilidadServ.crearHabilidadDTO(habilidad);
    }
           
    
    // Endpoint para recuperar las habilidades
    @GetMapping("/ver/habilidad")
    @ResponseBody
    public List<HabilidadDTO> verHabilidad(){
        return habilidadServ.verHabilidadesDTO();
    }
}
