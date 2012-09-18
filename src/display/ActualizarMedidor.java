package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.MedidorModule;

public class ActualizarMedidor extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    MedidorModule module = (MedidorModule) context.getBean("medidorModule");
    try {
		  String id = request.getParameter("id");
		  int idObj = Integer.parseInt(id);
		  String diametro = request.getParameter("diametro");
		  int diametroObj = Integer.parseInt(diametro);
		  String presionMaxima = request.getParameter("presionMaxima");
		  int presionMaximaObj = Integer.parseInt(presionMaxima);
		  String idAcueducto = request.getParameter("idAcueducto");
		  int idAcueductoObj = Integer.parseInt(idAcueducto);
		  String marca = request.getParameter("marca");
		  String tipo = request.getParameter("tipo");
		  String material = request.getParameter("material");
		  String fechaInstalacion = request.getParameter("fechaInstalacion");
		  String fechaUltimaInspeccion = request.getParameter("fechaUltimaInspeccion");
		  String estado = request.getParameter("estado");
		  module.actualizar(idObj,material,marca,tipo,diametroObj,presionMaximaObj,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueductoObj);
		  response.sendRedirect("listaMedidores");
    } catch (Exception e) {
		  request.setAttribute("mensaje",e.getMessage());
		  forward(e.getMessage(),request,response);
    }
  }
}