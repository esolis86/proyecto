<%@ page import="java.util.*" %>
<html>
	<head>
		<%@ include file="style.jsp" %>
	</head>
	<body>
		<div class="container" id="page">
			<%@ include file="menu.jsp" %>
			<div id="content">
				<h1>
					Admnistraci&oacute;n de Acueductos
				</h1>
				<br>
			    <% Map acue = (Map)request.getAttribute("acueducto"); %>
				<form name="ActualizarAcueducto" action="/acueductourbano/actualizarAcueducto" method="get">
					<input type="hidden" name="id" value="<%= acue.get("id") %>"/>
					<table>
						<tr>
							<td>
								Nombre:
							</td>
							<td>
								<input type="text" name="nombre" size="60" value="<%= acue.get("nombre") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Direcci&oacute;n:
							</td>
							<td>
								<input type="text" name="direccion" size="60"  value="<%= acue.get("direccion") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Tel&eacute;fono:
							</td>
							<td>
								<input type="text" name="telefono"  size="60" value="<%= acue.get("telefono") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Acciones
							</td>
							<td>
								<input type="submit" value="Actualizar" />
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>
