package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.BombaModule;

public class InsertarBomba extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    BombaModule module = (BombaModule) context.getBean("bombaModule");
    try {
		  String idEstacionBombeo  = request.getParameter("idEstacionBombeo");
		  int idEstacionBombeoObj = Integer.parseInt(idEstacionBombeo );
		  String idPozo  = request.getParameter("idPozo");
		  int idPozoObj = Integer.parseInt(idPozo);
		  String capacidad  = request.getParameter("capacidad");
		  int capacidadObj = Integer.parseInt(capacidad );
		  
		  String marca = request.getParameter("marca");
		  String modelo = request.getParameter("modelo");
		  String fechaInstalacion  = request.getParameter("fechaInstalacion");
		  String fechaUltimoMantenimiento  = request.getParameter("fechaUltimoMantenimiento");
		  String estado  = request.getParameter("estado" );
		  
		 module.insertar(marca,modelo,capacidadObj,fechaInstalacion,fechaUltimoMantenimiento,estado,idEstacionBombeoObj,idPozoObj );
		 response.sendRedirect("listaBombas");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}