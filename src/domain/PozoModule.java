package domain;

import data.TableGateway;
import data.PozoGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class PozoModule {
  private PozoGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (PozoGateway)gateway;
  }
  public void actualizar(int id,int profundidad,String tipoRevestimiento,int diametro,int capacidadMaximaSeca,int capacidadMaximaLluvia,int idEstacionBombeo) throws Exception {
    if (id <= 0)
		throw new Exception("Identificador de pozo incorrecto");
		
	 if ((tipoRevestimiento.toLowerCase().equals("concreto") ||
			tipoRevestimiento.toLowerCase().equals("hierro") ||
			tipoRevestimiento.toLowerCase().equals("pvc"))!= true)
			throw new Exception("Error en tipo de revestimiento de medidor");

			
    gateway.update(id,profundidad,tipoRevestimiento,diametro,capacidadMaximaSeca,capacidadMaximaLluvia,idEstacionBombeo);
  }
  public void insertar(int profundidad,String tipoRevestimiento,int diametro,int capacidadMaximaSeca,int capacidadMaximaLluvia,int idEstacionBombeo) throws Exception {
       if ((tipoRevestimiento.toLowerCase().equals("concreto") ||
			tipoRevestimiento.toLowerCase().equals("hierro") ||
			tipoRevestimiento.toLowerCase().equals("pvc"))!= true)
			throw new Exception("Error en tipo de revestimiento de medidor");

	  gateway.insert(profundidad,tipoRevestimiento,diametro,capacidadMaximaSeca,capacidadMaximaLluvia,idEstacionBombeo );
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de pozo incorrecto");
      gateway.delete(id);
	  
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de pozo incorrecto");
    Map<String,Object> obj = gateway.find(id+"");
    return obj;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> objs = gateway.findAll();
    return objs;
  }
}