package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class MedidorGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM medidor "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List objs = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)objs.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM medidor ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO medidor "+
    "VALUES (?,?,?,?,?,?,?,?,?,?)";
  public int insert(String material,String marca ,String tipo, int diametro, int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) {
    Random generator = new Random();
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
         id,material,marca,tipo,diametro,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
    return id;
  }
  private static final String updateStatement =
    "UPDATE medidor "+
    "SET material = ?,marca = ?,tipo = ?,diametro = ?,presion_maxima = ?,fecha_instalacion = ?,fecha_ultima_inspeccion = ?,estado = ?,id_acueducto = ?"+
    " WHERE id = ?";
  public void update(int id,String material,String marca ,String tipo, int diametro, int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) {
      jdbcTemplate.update(updateStatement,
			material,marca,tipo,diametro,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto,id);
  }
  private static final String deleteStatement =
    "DELETE FROM medidor "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}