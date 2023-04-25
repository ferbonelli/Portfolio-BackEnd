
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.ExperienciaDTO;
import com.portfolio.portfoliodb.model.Experiencia;
import com.portfolio.portfoliodb.repository.ExperienciaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperiencia{

    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Autowired
    public PersonaService persoServ;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }
      
    @Override
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
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
    
    // Código para los DTO
    
    @Override
    public void crearExperienciaDTO(ExperienciaDTO experienciaNuevaDTO){
    
        Experiencia experiencianueva=
                
        Experiencia.builder()
                
                .empresa(experienciaNuevaDTO.getEmpresa())
                .puesto(experienciaNuevaDTO.getPuesto())
                .descripcion(experienciaNuevaDTO.getDescripcion())
                .fecha_desde(experienciaNuevaDTO.getFecha_desde())
                .fecha_hasta(experienciaNuevaDTO.getFecha_hasta())
                .url_logo(experienciaNuevaDTO.getUrl_logo())
                .pers(persoServ.buscarPersona(experienciaNuevaDTO.getId_persona()))
                .build();
        this.crearExperiencia(experiencianueva);
    }
    
    @Override
    public List<ExperienciaDTO> verExperienciaDTO(){
    // Lista de experiencia de los dto
        List<ExperienciaDTO> ListaExperienciadto = new ArrayList<>();
        
        // Lista de Experiencia desde la entidad Proyectos
        List<Experiencia> ListaExperiencia= this.verExperiencia();
        
        // Asigno los valores de la entidad al dto
        for (Experiencia experiencia: ListaExperiencia){
            
            ExperienciaDTO dto =
                    ExperienciaDTO.builder()
                    .id_experiencia(experiencia.getId())
                    .empresa(experiencia.getEmpresa())
                    .puesto(experiencia.getPuesto())
                    .descripcion(experiencia.getDescripcion())
                    .fecha_desde(experiencia.getFecha_desde())
                    .fecha_hasta(experiencia.getFecha_hasta())
                    .url_logo(experiencia.getUrl_logo())
                    .id_persona(experiencia.getPers().getId())
                    .build();
            ListaExperienciadto.add(dto);
            
        }
    
    return ListaExperienciadto;
    }
    
    @Override
    public void modificarExperienciaDTO(ExperienciaDTO experienciaDTO){
    
        //Busco la experiencia y la guardo en un objeto
        Experiencia experienciaModificar=this.buscarExperiencia(experienciaDTO.getId_experiencia());
                
        //Cargo los datos desde el DTO
        experienciaModificar.setEmpresa(experienciaDTO.getEmpresa());
        experienciaModificar.setPuesto(experienciaDTO.getPuesto());
        experienciaModificar.setDescripcion(experienciaDTO.getDescripcion());
        experienciaModificar.setFecha_desde(experienciaDTO.getFecha_desde());
        experienciaModificar.setFecha_hasta(experienciaDTO.getFecha_hasta());
        experienciaModificar.setUrl_logo(experienciaDTO.getUrl_logo());
        
        // Lo cargo a la base de datos
        this.modificarExperiencia(experienciaModificar);
        
    }
    
    @Override
    public void borrarExperienciaDTO(Long id){
    this.borrarExperiencia(id);
    }
    
    @Override
    public ExperienciaDTO buscarExperienciaDTO(Long id){
     //Busco la experiencia y la guardo en un objeto
        Experiencia experienciaaModificar=this.buscarExperiencia(id);
        
     // Mapeo la experiencia a experienciaDTO
     
     ExperienciaDTO experienciaaModificarDTO =
             
             ExperienciaDTO.builder()
                     .id_experiencia( experienciaaModificar.getId())
                     .empresa( experienciaaModificar.getEmpresa())
                     .descripcion( experienciaaModificar.getDescripcion())
                     .puesto( experienciaaModificar.getPuesto())
                     .fecha_desde( experienciaaModificar.getFecha_desde())
                     .fecha_hasta( experienciaaModificar.getFecha_hasta())
                     .url_logo( experienciaaModificar.getUrl_logo())
                     .id_persona( experienciaaModificar.getPers().getId())
                  .build();
    
             return experienciaaModificarDTO;   
        
    }
    
}
