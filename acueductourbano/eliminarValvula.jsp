<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("valvula"); %>
	  <form name="EliminarValvula" action="/acueductourbano/eliminarValvula" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>