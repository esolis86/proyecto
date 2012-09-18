package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.AcueductoModule;

public class InsertarAcueducto extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    AcueductoModule module = (AcueductoModule) context.getBean("acueductoModule");
    try {
      String nombre = request.getParameter("nombre");
      String direccion = request.getParameter("direccion");
      String telefono = request.getParameter("telefono");
      module.insertar(nombre,direccion,telefono);
      response.sendRedirect("listaAcueductos");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}