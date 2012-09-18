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
					Admnistraci&oacute;n de Valvulas
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("valvulas"); %>
				<table>
					<tr style="background:#6399cd;color:#ffffff;">
						<th>
							Tipo
						</th>
						<th>
							Diametro
						</th>
						<th>
							Preci&oacute;n M&aacute;xima
						</th>
						<th>
							N&uacute;mero de Serie
						</th>
						<th>
							Acciones
						</th>
					</tr>
					<% for(int i = 0, n = objs.size(); i < n; i++) {
						Map obj = (Map) objs.get(i); %>
						<tr>
							<td>
								<%= obj.get("tipo") %>
							</td>
							<td>
								<%= obj.get("diametro") %>
							</td>
							<td>
								<%= obj.get("presion_maxima") %>
							</td>
							<td>
								<%= obj.get("numero_serie") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleValvula?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarValvula?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarValvula' style="text-decoration:none;">
					<input type="submit" value="Agregar Nueva Valvula" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>