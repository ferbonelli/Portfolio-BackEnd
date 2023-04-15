
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Experiencia;
import java.util.List;


public interface IExperiencia {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia expe);
    
    public void borrarExperiencian(Long id);
    
    public Experiencia buscarExperiencia(Long id);
    
    public void modificarExperiencia(Experiencia expe);
    
}
