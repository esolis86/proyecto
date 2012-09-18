package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class AcueductoGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM acueducto "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List acues = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)acues.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM acueducto ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO acueducto "+
    "VALUES (?,?,?,?)";
  public int insert(String nombre,String direccion,String telefono) {
    Random generator = new Random();
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
         id,nombre,direccion,telefono);
    return id;
  }
  private static final String updateStatement =
    "UPDATE acueducto "+
    "SET nombre = ?, direccion = ?, telefono = ? "+
    " WHERE id = ?";
  public void update(int id,String nombre,String direccion,String telefono) {
      jdbcTemplate.update(updateStatement,
          nombre,direccion,telefono,id);
  }
  private static final String deleteStatement =
    "DELETE FROM acueducto "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}