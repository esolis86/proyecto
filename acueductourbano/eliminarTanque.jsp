<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("tanque"); %>
	  <form name="EliminarTanque" action="/acueductourbano/eliminarTanque" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>