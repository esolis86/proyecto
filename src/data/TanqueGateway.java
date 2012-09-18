package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class TanqueGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM tanque "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List objs = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)objs.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM tanque ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO tanque "+
    "VALUES (?,?,?,?,?,?,?)";
  public int insert(int capacidad,String tipo,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idEstacionBombeo) {
    Random generator = new Random(); 
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
			id,capacidad,tipo,fechaInstalacion,fechaUltimaInspeccion,estado,idEstacionBombeo);
    return id;
  }
  private static final String updateStatement =
    "UPDATE tanque "+
    "SET capacidad = ?,tipo = ?,fecha_instalacion = ?,fecha_ultima_inspeccion = ?,estado = ?,id_estacion_bombeo = ? "+
    " WHERE id = ?";
  public void update(int id,int capacidad,String tipo,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idEstacionBombeo) {
      jdbcTemplate.update(updateStatement,
				capacidad,tipo,fechaInstalacion,fechaUltimaInspeccion,estado,idEstacionBombeo,id);
  }
  private static final String deleteStatement =
    "DELETE FROM tanque "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}