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
			    <% Map obj = (Map)request.getAttribute("tanque"); %>
				<form name="ActualizarTanque" action="/acueductourbano/actualizarTanque" method="get">
					<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
					<table>
						<tr>
							<td>
								Capacidad:
							</td>
							<td>
								<input type="text" name="capacidad" size="60" value="<%= obj.get("capacidad") %>"/>
							</td> 
						</tr>
						<tr>
							<td>
								Tipo:
							</td>
							<td>
								<input type="text" name="tipo" size="60"  value="<%= obj.get("tipo") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha Instalacion
							</td>
							<td>
								<input type="text" name="fechaInstalacion"  size="60" value="<%= obj.get("fecha_instalacion") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha Ultima Inspeccion:
							</td>
							<td>
								<input type="text" name="fechaUltimaInspeccion" size="60" value="<%= obj.get("fecha_ultima_inspeccion") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Estado:
							</td>
							<td>
								<input type="text" name="estado" size="60"  value="<%= obj.get("estado") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Estacion bombeo:
							</td>
							<td>
								<input type="text" name="idEstacionBombeo"  size="60" value="<%= obj.get("id_estacion_bombeo") %>"/>
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
