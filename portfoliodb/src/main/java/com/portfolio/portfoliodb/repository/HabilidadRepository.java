
package com.portfolio.portfoliodb.repository;

import com.portfolio.portfoliodb.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Long> {
    
}
