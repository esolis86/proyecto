package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.ValvulaModule;

public class DetalleValvula extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    ValvulaModule module = (ValvulaModule) context.getBean("valvulaModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      Map obj = module.buscar(idObj);
      request.setAttribute("valvula",obj);
      forward("/detalleValvula.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}