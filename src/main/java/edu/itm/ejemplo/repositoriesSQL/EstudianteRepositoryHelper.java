package edu.itm.ejemplo.repositoriesSQL;

import org.springframework.stereotype.Component;

@Component
public class EstudianteRepositoryHelper {

    public String listarEstuantes(){
        return " select idestudiante, nombres, apellidos, cedula, email, fecha_nacimiento from estudiante ";
    }

    public String getNumeroEstudiantes(){
        return " select count(idEstudiante) from estudiante ";
    }

    public String insertarEstudiante(){
        return " insert into estudiante (idestudiante, nombres, apellidos, cedula, email) values (?, ?, ?, ?, ?) ";
    }
}
