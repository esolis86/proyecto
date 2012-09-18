package domain;

import data.TableGateway;
import data.ValvulaGateway;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;

public class ValvulaModule {
  private ValvulaGateway gateway;
  public void setGateway(TableGateway gateway) {
    this.gateway = (ValvulaGateway)gateway;
  }
  public void actualizar(int id, String tipo,int diametro,int presionMaxima, String marca,  String numeroSerie, String fechaInstalacion, String fechaUltimaInspeccion, String estado,int idAcueducto) throws Exception {
        if (id <= 0)
			throw new Exception("Identificador de valvula incorrecto");
		if ((tipo.toLowerCase().equals("macho") ||
			tipo.toLowerCase().equals("globo") ||
			tipo.toLowerCase().equals("bola")  ||
			tipo.toLowerCase().equals("mariposa")) != true)
			throw new Exception("Error en tipo de valvula");
			
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo"))!= true)
			throw new Exception("Error en estado de valvula");	
			
        gateway.update(id,tipo,diametro,presionMaxima,marca,numeroSerie,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
  }
  public void insertar( String tipo,int diametro,int presionMaxima, String marca,  String numeroSerie, String fechaInstalacion, String fechaUltimaInspeccion, String estado,int idAcueducto) throws Exception {
      	if ((tipo.toLowerCase().equals("macho") ||
			tipo.toLowerCase().equals("globo") ||
			tipo.toLowerCase().equals("bola")  ||
			tipo.toLowerCase().equals("mariposa")) != true)
			throw new Exception("Error en tipo de valvula");
			
		if ((estado.toLowerCase().equals("bueno") ||
			estado.toLowerCase().equals("regular") ||
			estado.toLowerCase().equals("malo"))!= true)
			throw new Exception("Error en estado de valvula");			
	    gateway.insert(tipo,diametro,presionMaxima,marca,numeroSerie,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueducto);
  }
  public void eliminar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de valvula incorrecto");
      gateway.delete(id);
  }
  public Map<String,Object> buscar(int id) throws Exception {
    if (id <= 0)
      throw new Exception("Identificador de valvula incorrecto");
    Map<String,Object> obj = gateway.find(id+"");
    return obj;
  }
  public List<Map<String,Object>> listado() throws Exception {
    List<Map<String,Object>> objs = gateway.findAll();
    return objs;
  }
}