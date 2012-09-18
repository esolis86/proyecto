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
			    <% Map obj = (Map)request.getAttribute("pozo"); %>
				<form name="ActualizarPozo" action="/acueductourbano/actualizarPozo" method="get">
					<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
					<table>
						<tr>
							<td>
								Profundidad:
							</td>
							<td>
								<input type="text" name="profundidad" size="60" value="<%= obj.get("profundidad") %>"/>
							</td> 
						</tr>
						<tr>
							<td>
								Tipo Revestimiento:
							</td>
							<td>
								<input type="text" name="tipoRevestimiento" size="60"  value="<%= obj.get("tipo_revestimiento") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Diametro:
							</td>
							<td>
								<input type="text" name="diametro"  size="60" value="<%= obj.get("diametro") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Capacidad maxima seca:
							</td>
							<td>
								<input type="text" name="capacidadMaximaSeca" size="60" value="<%= obj.get("capacidad_maxima_seca") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Capacidad maxima lluvia:
							</td>
							<td>
								<input type="text" name="capacidadMaximaLluvia" size="60"  value="<%= obj.get("capacidad_maxima_lluvia") %>"/>
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
