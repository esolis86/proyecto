package domain;

import data.TableGateway;
import data.EstacionBombeoGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class EstacionBombeoModule {
  private EstacionBombeoGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (EstacionBombeoGateway)gateway;
  }
  public void actualizar(int id, int presionSalida, String tipo, int capacidadMaxima, int cantidadBombas, String encargado,String telefono, int presionEntrada, int idAcueducto, String nombreEstacion) throws Exception {
    if (id <= 0)
		throw new Exception("Identificador de estación de bombeo incorrecto");
	if ((tipo.toLowerCase().equals("electrica") ||
	    tipo.toLowerCase().equals("combustible"))!= true)
			throw new Exception("Error en tipo de estación de bombeo");	
    gateway.update(id,presionSalida,tipo,capacidadMaxima,cantidadBombas,encargado,telefono,presionEntrada,idAcueducto,nombreEstacion);
  }
  public void insertar( int presionSalida, String tipo, int capacidadMaxima, int cantidadBombas, String encargado,String telefono, int presionEntrada, int idAcueducto, String nombreEstacion) throws Exception {
      if ((tipo.toLowerCase().equals("electrica") ||
	    tipo.toLowerCase().equals("combustible"))!= true)
			throw new Exception("Error en tipo de estación de bombeo");	
	  gateway.insert(presionSalida,tipo,capacidadMaxima,cantidadBombas,encargado,telefono,presionEntrada,idAcueducto,nombreEstacion);
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de estación de bombeo incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de estación de bombeo incorrecto");
    Map<String,Object> obj = gateway.find(id+"");
    return obj;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> objs = gateway.findAll();
    return objs;
  }
}