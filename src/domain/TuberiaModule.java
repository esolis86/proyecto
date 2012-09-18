package domain;

import data.TableGateway;
import data.TuberiaGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class TuberiaModule {
  private TuberiaGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (TuberiaGateway)gateway;
  }
  public void actualizar(int id,String material,int diametro,String tipo,int largo,int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) throws Exception {
       if (id <= 0)
		throw new Exception("Identificador de tubería incorrecto");
	   if ((material.toLowerCase().equals("concreto") ||
			material.toLowerCase().equals("hierro") ||
			material.toLowerCase().equals("pvc")) != true)
			throw new Exception("Error en material de tubería");
		if ((tipo.toLowerCase().equals("principal") ||
			tipo.toLowerCase().equals("secundaria") ||
			tipo.toLowerCase().equals("acometida")) != true)
			throw new Exception("Error en tipo de tubería");		
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo")) != true)
			throw new Exception("Error en estado de tubería");		
		gateway.update(id,material,diametro,tipo,largo,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
  }
  public void insertar(String material,int diametro,String tipo,int largo,int presionMaxima,String fechaInstalacion,String fechaUltimaInspeccion,String estado,int idAcueducto) throws Exception {
   if ((material.toLowerCase().equals("concreto") ||
			material.toLowerCase().equals("hierro") ||
			material.toLowerCase().equals("pvc")) != true)
			throw new Exception("Error en material de tubería");
		if ((tipo.toLowerCase().equals("principal") ||
			tipo.toLowerCase().equals("secundaria") ||
			tipo.toLowerCase().equals("acometida")) != true)
			throw new Exception("Error en tipo de tubería");		
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo")) != true)
			throw new Exception("Error en estado de tubería");		
	    gateway.insert(material,diametro,tipo,largo,presionMaxima,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de tubería incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de tubería incorrecto");
    Map<String,Object> tube = gateway.find(id+"");
    return tube;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> tubes = gateway.findAll();
    return tubes;
  }
}