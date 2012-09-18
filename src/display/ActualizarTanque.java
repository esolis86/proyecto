package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.TanqueModule;

public class ActualizarTanque extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    TanqueModule module = (TanqueModule) context.getBean("tanqueModule");
    try {
	
		  String id = request.getParameter("id");
		  int idObj = Integer.parseInt(id);
	       String capacidad  = request.getParameter("capacidad");
		  int capacidadObj = Integer.parseInt(capacidad );
		  String idEstacionBombeo  = request.getParameter("idEstacionBombeo");
		  int idEstacionBombeoObj = Integer.parseInt(idEstacionBombeo );
		  
		  String estado = request.getParameter("estado");
		  String fechaUltimaInspeccion = request.getParameter("fechaUltimaInspeccion");
		  String fechaInstalacion = request.getParameter("fechaInstalacion");
		  String tipo = request.getParameter("tipo");
				  
		  module.actualizar(idObj,capacidadObj,tipo,fechaInstalacion,fechaUltimaInspeccion,estado,idEstacionBombeoObj );
	    
		  response.sendRedirect("listaTanques");
    } catch (Exception e) {
		  request.setAttribute("mensaje",e.getMessage());
		  forward(e.getMessage(),request,response);
    }
  }
}