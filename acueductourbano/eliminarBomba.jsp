<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("bomba"); %>
	  <form name="EliminarBomba" action="/acueductourbano/eliminarBomba" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>