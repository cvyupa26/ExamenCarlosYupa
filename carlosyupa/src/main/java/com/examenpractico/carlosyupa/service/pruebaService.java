package com.examenpractico.carlosyupa.service;

import java.util.Optional;


import org.springframework.stereotype.Service;

import com.examenpractico.carlosyupa.model.prueba;
import com.examenpractico.carlosyupa.repository.pruebaRepository;

import jakarta.transaction.Transactional;

@Service
public class pruebaService {

    private final pruebaRepository pruebaRepository;

    public pruebaService(pruebaRepository pruebaRepository) {
        this.pruebaRepository = pruebaRepository;
    }

    public Optional<prueba> obtainByCode(Integer id) {
        return this.pruebaRepository.findById(id);
    }

    public Optional<prueba> ListByCode(Integer id) {
        return this.pruebaRepository.findById(id);
    }

    public void obtainAllCode() {
        this.pruebaRepository.findAll();
    }

    @Transactional
    public prueba create(prueba prueba) {
        
        return this.pruebaRepository.save(prueba);
    }

    @Transactional
    public prueba update(prueba prueba) {
        Optional <prueba> pruebaOptional = this.pruebaRepository.findById(prueba.getId());

        if(pruebaOptional.isPresent()){
            prueba pruebaUpdate = pruebaOptional.get();
            pruebaUpdate.setNombre(prueba.getNombre());
            pruebaUpdate.setApellido(prueba.getApellido());
            pruebaUpdate.setEdad(prueba.getEdad());
            pruebaUpdate.setDireccion(prueba.getDireccion());
            pruebaUpdate.setTelefono(prueba.getTelefono());
            return this.pruebaRepository.save(pruebaUpdate);
        }
        else{
            throw new RuntimeException("No se encontro el registro");
        }
        
    }

    @Transactional
    public void delete(Integer id) {
       try{
        Optional <prueba> pruebaOptional = this.pruebaRepository.findById(id);
        if(pruebaOptional.isPresent()){
            this.pruebaRepository.delete(pruebaOptional.get());
        }
        else{
            throw new RuntimeException("No se encontro el registro para eliminar");
        }

       }
         catch(Exception e){
              throw new RuntimeException("No se encontro el registro");
         }
    }


}
