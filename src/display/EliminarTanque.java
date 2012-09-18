package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.TanqueModule;

public class EliminarTanque extends PageController {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) 
    throws ServletException, IOException {
    TanqueModule module = (TanqueModule) context.getBean("tanqueModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      module.eliminar(idObj); 
      response.sendRedirect("listaTanques");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}