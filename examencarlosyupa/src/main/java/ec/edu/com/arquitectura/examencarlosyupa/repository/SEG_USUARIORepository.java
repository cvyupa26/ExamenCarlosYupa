package ec.edu.com.arquitectura.examencarlosyupa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_USUARIO;

public interface SEG_USUARIORepository extends JpaRepository<SEG_USUARIO, Integer>{
    
    List<SEG_USUARIO> findByCode(String codigousuario);
    List<SEG_USUARIO> findByMail(String mail);
}
