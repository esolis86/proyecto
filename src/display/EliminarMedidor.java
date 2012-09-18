package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.MedidorModule;

public class EliminarMedidor extends PageController {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) 
    throws ServletException, IOException {
    MedidorModule module = (MedidorModule) context.getBean("medidorModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      module.eliminar(idObj); 
      response.sendRedirect("listaMedidores");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}