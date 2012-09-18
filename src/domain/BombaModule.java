package domain;

import data.TableGateway;
import data.BombaGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class BombaModule {
  private BombaGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (BombaGateway)gateway;
  }
  public void actualizar(int id ,String marca , String modelo ,int capacidad ,String fechaInstalacion ,String fechaUltimoMantenimiento ,String estado ,int idEstacionBombeo , int idPozo ) throws Exception {
    if (id <= 0)
		throw new Exception("Identificador de bomba incorrecto");
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo")) != true)
			throw new Exception("Error en estado de bomba");			
    gateway.update(id,marca,modelo,capacidad,fechaInstalacion,fechaUltimoMantenimiento,estado,idEstacionBombeo,idPozo );
  }
  public void insertar(String marca , String modelo ,int capacidad ,String fechaInstalacion ,String fechaUltimoMantenimiento ,String estado ,int idEstacionBombeo , int idPozo ) throws Exception {
     	if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo"))!= true)
			throw new Exception("Error en estado de bomba");		
	 gateway.insert(marca,modelo,capacidad,fechaInstalacion,fechaUltimoMantenimiento,estado,idEstacionBombeo,idPozo );
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de bomba incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de bomba incorrecto");
    Map<String,Object> obj = gateway.find(id+"");
    return obj;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> objs = gateway.findAll();
    return objs;
  }
}