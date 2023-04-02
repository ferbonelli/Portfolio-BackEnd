
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Proyecto;
import java.util.List;


public interface IProyecto {
    
    public List<Proyecto> verProyecto();
    
    public void crearProyecto(Proyecto proye);
    
    public void borrarProyecto(Long id);
    
    public Proyecto buscarProyecto(Long id);
    
    public void modificarProyecto(Proyecto proye);
}
