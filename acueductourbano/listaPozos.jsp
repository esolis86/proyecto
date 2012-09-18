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
					Admnistraci&oacute;n de Pozos
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("pozos"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Profundidad
						</th>
						<th>
							Tipo Revestimiento
						</th>
						<th>
							Diametro
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = objs.size(); i < n; i++) {
						Map obj = (Map) objs.get(i); %>
						<tr>
							<td>
								<%= obj.get("profundidad") %>
							</td>
							<td>
								<%= obj.get("tipo_revestimiento") %>
							</td>
							<td>
								<%= obj.get("diametro") %>
							</td>
							<td>
								<a href='/acueductourbano/detallePozo?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarPozo?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
								<a href='/acueductourbano/listaBombas?id=<%= obj.get("id") %>'>
									<input type="submit" value="Bombas" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarPozo' style="text-decoration:none;">
					<input type="submit" value="Agregar Nuevo Pozo" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>