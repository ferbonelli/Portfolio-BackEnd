
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.HabilidadDTO;
import com.portfolio.portfoliodb.model.Habilidad;
import com.portfolio.portfoliodb.service.IHabilidad;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadController {
    
    // Para usar el servicio de acceso a datos de entidad Habilidad
    @Autowired
    private IHabilidad habilidadServ;
    
    @GetMapping("/ver/habilidades")
    @ResponseBody
    public List<HabilidadDTO> verHabilidades(){
        
                
        // Lista de habilidades de los dto
        List<HabilidadDTO> ListaHabilidadesdto = new ArrayList<>();
        
        // Lista de habilidades desde la entidad Habilidad
        List<Habilidad> Listahabilidades= habilidadServ.verHabilidad();
        
        // Asigno los valores de la entidad al dto
        for (Habilidad habilidad : Listahabilidades) {
            HabilidadDTO dto = 
                    HabilidadDTO.builder()
                        .id_habilidad(habilidad.getId())
                        .nombre(habilidad.getNombre())
                        .porcentaje(habilidad.getPorcentaje())
                        .build();
            ListaHabilidadesdto.add(dto);
       
        }
        
        return ListaHabilidadesdto;
             
                
    }
}
