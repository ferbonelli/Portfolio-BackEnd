
package com.portfolio.portfoliodb.service;

import com.portfolio.portfoliodb.dto.ProyectoDTO;
import com.portfolio.portfoliodb.model.Proyecto;
import com.portfolio.portfoliodb.repository.ProyectoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyecto {

    @Autowired
    public ProyectoRepository proyeRepo;
    
    @Autowired
    private IPersona persoServ;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }
    
    // Código para los DTO
    @Override
    public void crearProyectoDTO(ProyectoDTO proyectoNuevoDTO){
    Proyecto proyectonuevo=
                
                Proyecto.builder()
                        
                        .nombre(proyectoNuevoDTO.getNombre())
                        .descripcion(proyectoNuevoDTO.getDescripcion())
                        .fecha_inicio(proyectoNuevoDTO.getFecha_inicio())
                        .fecha_final(proyectoNuevoDTO.getFecha_final())
                        .pers(persoServ.buscarPersona(proyectoNuevoDTO.getId_persona()))
                        .build();
        this.crearProyecto(proyectonuevo);
    }
    
    @Override
    public List<ProyectoDTO> verProyectosDTO(){
    // Lista de proyectos de los dto
        List<ProyectoDTO> ListaProyectosdto = new ArrayList<>();
        
        // Lista de Proyectos desde la entidad Proyectos
        List<Proyecto> ListaProyectos= this.verProyecto();
        
        // Asigno los valores de la entidad al dto
        for (Proyecto proyecto :ListaProyectos) {
            ProyectoDTO dto = 
                    ProyectoDTO.builder()
                        .id_proyecto(proyecto.getId())
                        .nombre(proyecto.getNombre())
                        .descripcion(proyecto.getDescripcion())
                        .fecha_inicio(proyecto.getFecha_inicio())
                        .fecha_final(proyecto.getFecha_final())
                        .id_persona(proyecto.getPers().getId())
                        .build();
            ListaProyectosdto.add(dto);
       
        }
        
        return ListaProyectosdto;
    }
    
    @Override
    public void modificarProyectoDTO(ProyectoDTO proyectoDTO){
        
        //Busco el proyecto y la guardo en un objeto
        Proyecto proyectoaModificar=this.buscarProyecto(proyectoDTO.getId_proyecto());
        
        //Cargo los datos desde el DTO
        proyectoaModificar.setNombre(proyectoDTO.getNombre());
        proyectoaModificar.setDescripcion(proyectoDTO.getDescripcion());
        proyectoaModificar.setFecha_inicio(proyectoDTO.getFecha_inicio());
        proyectoaModificar.setFecha_final(proyectoDTO.getFecha_final());
        proyectoaModificar.setUrl_proyecto(proyectoDTO.getUrl_proyecto());
        
        //Lo guardo en la base de datos
        this.modificarProyecto(proyectoaModificar);
                        
    }
    
    @Override
    public void borrarProyectoDTO(Long id){
    this.borrarProyecto(id);
    }
    
    @Override
    public ProyectoDTO buscarProyectoDTO(Long id){
    
        //Busco el proyecto y la guardo en un objeto
        Proyecto proyectoaModificar=this.buscarProyecto(id);
        
     // Mapeo el proyecto a proyectoDTO
     
     ProyectoDTO proyectoaModificarDTO =
             
             ProyectoDTO.builder()
                    .id_proyecto(proyectoaModificar.getId())
                    .nombre(proyectoaModificar.getNombre())
                    .descripcion(proyectoaModificar.getDescripcion())
                    .fecha_inicio(proyectoaModificar.getFecha_inicio())
                    .fecha_final(proyectoaModificar.getFecha_final())
                    .url_proyecto(proyectoaModificar.getUrl_proyecto())
                    .id_persona(proyectoaModificar.getPers().getId())
                  .build();
    
             return proyectoaModificarDTO;   
    }
    
}
