
package com.portfolio.portfoliodb.repository;

import com.portfolio.portfoliodb.model.Experiencia_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia_laboral, Long>{
    
}
