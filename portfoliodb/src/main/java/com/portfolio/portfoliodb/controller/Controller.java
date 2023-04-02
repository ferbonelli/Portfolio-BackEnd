
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.model.Persona;
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
public class Controller {
    
    @Autowired
    private IPersona persoServ;
    
    
    // Codigo para clase Persona
    
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
         persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("modificar/persona")
    public void modificarPersona (@RequestBody Persona pers){
        persoServ.modificarPersona(pers);
    }
    
    
    
    
}
