package edu.itm.ejemplo.controller;

import edu.itm.ejemplo.ejemplosinicialesdeclase.ejemploProgramacionFuncional.ejemplosPOO.PuraSangre;
import edu.itm.ejemplo.entitiesSQL.Estudiante;
import edu.itm.ejemplo.services.EstudianteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @Operation(
            tags = {"Estudiantes"},
            summary = "permite obtener la lista de estudiantes desde la base de datos",
            description = "permite obtener la lista de estudiantes desde la base de datos",
            responses = {
                    @ApiResponse(
                            responseCode = "Ok",
                            description = "trae la lista si hay estudiantes en base de datos",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            schema = @Schema(implementation = Estudiante.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> getEstudiantes(){
        return new ResponseEntity<>(service.getEstudiantes(), HttpStatus.OK);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Estudiante> insertarEstudiante(@RequestBody Estudiante estudiante){
        if(ObjectUtils.isEmpty(estudiante) || ObjectUtils.isEmpty(estudiante.getNombres())){
            return new ResponseEntity<>(estudiante, HttpStatus.BAD_REQUEST);
        }
        estudiante = service.insertarEstudiante(estudiante);
        if(ObjectUtils.isEmpty(estudiante)){
            return new ResponseEntity<>(estudiante, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(estudiante, HttpStatus.CREATED);
    }

}
