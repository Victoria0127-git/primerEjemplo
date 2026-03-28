package edu.itm.ejemplo.entitiesSQL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Estudiante {
    private int idEstudiante;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private Date fechaNacimiento;
}
