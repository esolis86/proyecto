package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.TanqueModule;

public class DetalleTanque extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    TanqueModule module = (TanqueModule) context.getBean("tanqueModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      Map obj = module.buscar(idObj);
      request.setAttribute("tanque",obj);
      forward("/detalleTanque.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}