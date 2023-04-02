
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.model.Educacion;
import com.portfolio.portfoliodb.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacion{

    @Autowired
    public EducacionRepository educaRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educaRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        educaRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        educaRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educaRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion edu) {
        educaRepo.save(edu);
    }
    
}
