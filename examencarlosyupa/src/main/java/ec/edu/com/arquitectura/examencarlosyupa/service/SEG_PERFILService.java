package ec.edu.com.arquitectura.examencarlosyupa.service;

import java.util.List;
import org.springframework.stereotype.Service;


import ec.edu.com.arquitectura.examencarlosyupa.repository.SEG_PERFILRepository;
import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_PERFIL;

@Service
public class SEG_PERFILService {

    private final SEG_PERFILRepository perfilrepository;

    public SEG_PERFILService(SEG_PERFILRepository perfilrepository) {
        this.perfilrepository = perfilrepository;
    }

    public List<SEG_PERFIL> ListByNombre(String nombre) {
        return this.perfilrepository.finfindBynombreOrderBynombre(nombre);
    }
        
    public SEG_PERFIL createPerfil(SEG_PERFIL perfil) {
        return this.perfilrepository.save(perfil);
    }
    
}
