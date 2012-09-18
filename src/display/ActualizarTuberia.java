package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.TuberiaModule;

public class ActualizarTuberia extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    TuberiaModule module = (TuberiaModule) context.getBean("tuberiaModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
	  String diametro = request.getParameter("diametro");
      int diametroObj = Integer.parseInt(diametro);
	  String largo = request.getParameter("largo");
      int largoObj = Integer.parseInt(largo);
	  String presionMaxima = request.getParameter("presionMaxima");
      int presionMaximaObj = Integer.parseInt(presionMaxima);
	  String idAcueducto = request.getParameter("idAcueducto");
      int idAcueductoObj = Integer.parseInt(idAcueducto);
      String material = request.getParameter("material");
      String tipo = request.getParameter("tipo");
      String fechaInstalacion = request.getParameter("fechaInstalacion");
	  String fechaUltimaInspeccion = request.getParameter("fechaUltimaInspeccion");
      String estado = request.getParameter("estado");
      module.actualizar(idObj,material,diametroObj,tipo,largoObj,presionMaximaObj,fechaInstalacion,fechaUltimaInspeccion,estado,idAcueductoObj);
      response.sendRedirect("listaTuberias");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}