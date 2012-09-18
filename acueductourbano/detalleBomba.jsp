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
			    <% Map obj = (Map)request.getAttribute("bomba"); %>
				<form name="ActualizarBomba" action="/acueductourbano/actualizarBomba" method="get">
					<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
					<table>
						<tr>
							<td>
								Marca:
							</td>
							<td>
								<input type="text" name="marca" size="60" value="<%= obj.get("marca") %>"/>
							</td> 
						</tr>
						<tr>
							<td>
								Modelo:
							</td>
							<td>
								<input type="text" name="modelo" size="60"  value="<%= obj.get("modelo") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Capacidad:
							</td>
							<td>
								<input type="text" name="capacidad"  size="60" value="<%= obj.get("capacidad") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha instalacion:
							</td>
							<td>
								<input type="text" name="fechaInstalacion" size="60" value="<%= obj.get("fecha_instalacion") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha ultimo mantenimiento:
							</td>
							<td>
								<input type="text" name="fechaUltimoMantenimiento" size="60"  value="<%= obj.get("fecha_ultimo_mantenimiento") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Estado:
							</td>
							<td>
								<input type="text" name="estado"  size="60" value="<%= obj.get("estado") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Pozo :
							</td>
							<td>
								<input type="text" name="idPozo"  size="60" value="<%= obj.get("id_pozo") %>"/>
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
