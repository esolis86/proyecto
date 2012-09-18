package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.AcueductoModule;

public class ListaAcueductos extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    AcueductoModule module = (AcueductoModule) context.getBean("acueductoModule");
    try 
	{
        List data = module.listado();
		request.setAttribute("acueductos",data);
		forward("/listaAcueductos.jsp",request,response);
    } catch (Exception e) {
	 
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}