<%@ page import="java.util.Map" %>
<html>
	  <% Map obj = (Map)request.getAttribute("pozo"); %>
	  <form name="EliminarPozo" action="/acueductourbano/eliminarPozo" method="get">
			<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
	  </form>
</html>