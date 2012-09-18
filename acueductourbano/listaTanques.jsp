<%@ page import="java.util.*" %>
<html>
	<head>
		<%@ include file="style.jsp" %>
	</head>
	<body>
		<div class="container" id="page">
			<%@ include file="menu.jsp" %>
				<%@ include file="submenuEstacionBombeo.jsp" %>
			<div id="content">
				<h1>
					Admnistraci&oacute;n de Tanques
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("tanques"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Capacidad
						</th>
						<th>
							Tipo
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = objs.size(); i < n; i++) {
						Map obj = (Map) objs.get(i); %>
						<tr>
							<td>
								<%= obj.get("capacidad") %>
							</td>
							<td>
								<%= obj.get("tipo") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleTanque?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarTanque?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarTanque' style="text-decoration:none;">
					<input type="submit" value="Agregar Nuevo Tanque" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>