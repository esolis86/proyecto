package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.BombaModule;

public class ListaBombas extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    BombaModule module = (BombaModule) context.getBean("bombaModule");
    try 
	{
        List data = module.listado();
		request.setAttribute("bombas",data);
		forward("/listaBombas.jsp",request,response);
    } catch (Exception e) {
	 
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}