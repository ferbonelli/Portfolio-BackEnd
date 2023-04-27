
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.dto.PersonaDTO;
import com.portfolio.portfoliodb.service.IPersona;
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
public class PersonaController {
    
    @Autowired
    private IPersona persoServ;
    
    @PostMapping("/persona")
    public void agregarPersona (@RequestBody PersonaDTO persona) {
         persoServ.crearPersonaDTO(persona);
    }
    
    @GetMapping("/persona")
    @ResponseBody
    public List<PersonaDTO> verPersona(){
        return persoServ.verPersonasDTO();
    }
    
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersonaDTO(id);
    }
    
    @PutMapping("persona")
    public void modificarPersona (@RequestBody PersonaDTO persona){
        persoServ.modificarPersonaDTO(persona);
    }
    
    // Endpoint para devolver datos de una persona por id
    @GetMapping("/persona/{id}")
    @ResponseBody
    public PersonaDTO verPersona(@PathVariable Long id){
        return persoServ.buscarPersonaDTO(id);
    }
    
    
}
