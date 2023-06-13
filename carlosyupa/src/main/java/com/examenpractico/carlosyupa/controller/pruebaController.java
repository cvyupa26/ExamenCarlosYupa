package com.examenpractico.carlosyupa.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenpractico.carlosyupa.service.pruebaService;
import com.examenpractico.carlosyupa.model.prueba;

@RestController
@RequestMapping("/prueba")

public class pruebaController {

    private final pruebaService pruebaService;

    public pruebaController(pruebaService pruebaService) {
        this.pruebaService = pruebaService;
    }

    @GetMapping("/{id}}")
    public ResponseEntity<prueba> obtainByCode(@PathVariable(name = "id") Integer id) {

        Optional<prueba> prueba = this.pruebaService.obtainByCode(id);
        if (prueba.isPresent()) {
            return ResponseEntity.ok(prueba.get());
        }

        else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    public ResponseEntity<prueba> create(@RequestBody prueba prueba) {

        try {
            prueba prueba2 = this.pruebaService.create(prueba);
            return ResponseEntity.ok(prueba2);
        } catch (Exception e) {

            return ResponseEntity.badRequest().build();
        }

    }

    @PutMapping
    public ResponseEntity<prueba> update(@RequestBody prueba prueba) {

        try {
            prueba prueba2 = this.pruebaService.update(prueba);
            return ResponseEntity.ok(prueba2);
        } catch (Exception e) {

            return ResponseEntity.badRequest().build();
        }

    }

}