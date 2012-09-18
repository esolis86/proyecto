package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.PozoModule;

public class DetallePozo extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    PozoModule module = (PozoModule) context.getBean("pozoModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      Map obj = module.buscar(idObj);
      request.setAttribute("pozo",obj);
      forward("/detallePozo.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}