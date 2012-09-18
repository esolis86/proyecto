package data;

import java.util.*;
import javax.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class TuberiaGateway extends TableGateway {

  private final static String findStatement =
     "SELECT * "+
     "FROM tuberia "+
     "WHERE id = ?";
  public Map<String, Object> find(String id) {
    List tubes = jdbcTemplate.queryForList(findStatement,id);
    return (Map<String, Object>)tubes.get(0);
  }
  private final static String findAllStatement =
     "SELECT * "+
     "FROM tuberia ";

  public List<Map<String, Object>> findAll() {
    return jdbcTemplate.queryForList(findAllStatement);
  }
  private static final String insertStatement =
    "INSERT INTO tuberia "+
    "VALUES (?,?,?,?,?,?,?,?,?,?)";
  public int insert(String material,int diametro,String tipo,int largo,int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) {
    Random generator = new Random();
    int id = generator.nextInt();
	if (id < 0) 
	{
		id = id * -1;
	}
      jdbcTemplate.update(insertStatement,
         id,material,diametro,tipo,largo,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
    return id;
  }
  private static final String updateStatement =
    "UPDATE tuberia "+
    "SET material = ?, diametro = ?, tipo = ?, largo = ?, presion_maxima = ?, fecha_instalacion = ?, fecha_ultima_inspeccion = ?, estado = ?, id_acueducto = ? "+
    " WHERE id = ?";
  public void update(int id,String material,int diametro,String tipo,int largo,int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) {
      jdbcTemplate.update(updateStatement,
          material,diametro,tipo,largo,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto,id);
  }
  private static final String deleteStatement =
    "DELETE FROM tuberia "+
    "WHERE id = ?";
  public void delete(int id) {
      jdbcTemplate.update(deleteStatement,id);
  }
}