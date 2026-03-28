package edu.itm.ejemplo.services;

import edu.itm.ejemplo.entitiesSQL.Estudiante;
import edu.itm.ejemplo.repositoriesSQL.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public List<Estudiante> getEstudiantes(){
        return repository.getEstudiantes();
    }

    public Estudiante insertarEstudiante(Estudiante estudiante){
        int pk = repository.getNumeroEstudiantes() + 1;
        estudiante.setIdEstudiante(pk);
        return repository.insertarEstudiante(estudiante);
    }

}
