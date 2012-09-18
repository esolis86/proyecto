<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("estacionBombeo"); %>
	  <form name="EliminarEstacionBombeo" action="/acueductourbano/eliminarEstacionBombeo" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>