package edu.itm.ejemplo.repositoriesSQL;

import org.springframework.stereotype.Component;

@Component
public class EstudianteRepositoryHelper {

    public String listarEstuantes(){
        return " select idestudiante, nombres, apellidos, cedula, email, fecha_nacimiento from estudiante ";
    }
}
