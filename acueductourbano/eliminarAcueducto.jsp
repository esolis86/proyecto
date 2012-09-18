<%@ page import="java.util.Map" %>
<html>
	  <% Map acue = (Map)request.getAttribute("acueducto"); %>
	  <form name="EliminarAcueducto" action="/acueductourbano/eliminarAcueducto" method="get">
			<input type="hidden" name="id" value="<%= acue.get("id") %>"/>
	  </form>
</html>