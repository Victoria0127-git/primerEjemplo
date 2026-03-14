package edu.itm.ejemplo.controller;

import edu.itm.ejemplo.ejemplosPOO.PuraSangre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas")
public class Prueba {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/caballo")
    public PuraSangre getCaballo(){
        return new PuraSangre("pepe");
    }
}
