
package com.portfolio.db.Repository;

import com.portfolio.db.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    public Optional<Experiencia> findByinstitucionE(String institucionE);
    public boolean existsByinstitucionE(String institucionE);
    
}
