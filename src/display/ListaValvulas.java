package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.ValvulaModule;

public class ListaValvulas extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    ValvulaModule module = (ValvulaModule) context.getBean("valvulaModule");
    try 
	{
        List data = module.listado();
		request.setAttribute("valvulas",data);
		forward("/listaValvulas.jsp",request,response);
    } catch (Exception e) {
	 
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}