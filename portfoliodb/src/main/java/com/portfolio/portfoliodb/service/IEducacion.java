
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Educacion;
import java.util.List;


public interface IEducacion {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);
    
    public void modificarEducacion(Educacion edu);
    
}
