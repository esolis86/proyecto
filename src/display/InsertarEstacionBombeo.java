package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.EstacionBombeoModule;

public class InsertarEstacionBombeo extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
    EstacionBombeoModule module = (EstacionBombeoModule) context.getBean("estacionBombeoModule");
    try {
		  String presionSalida = request.getParameter("presionSalida");
		  int presionSalidaObj = Integer.parseInt(presionSalida);
		  String presionEntrada = request.getParameter("presionEntrada");
		  int presionEntradaObj = Integer.parseInt(presionEntrada);
		  String cantidadBombas = request.getParameter("cantidadBombas");
		  int cantidadBombasObj = Integer.parseInt(cantidadBombas);
		  String capacidadMaxima = request.getParameter("capacidadMaxima");
		  int capacidadMaximaObj = Integer.parseInt(cantidadBombas);
		  String idAcueducto = request.getParameter("idAcueducto");
		  int idAcueductoObj = Integer.parseInt(idAcueducto);
		  String encargado = request.getParameter("encargado");
		  String tipo = request.getParameter("tipo");
		  String telefono = request.getParameter("telefono");
		  String nombreEstacion = request.getParameter("nombreEstacion");
		  module.insertar(presionSalidaObj,tipo,capacidadMaximaObj,cantidadBombasObj,encargado,telefono,presionEntradaObj,idAcueductoObj,nombreEstacion);
		 response.sendRedirect("listaEstacionBombeos");
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward(e.getMessage(),request,response);
    }
  }
}