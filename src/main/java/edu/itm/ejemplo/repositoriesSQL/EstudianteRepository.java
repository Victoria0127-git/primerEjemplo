package edu.itm.ejemplo.repositoriesSQL;

import edu.itm.ejemplo.entitiesSQL.Estudiante;
import edu.itm.ejemplo.utilities.Conexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudianteRepository {

    @Autowired
    private EstudianteRepositoryHelper helper;

    public List<Estudiante> getEstudiantes(){
        List<Estudiante> result = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection connection = conexion.obtenerConexion();
        try{
            PreparedStatement ps = connection.prepareStatement(helper.listarEstuantes());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt(1));
                estudiante.setCedula(rs.getString("cedula"));
                estudiante.setNombres(rs.getString(2));
                estudiante.setApellidos(rs.getString(3));
                estudiante.setEmail(rs.getString(5));
                estudiante.setFechaNacimiento(rs.getDate(6));
                result.add(estudiante);
            }
        } catch (Exception e) {
          e.printStackTrace();
        }finally{
            try{
                connection.close();
            }catch (Exception close){
                close.printStackTrace();
            }
        }

    return result;
    }
}
