<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("medidor"); %>
	  <form name="EliminarMedidor" action="/acueductourbano/eliminarMedidor" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>