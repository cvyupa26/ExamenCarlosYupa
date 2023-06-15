package ec.edu.com.arquitectura.examencarlosyupa.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import ec.edu.com.arquitectura.examencarlosyupa.model.SEG_PERFIL;
import ec.edu.com.arquitectura.examencarlosyupa.service.SEG_PERFILService;

@RestController
@RequestMapping("/api/v1/SEG_PERFIL")
public class SEG_PERFILController {

    private final SEG_PERFILService perfilService;

    public SEG_PERFILController(SEG_PERFILService perfilService) {
        this.perfilService = perfilService;
    }
    
    @GetMapping
    public List<SEG_PERFIL> ListByNombre(String nombre) {
        return this.perfilService.ListByNombre(nombre);
    }
    
}
