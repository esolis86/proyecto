<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("tuberia"); %>
	  <form name="EliminarTuberia" action="/acueductourbano/eliminarTuberia" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>