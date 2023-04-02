
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Experiencia_laboral;
import com.portfolio.portfoliodb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperiencia{

    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia_laboral> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia_laboral expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia_laboral buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia_laboral expe) {
        expeRepo.save(expe);
    }
    
}
