package edu.itm.ejemplo.controller;

import edu.itm.ejemplo.ejemplosinicialesdeclase.ejemploProgramacionFuncional.ejemplosPOO.PuraSangre;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/pruebas")
public class Prueba {

    @Operation(
            tags = {"Los Gets"},
            summary = "devuelve pong",
            description = "método para ver si la aplicación está arriba",
            responses = {
                    @ApiResponse(
                            responseCode = "ok",
                            description = "éxito",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            schema = @Schema(implementation = String.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @Operation(
           tags = {"Los Gets"},
            summary = "devuelve un pura sangre",
            description = "método de prueba de un Get que devuelve un objeto pura sangre",
            responses = {
                   @ApiResponse(
                        responseCode = "ok",
                           description = "éxito",
                           content = {
                                @Content(
                                        mediaType = MediaType.APPLICATION_JSON_VALUE,
                                        schema = @Schema(implementation = String.class)
                                )
                           }
                   )
            }
    )
    @GetMapping("/caballo")
    public ResponseEntity<PuraSangre> getCaballo(){
        return new ResponseEntity<>(new PuraSangre("caballo loco"), HttpStatus.OK);
    }

    @Operation(
            tags = {"Modificaciones"},
            summary = "permite actualizar un purasangre",
            description = "permite actualizar un purasangre ingresado",
            responses = {
                    @ApiResponse(
                            responseCode = "Accepted",
                            description = "éxito",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            schema = @Schema(implementation = String.class)
                                    )
                            }
                    )
            }
    )

    @PutMapping("/actualizar")
    public ResponseEntity<String> actualizarCaballo(@RequestBody PuraSangre caballo){
        System.out.println("caballo ingresado "+caballo.getNombre());
        return new ResponseEntity<>("actualizado con éxito", HttpStatus.ACCEPTED);
    }

    @PutMapping("/actualizarconparametros")
    public ResponseEntity<String> actualizarCaballo(@RequestBody PuraSangre caballo, @RequestParam int id, @RequestParam String prueba){
        System.out.println("caballo ingresado: "+caballo.getNombre());
        System.out.println("id recibido: "+id + " otra variable: "+prueba);
        return new ResponseEntity<>("actualizado con éxito", HttpStatus.ACCEPTED);
    }

    @Operation(
            tags = {"Modificaciones"},
            summary = "permite insertar un purasangre",
            description = "permite insertar un purasangre ingresado",
            responses = {
                    @ApiResponse(
                            responseCode = "Accepted",
                            description = "éxito",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            schema = @Schema(implementation = PuraSangre.class)
                                    )
                            }
                    )
            }
    )
    @PostMapping("/insertar")
    public ResponseEntity<PuraSangre> insertarCaballo(@RequestBody PuraSangre caballo){
        if(Objects.nonNull(caballo) && Objects.nonNull(caballo.getNombre())){
            return new ResponseEntity<>(caballo, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(caballo, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminarCaballo(@RequestBody PuraSangre caballo){
        System.out.println("caballo ingresado "+caballo.getNombre());
        return new ResponseEntity<>("eliminado con éxito", HttpStatus.ACCEPTED);
    }

}
