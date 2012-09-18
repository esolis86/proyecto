package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.TuberiaModule;

public class ListaTuberias extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    TuberiaModule module = (TuberiaModule) context.getBean("tuberiaModule");
    try 
	{
        List data = module.listado();
		request.setAttribute("tuberias",data);
		forward("/listaTuberias.jsp",request,response);
    } catch (Exception e) {
	 
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}