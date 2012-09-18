package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.PozoModule;

public class InsertarPozo extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    PozoModule module = (PozoModule) context.getBean("pozoModule");
    try {
		  String profundidad  = request.getParameter("profundidad");
		  int profundidadObj = Integer.parseInt(profundidad );
		  String diametro  = request.getParameter("diametro");
		  int diametroObj = Integer.parseInt(diametro);
		  String capacidadMaximaSeca  = request.getParameter("capacidadMaximaSeca");
		  int capacidadMaximaSecaObj = Integer.parseInt(capacidadMaximaSeca );
		  String capacidadMaximaLluvia  = request.getParameter("capacidadMaximaLluvia");
		  int capacidadMaximaLluviaObj = Integer.parseInt(capacidadMaximaLluvia );
		  String idEstacionBombeo  = request.getParameter("idEstacionBombeo");
		  int idEstacionBombeoObj = Integer.parseInt(idEstacionBombeo );
		  
		  String tipoRevestimiento = request.getParameter("tipoRevestimiento");
		  module.insertar(profundidadObj,tipoRevestimiento,diametroObj,capacidadMaximaSecaObj,capacidadMaximaLluviaObj,idEstacionBombeoObj );
		  response.sendRedirect("listaPozos");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}