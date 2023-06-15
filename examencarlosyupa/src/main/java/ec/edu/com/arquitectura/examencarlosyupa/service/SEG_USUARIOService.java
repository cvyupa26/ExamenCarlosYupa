package ec.edu.com.arquitectura.examencarlosyupa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_USUARIO;
import ec.edu.com.arquitectura.examencarlosyupa.repository.SEG_USUARIORepository;
import jakarta.transaction.Transactional;

@Service
public class SEG_USUARIOService {

    private final SEG_USUARIORepository usuariorepository;

    public SEG_USUARIOService(SEG_USUARIORepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    public Optional<SEG_USUARIO> obtainByCode(Integer id) {
        return this.usuariorepository.findById(id);
    }

    @Transactional
    public SEG_USUARIO create(SEG_USUARIO usuario) {
        SEG_USUARIO usuariotmp = this.usuariorepository.findByMail(usuario.getMail());
        if (usuariotmp != null) {
            throw new RuntimeException("El usuario ya existe");
        }else{
            return this.usuariorepository.save(usuario);
        }

       
    }

    
}
