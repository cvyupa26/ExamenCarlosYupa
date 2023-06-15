package ec.edu.com.arquitectura.examencarlosyupa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_USUARIO_PERFILPK;
import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_USUARIO_PERFIL;

public interface SEG_USAURIO_PERFILRepository extends JpaRepository<SEG_USUARIO_PERFIL, SEG_USUARIO_PERFILPK> {
    
}
