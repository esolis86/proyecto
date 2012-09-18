package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class EstacionBombeoGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM estacion_bombeo "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List objs = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)objs.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM estacion_bombeo ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO estacion_bombeo "+
    "VALUES (?,?,?,?,?,?,?,?,?,?)";
  public int insert(int presionSalida, String tipo, int capacidadMaxima, int cantidadBombas, String encargado,String telefono, int presionEntrada, int idAcueducto, String nombreEstacion) {
    Random generator = new Random();
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
         id,presionSalida,tipo,capacidadMaxima,cantidadBombas,encargado,telefono,presionEntrada,idAcueducto,nombreEstacion);
    return id;
  }
  private static final String updateStatement =
    "UPDATE estacion_bombeo "+
    "SET presion_salida = ?,tipo = ?,capacidad_maxima = ?,cantidad_bombas = ?,encargado = ?,telefono = ?,presion_entrada = ?,id_acueducto = ?, nombre_estacion = ?"+
    " WHERE id = ?";
  public void update(int id, int presionSalida, String tipo, int capacidadMaxima, int cantidadBombas, String encargado,String telefono, int presionEntrada, int idAcueducto, String nombreEstacion) {
      jdbcTemplate.update(updateStatement,
			presionSalida,tipo,capacidadMaxima,cantidadBombas,encargado,telefono,presionEntrada,idAcueducto,nombreEstacion,id);
  }
  private static final String deleteStatement =
    "DELETE FROM estacion_bombeo "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}