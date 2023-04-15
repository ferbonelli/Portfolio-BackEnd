
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Experiencia;
import com.portfolio.portfoliodb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperiencia{

    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }
      
    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencian(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
    
}
