package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.BombaModule;

public class DetalleBomba extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    BombaModule module = (BombaModule) context.getBean("bombaModule");
    try {
      String id = request.getParameter("id");
      int idObj = Integer.parseInt(id);
      Map obj = module.buscar(idObj);
      request.setAttribute("bomba",obj);
      forward("/detalleBomba.jsp",request,response);
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}