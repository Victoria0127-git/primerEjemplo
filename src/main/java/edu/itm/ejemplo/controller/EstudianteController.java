package edu.itm.ejemplo.controller;

import edu.itm.ejemplo.entitiesSQL.Estudiante;
import edu.itm.ejemplo.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        return new ResponseEntity<>(service.getEstudiantes(), HttpStatus.OK);
    }
}
