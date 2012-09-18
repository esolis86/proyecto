package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class BombaGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM bomba "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List objs = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)objs.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM bomba ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO bomba "+
    "VALUES (?,?,?,?,?,?,?,?,?)";
  public int insert(String marca , String modelo ,int capacidad ,String fechaInstalacion ,String fechaUltimoMantenimiento ,String estado ,int idEstacionBombeo , int idPozo  ) {
    Random generator = new Random(); 
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
         id,marca,modelo,capacidad,fechaInstalacion,fechaUltimoMantenimiento,estado,idEstacionBombeo,idPozo );
    return id;
  }
  private static final String updateStatement =
    "UPDATE bomba "+
    "SET marca = ?,modelo = ?,capacidad = ?,fecha_instalacion = ?,fecha_ultimo_mantenimiento = ?,estado = ?,id_estacion_bombeo = ?,id_pozo = ? "+
    " WHERE id = ?";
  public void update(int id ,String marca , String modelo ,int capacidad ,String fechaInstalacion ,String fechaUltimoMantenimiento ,String estado ,int idEstacionBombeo , int idPozo ) {
      jdbcTemplate.update(updateStatement,
				marca,modelo,capacidad,fechaInstalacion,fechaUltimoMantenimiento,estado,idEstacionBombeo,idPozo,id);
  }
  private static final String deleteStatement =
    "DELETE FROM bomba "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}