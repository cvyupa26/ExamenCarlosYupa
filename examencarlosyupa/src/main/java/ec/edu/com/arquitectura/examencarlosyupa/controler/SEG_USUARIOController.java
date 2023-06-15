package ec.edu.com.arquitectura.examencarlosyupa.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_USUARIO;
import ec.edu.com.arquitectura.examencarlosyupa.service.SEG_USUARIOService;

@RestController
@RequestMapping("/api/v1/SEG_USUARIO")
public class SEG_USUARIOController {

    private final SEG_USUARIOService usuarioService;

    public SEG_USUARIOController(SEG_USUARIOService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
   public ResponseEntity<SEG_USUARIO> create(@RequestBody SEG_USUARIO usuario) {
    try {
        SEG_USUARIO seguser = this.usuarioService.create(usuario);
        return ResponseEntity.ok(seguser);
    } catch (Exception e) {
       return ResponseEntity.badRequest().build();
    }
        
    }
    
}
