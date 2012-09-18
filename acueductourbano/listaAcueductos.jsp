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
				<% List acues = (List)request.getAttribute("acueductos"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Nombre
						</th>
						<th>
							Direcci&oacute;n
						</th>
						<th>
							Telefono
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = acues.size(); i < n; i++) {
						Map acue = (Map) acues.get(i); %>
						<tr>
							<td>
								<%= acue.get("nombre") %>
							</td>
							<td>
								<%= acue.get("direccion") %>
							</td>
							<td>
								<%= acue.get("telefono") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleAcueducto?id=<%= acue.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarAcueducto?id=<%= acue.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
								<a href='/acueductourbano/listaTuberias?id=<%= acue.get("id") %>'>
									<input type="submit" value="Tuberias" />
								</a>
								<a href='/acueductourbano/listaValvulas?id=<%= acue.get("id") %>'>
									<input type="submit" value="Valvulas" />
								</a>
								<a href='/acueductourbano/listaMedidores?id=<%= acue.get("id") %>'>
									<input type="submit" value="Medidores" />
								</a>
								<a href='/acueductourbano/listaEstacionBombeos?id=<%= acue.get("id") %>'>
									<input type="submit" value="Estaciones de Bombeo" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarAcueducto' style="text-decoration:none;">
					<input type="submit" value="Agregar Nuevo Acueducto" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>