
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.EducacionDTO;
import com.portfolio.portfoliodb.model.Educacion;
import com.portfolio.portfoliodb.repository.EducacionRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacion{

    @Autowired
    public EducacionRepository educaRepo;
    
    @Autowired
    private IPersona persoServ;
    
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
    
    // Código para los DTO
    
    @Override
    public void crearEducacionDTO(EducacionDTO educacionNuevoDTO){
    
        Educacion educacionNuevo =
                Educacion.builder()
                
                .titulo(educacionNuevoDTO.getTitulo())
                .institucion(educacionNuevoDTO.getInstitucion())
                .fecha_inicio(educacionNuevoDTO.getFecha_inicio())
                .fecha_final(educacionNuevoDTO.getFecha_final())
                .url_logoinst(educacionNuevoDTO.getUrl_logoinst())
                .pers(persoServ.buscarPersona(educacionNuevoDTO.getId_persona()))
                .build();
        
        this.crearEducacion(educacionNuevo);
    }
    
    @Override
    public List<EducacionDTO> verEducacionDTO(){
    
        // Lista de EducacionDTO
        List<EducacionDTO> ListaEducaciondto=new ArrayList<>();
        
        //Lista de educacion
        List<Educacion> ListaEducacion = this.verEducacion();
        
        // Asigno los valores de la entidad al dto
        for (Educacion educacion :ListaEducacion) {
            EducacionDTO dto = 
                    EducacionDTO.builder()
                        .id_educacion(educacion.getId())
                        .titulo(educacion.getTitulo())
                        .institucion(educacion.getInstitucion())
                        .fecha_inicio(educacion.getFecha_inicio())
                        .fecha_final(educacion.getFecha_final())
                        .url_logoinst(educacion.getUrl_logoinst())
                        .id_persona(educacion.getPers().getId())
                        .build();
            ListaEducaciondto.add(dto);
       
        }
        
        return ListaEducaciondto;
                
    }
    
    @Override
    public void modificarEducacionDTO(EducacionDTO educacionDTO){
    
        //Busco el curso/educacion y lo guardo en un objeto
        Educacion educacionamodificar = this.buscarEducacion(educacionDTO.getId_educacion());
        
        //Cargo los datos desde el DTO
        educacionamodificar.setInstitucion(educacionDTO.getInstitucion());
        educacionamodificar.setTitulo(educacionDTO.getTitulo());
        educacionamodificar.setFecha_inicio(educacionDTO.getFecha_inicio());
        educacionamodificar.setFecha_final(educacionDTO.getFecha_final());
        educacionamodificar.setUrl_logoinst(educacionDTO.getUrl_logoinst());
        
        // Lo cargo en la base de datos
        this.modificarEducacion(educacionamodificar);
        
    }
    
    @Override
    public void borrarEducacionDTO(Long id){
    this.borrarEducacion(id);
    }
    
    @Override
    public EducacionDTO buscarEducacionDTO(Long id){
    
        //Busco la educacion y la guardo en un objeto
        Educacion educacionaBuscada=this.buscarEducacion(id);
        
     // Mapeo la educacion a experienciaDTO
     
     EducacionDTO educacionBuscadaDTO =
             
             EducacionDTO.builder()
                     .id_educacion(educacionaBuscada.getId())
                     .institucion(educacionaBuscada.getInstitucion())
                     .titulo(educacionaBuscada.getTitulo())
                     .fecha_inicio(educacionaBuscada.getFecha_inicio())
                     .fecha_final(educacionaBuscada.getFecha_final())
                     .url_logoinst(educacionaBuscada.getUrl_logoinst())
                     .id_persona(educacionaBuscada.getPers().getId())
                   .build();
    
             return educacionBuscadaDTO;   
        
    }
    
   
}
