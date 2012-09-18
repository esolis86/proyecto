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
					Admnistraci&oacute;n de Estaciones de Bombeo
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("estacionBombeos"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Nombre
						</th>
						<th>
							Encargado
						</th>
						<th>
							Tel&eacute;fono
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = objs.size(); i < n; i++) {
						Map obj = (Map) objs.get(i); %>
						<tr>
							<td>
								<%= obj.get("nombre_estacion") %>
							</td>
							<td>
								<%= obj.get("encargado") %>
							</td>
							<td>
								<%= obj.get("telefono") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleEstacionBombeo?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarEstacionBombeo?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
								<a href='/acueductourbano/listaPozos?id=<%= obj.get("id") %>'>
									<input type="submit" value="Pozos" />
								</a>
									<a href='/acueductourbano/listaBombas?id=<%= obj.get("id") %>'>
									<input type="submit" value="Bombas" />
								</a>
									<a href='/acueductourbano/listaTanques?id=<%= obj.get("id") %>'>
									<input type="submit" value="Tanques" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarEstacionBombeo' style="text-decoration:none;">
					<input type="submit" value="Agregar Nueva Estacion de Bombeo" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>