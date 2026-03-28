package edu.itm.ejemplo.repositoriesSQL;

import edu.itm.ejemplo.entitiesSQL.Estudiante;
import edu.itm.ejemplo.utilities.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepository {

  @Autowired private EstudianteRepositoryHelper helper;

  public List<Estudiante> getEstudiantes() {
    List<Estudiante> result = new ArrayList<>();
    Conexion conexion = new Conexion();
    Connection connection = conexion.obtenerConexion();
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement(helper.listarEstuantes());
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
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
    } finally {
      try {
        connection.close();
        ps.close();
      } catch (Exception close) {
        close.printStackTrace();
      }
    }
    return result;
  }

  public int getNumeroEstudiantes(){
      int result = 0;
      Conexion conexion = new Conexion();
      Connection connection = conexion.obtenerConexion();
      PreparedStatement ps = null;
      try {
          ps = connection.prepareStatement(helper.getNumeroEstudiantes());
          ResultSet rs = ps.executeQuery();
          if(rs.next()) {
              return rs.getInt(1);
          }
      }catch (SQLException sqlException){
          sqlException.printStackTrace();
      } finally {
          try {
              connection.close();
              ps.close();
          } catch (Exception close) {
              close.printStackTrace();
          }
      }
      return result;
  }

  public Estudiante insertarEstudiante(Estudiante estudiante){
      Conexion conexion = new Conexion();
      Connection connection = conexion.obtenerConexion();
      PreparedStatement ps = null;
      try{
          ps = connection.prepareStatement(helper.insertarEstudiante());
          ps.setInt(1, estudiante.getIdEstudiante());
          ps.setString(2, estudiante.getNombres());
          ps.setString(3, estudiante.getApellidos());
          ps.setString(4, estudiante.getCedula());
          ps.setString(5, estudiante.getEmail());
          ps.execute();
      }catch (SQLException sqlException){
        sqlException.printStackTrace();
        estudiante = null;
      }finally{
          try {
              connection.close();
              ps.close();
          } catch (Exception close) {
              close.printStackTrace();
          }
      }
      return estudiante;
  }

}
