package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.ValvulaModule;

public class ActualizarValvula extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    ValvulaModule module = (ValvulaModule) context.getBean("valvulaModule");
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
	  String numeroSerie = request.getParameter("numeroSerie");
      String fechaInstalacion = request.getParameter("fechaInstalacion");
	  String fechaUltimaInspeccion = request.getParameter("fechaUltimaInspeccion");
      String estado = request.getParameter("estado");
      module.actualizar(idObj,tipo,diametroObj,presionMaximaObj,marca,numeroSerie,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueductoObj);
      response.sendRedirect("listaValvulas");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}