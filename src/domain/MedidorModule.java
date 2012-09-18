package domain;

import data.TableGateway;
import data.MedidorGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class MedidorModule {
  private MedidorGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (MedidorGateway)gateway;
  }
  public void actualizar(int id,String material,String marca ,String tipo, int diametro, int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) throws Exception {
    if (id <= 0)
		throw new Exception("Identificador de medidor incorrecto");
	  if ((material.toLowerCase().equals("concreto") ||
			material.toLowerCase().equals("hierro") ||
			material.toLowerCase().equals("pvc")) != true)
			throw new Exception("Error en material de medidor");
		if ((tipo.toLowerCase().equals("chorro unico") ||
			tipo.toLowerCase().equals("chorro multiple") ||
			tipo.toLowerCase().equals("paleta")) != true)
			throw new Exception("Error en tipo de medidor");		
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo"))!= true)
			throw new Exception("Error en estado de medidor");			
    gateway.update(id,material,marca,tipo,diametro,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
  }
  public void insertar(String material,String marca ,String tipo, int diametro, int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) throws Exception {
	     if ((material.toLowerCase().equals("concreto") ||
			material.toLowerCase().equals("hierro") ||
			material.toLowerCase().equals("pvc")) != true)
			throw new Exception("Error en material de medidor");
			
		if ((tipo.toLowerCase().equals("chorro unico") ||
			tipo.toLowerCase().equals("chorro multiple") ||
			tipo.toLowerCase().equals("paleta")) != true)
			throw new Exception("Error en tipo de medidor");
			
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo"))!= true)
			throw new Exception("Error en estado de medidor");		
	  gateway.insert(material,marca,tipo,diametro,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de medidor incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de medidor incorrecto");
    Map<String,Object> obj = gateway.find(id+"");
    return obj;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> objs = gateway.findAll();
    return objs;
  }
}