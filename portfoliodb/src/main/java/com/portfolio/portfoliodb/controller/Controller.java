
package com.portfolio.portfoliodb.controller;

import com.portfolio.portfoliodb.model.Educacion;
import com.portfolio.portfoliodb.model.Experiencia_laboral;
import com.portfolio.portfoliodb.model.Habilidad;
import com.portfolio.portfoliodb.model.Persona;
import com.portfolio.portfoliodb.model.Proyecto;
import com.portfolio.portfoliodb.model.Usuario;
import com.portfolio.portfoliodb.service.IEducacion;
import com.portfolio.portfoliodb.service.IExperiencia;
import com.portfolio.portfoliodb.service.IHabilidad;
import com.portfolio.portfoliodb.service.IPersona;
import com.portfolio.portfoliodb.service.IProyecto;
import com.portfolio.portfoliodb.service.IUsuario;
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
    private IEducacion educacionServ;
    @Autowired
    private IExperiencia experienciaServ;
    @Autowired
    private IHabilidad habilidadServ;
    @Autowired
    private IPersona persoServ;
    @Autowired
    private IProyecto proyectoServ;
    @Autowired
    private IUsuario usuarioServ;
    
    
    // ************************************
    // Codigo para clase Educación
    // ************************************
    @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion educacion) {
         educacionServ.crearEducacion(educacion);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educacionServ.verEducacion();
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionServ.borrarEducacion(id);
    }
    
    @PutMapping("modificar/educacion")
    public void modificarEducacion (@RequestBody Educacion educacion){
        educacionServ.modificarEducacion(educacion);
    }
    
    // ****************************************
    // Codigo para clase Experiencia_laboral
    // ****************************************
    @PostMapping("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia_laboral experiencia) {
         experienciaServ.crearExperiencia(experiencia);
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia_laboral> verExperiencia(){
        return experienciaServ.verExperiencia();
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
    @PutMapping("modificar/experiencia")
    public void modificarExperiencia (@RequestBody Experiencia_laboral experiencia){
        experienciaServ.modificarExperiencia(experiencia);
    }
    
    
    // ************************************
    // Codigo para clase Habilidad
    // ************************************
    @PostMapping("/new/habilidad")
    public void agregarHabilidad (@RequestBody Habilidad habilidad) {
         habilidadServ.crearHabilidad(habilidad);
    }
    
    @GetMapping("/ver/habilidad")
    @ResponseBody
    public List<Habilidad> verHabilidad(){
        return habilidadServ.verHabilidad();
    }
    
    @DeleteMapping("/delete/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habilidadServ.borrarHabilidad(id);
    }
    
    @PutMapping("modificar/habilidad")
    public void modificarHabilidad (@RequestBody Habilidad habilidad){
        habilidadServ.modificarHabilidad(habilidad);
    }
    
    // ************************************
    // Codigo para clase Persona
    // ************************************
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona per) {
         persoServ.crearPersona(per);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("modificar/persona")
    public void modificarPersona (@RequestBody Persona per){
        persoServ.modificarPersona(per);
    }
    
    
    // *************************************
    // Codigo para clase Proyecto
    // *************************************
    @PostMapping("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto proyecto) {
         proyectoServ.crearProyecto(proyecto);
    }
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyectoServ.verProyecto();
    }
    
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
    }
    
    @PutMapping("modificar/proyecto")
    public void modificarProyecto (@RequestBody Proyecto proyecto){
        proyectoServ.modificarProyecto(proyecto);
    }
    
    
    // ***********************
    //Código para usuario
    // ***********************
     @PostMapping("/new/usuario")
    public void agregarUsuario (@RequestBody Usuario username) {
         usuarioServ.crearUsuario(username);
    }
    
    @GetMapping("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioServ.verUsuarios();
    }
    
    @DeleteMapping("/delete/usuario/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    @PutMapping("modificar/usuario")
    public void modificarUsuario (@RequestBody Usuario username){
        usuarioServ.modificarUsuario(username);
    }
    
    
}
