
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.HabilidadDTO;
import com.portfolio.portfoliodb.model.Habilidad;
import com.portfolio.portfoliodb.repository.HabilidadRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidad{

    @Autowired
    public HabilidadRepository habilRepo;
    @Autowired
    private IPersona persoServ;
    
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
    
    // Código para lso DTO
    @Override
    public void crearHabilidadDTO(HabilidadDTO habilidadNuevaDTO){
    
        
        Habilidad habilidadnueva=
                
                Habilidad.builder()
                        .id(habilidadNuevaDTO.getId_habilidad())
                        .nombre(habilidadNuevaDTO.getNombre())
                        .porcentaje(habilidadNuevaDTO.getPorcentaje())
                        .pers(persoServ.buscarPersona(habilidadNuevaDTO.getId_persona()))
                        .build();
        this.crearHabilidad(habilidadnueva);
    }
    
    @Override
    public List<HabilidadDTO> verHabilidadesDTO(){
             
        // Lista de habilidades de los dto
        List<HabilidadDTO> ListaHabilidadesdto = new ArrayList<>();
        
        // Lista de habilidades desde la entidad Habilidad
        List<Habilidad> Listahabilidades= this.verHabilidad();
        
        // Asigno los valores de la entidad al dto
        for (Habilidad habilidad : Listahabilidades) {
            HabilidadDTO dto = 
                    HabilidadDTO.builder()
                        .id_habilidad(habilidad.getId())
                        .nombre(habilidad.getNombre())
                        .porcentaje(habilidad.getPorcentaje())
                        .id_persona(habilidad.getPers().getId())
                        .build();
            ListaHabilidadesdto.add(dto);
       
        }
        
        return ListaHabilidadesdto;
             
                
    }
    
}
