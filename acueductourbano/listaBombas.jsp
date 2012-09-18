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
					Admnistraci&oacute;n de Bombas
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("bombas"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Marca
						</th>
						<th>
							Modelo
						</th>
						<th>
							Capacidad
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = objs.size(); i < n; i++) {
						Map obj = (Map) objs.get(i); %>
						<tr>
							<td>
								<%= obj.get("marca") %>
							</td>
							<td>
								<%= obj.get("modelo") %>
							</td>
							<td>
								<%= obj.get("capacidad") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleBomba?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarBomba?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarBomba' style="text-decoration:none;">
					<input type="submit" value="Agregar Nueva Bomba" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>