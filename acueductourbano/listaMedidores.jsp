<%@ page import="java.util.*" %>
<html>
	<head>
		<%@ include file="style.jsp" %>
	</head>
	<body>
		<div class="container" id="page">
			<%@ include file="menu.jsp" %>
				<div id="mainmenu">
			<ul id="yw0">
				<li>
					<a href="/acueductourbano/Lecturas">
						Lecturas
					</a>
				</li>
			</div>
			<div id="content">
				<h1>
					Admnistraci&oacute;n de Medidores
				</h1>
				<br>
				<% List objs = (List)request.getAttribute("medidores"); %>
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
							Material
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
								<%= obj.get("material") %>
							</td>
							<td>
								<a href='/acueductourbano/detalleMedidor?id=<%= obj.get("id") %>'>
									<input type="submit" value="Detalle" />
								</a>
								<a href='/acueductourbano/eliminarMedidor?id=<%= obj.get("id") %>'>
									<input type="submit" value="Eliminar" />
								</a>
								<a href='/acueductourbano/listaLecturas?id=<%= obj.get("id") %>'>
									<input type="submit" value="Lecturas" />
								</a>
							</td>
						</tr>
					<% } %>
				</table>
				<a href='/acueductourbano/agregarMedidor' style="text-decoration:none;">
					<input type="submit" value="Agregar Nuevo Medidor" />
				</a>
			</div>
			<div class="clear">
				<%@ include file="pie_pagina.jsp" %>
			</div>
		</div>
	</body>
</html>