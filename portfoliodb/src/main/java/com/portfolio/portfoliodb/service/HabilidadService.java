
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Habilidad;
import com.portfolio.portfoliodb.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidad{

    @Autowired
    public HabilidadRepository habilRepo;
    
    @Override
    public List<Habilidad> verHabilidad() {
        return habilRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad habil) {
        habilRepo.save(habil);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habilRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarHabilidad(Habilidad habil) {
        habilRepo.save(habil);
    }
    
}
