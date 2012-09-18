package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.BombaModule;

public class EliminarBomba extends PageController {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) 
    throws ServletException, IOException {
    BombaModule module = (BombaModule) context.getBean("bombaModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      module.eliminar(idObj); 
      response.sendRedirect("listaBombas");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}