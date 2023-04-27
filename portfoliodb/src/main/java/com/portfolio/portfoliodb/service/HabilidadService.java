
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
    
    @Override
    public void modificarHabilidadDTO(HabilidadDTO habilidadDTO){
        
        //Busco la habilidad y la guardo en un objeto
        Habilidad habilidadaModificar=this.buscarHabilidad(habilidadDTO.getId_habilidad());
        
        //Cargo los datos desde el DTO
        habilidadaModificar.setNombre(habilidadDTO.getNombre());
        habilidadaModificar.setPorcentaje(habilidadDTO.getPorcentaje());
        
        //Lo guardo en la base de datos
        this.modificarHabilidad(habilidadaModificar);
    
    }
    
    @Override
    public void borrarHabilidadDTO(Long id) {
        this.borrarHabilidad(id);
    }
    
    @Override
    public HabilidadDTO buscarHabilidadDTO(Long id){
         
     //Busco la habilidad y la guardo en un objeto
        Habilidad habilidadBuscada=this.buscarHabilidad(id);
        
     // Mapeo la habilidad a habilidadDTO
     
     HabilidadDTO habilidadBuscadaDTO =
             
             HabilidadDTO.builder()
                     .id_habilidad(habilidadBuscada.getId())
                     .nombre(habilidadBuscada.getNombre())
                     .porcentaje(habilidadBuscada.getPorcentaje())
                     .id_persona(habilidadBuscada.getPers().getId())
                  .build();
    
             return habilidadBuscadaDTO;   
    }
    
    
    
    
    
    
    
    
}
