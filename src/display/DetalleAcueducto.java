package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.AcueductoModule;

public class DetalleAcueducto extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    AcueductoModule module = (AcueductoModule) context.getBean("acueductoModule");
    try {
      String id = request.getParameter("id");
      int idAcue = Integer.parseInt(id);
      Map acue = module.buscar(idAcue);
      request.setAttribute("acueducto",acue);
      forward("/detalleAcueducto.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}