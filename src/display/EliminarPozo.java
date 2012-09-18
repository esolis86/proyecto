package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.PozoModule;

public class EliminarPozo extends PageController {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) 
    throws ServletException, IOException {
    PozoModule module = (PozoModule) context.getBean("pozoModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      module.eliminar(idObj); 
      response.sendRedirect("listaPozos");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}