
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Experiencia_laboral;
import java.util.List;

public interface IExperiencia {
    
    public List<Experiencia_laboral> verExperiencia();
    
    public void crearExperiencia(Experiencia_laboral expe);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia_laboral buscarExperiencia(Long id);
    
    public void modificarExperiencia(Experiencia_laboral expe);
}
