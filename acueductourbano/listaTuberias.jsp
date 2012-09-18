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
					Admnistraci&oacute;n de Tuberias
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("tuberias"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Material
						</th>
						<th>
							Diametro
						</th>
						<th>
							Tipo
						</th>
						<th>
							Largo
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = objs.size(); i < n; i++) {
						Map obj = (Map) objs.get(i); %>
						<tr>
							<td>
								<%= obj.get("material") %>
							</td>
							<td>
								<%= obj.get("diametro") %>
							</td>
							<td>
								<%= obj.get("tipo") %>
							</td>
							<td>
								<%= obj.get("largo") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleTuberia?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarTuberia?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarTuberia' style="text-decoration:none;">
					<input type="submit" value="Agregar Nueva Tuberia" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>