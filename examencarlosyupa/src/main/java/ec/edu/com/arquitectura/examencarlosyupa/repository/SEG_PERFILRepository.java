package ec.edu.com.arquitectura.examencarlosyupa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_PERFIL;

public interface SEG_PERFILRepository extends JpaRepository<SEG_PERFIL, String> {
    
List<SEG_PERFIL> finfindBynombreOrderBynombre(String nombre);

}
