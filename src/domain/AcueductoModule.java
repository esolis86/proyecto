package domain;

import data.TableGateway;
import data.AcueductoGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class AcueductoModule {
  private AcueductoGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (AcueductoGateway)gateway;
  }
  public void actualizar(int id,String nombre,String direccion,String telefono) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de acueducto incorrecto");
    gateway.update(id,nombre,direccion,telefono);
  }
  public void insertar(String nombre,String direccion,String telefono) throws Exception {
      gateway.insert(nombre,direccion,telefono);
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de acueducto incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de acueducto incorrecto");
    Map<String,Object> acue = gateway.find(id+"");
    return acue;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> acues = gateway.findAll();
    return acues;
  }
}