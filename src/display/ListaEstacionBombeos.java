package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.EstacionBombeoModule;

public class ListaEstacionBombeos extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    EstacionBombeoModule module = (EstacionBombeoModule) context.getBean("estacionBombeoModule");
    try 
	{
        List data = module.listado();
		request.setAttribute("estacionBombeos",data);
		forward("/listaEstacionBombeos.jsp",request,response);
    } catch (Exception e) {
	 
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}