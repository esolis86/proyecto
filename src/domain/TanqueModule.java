package domain;

import data.TableGateway;
import data.TanqueGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class TanqueModule {
  private TanqueGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (TanqueGateway)gateway;
  }
  public void actualizar(int id,int capacidad,String tipo,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idEstacionBombeo) throws Exception {
    if (id <= 0)
		throw new Exception("Identificador de tanque incorrecto");
		
    gateway.update(id,capacidad,tipo,fechaInstalacion,fechaUltimaInspeccion,estado,idEstacionBombeo);
  }
  public void insertar(int capacidad,String tipo,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idEstacionBombeo) throws Exception {
  
      gateway.insert(capacidad,tipo,fechaInstalacion,fechaUltimaInspeccion,estado,idEstacionBombeo);
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de tanque incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de tanque incorrecto");
    Map<String,Object> obj = gateway.find(id+"");
    return obj;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> objs = gateway.findAll();
    return objs;
  }
}