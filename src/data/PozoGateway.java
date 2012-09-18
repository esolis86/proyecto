package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class PozoGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM pozo "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List objs = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)objs.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM pozo ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO pozo "+
    "VALUES (?,?,?,?,?,?,?)";
  public int insert(int profundidad,String tipoRevestimiento,int diametro,int capacidadMaximaSeca,int capacidadMaximaLluvia,int idEstacionBombeo) {
    Random generator = new Random(); 
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
			id,profundidad,tipoRevestimiento,diametro,capacidadMaximaSeca,capacidadMaximaLluvia,idEstacionBombeo);
    return id;
  }
  private static final String updateStatement =
    "UPDATE pozo "+
    "SET profundidad = ?,tipo_revestimiento = ?,diametro = ?,capacidad_maxima_seca = ?,capacidad_maxima_lluvia = ?,id_estacion_bombeo = ? "+
    " WHERE id = ?";
  public void update(int id,int profundidad,String tipoRevestimiento,int diametro,int capacidadMaximaSeca,int capacidadMaximaLluvia,int idEstacionBombeo) {
      jdbcTemplate.update(updateStatement,
				profundidad,tipoRevestimiento,diametro,capacidadMaximaSeca,capacidadMaximaLluvia,idEstacionBombeo,id);
  }
  private static final String deleteStatement =
    "DELETE FROM pozo "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}