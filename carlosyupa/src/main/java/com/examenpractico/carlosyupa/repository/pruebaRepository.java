package com.examenpractico.carlosyupa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.examenpractico.carlosyupa.model.prueba;

import java.util.List;



public interface pruebaRepository extends JpaRepository<prueba, Integer> 
{

   List<prueba> findById(int id);

    List<prueba> findByNombre(String nombre);

    List<prueba> findByApellido(String apellido);
    
}
