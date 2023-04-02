
package com.portfolio.portfoliodb.repository;

import com.portfolio.portfoliodb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
