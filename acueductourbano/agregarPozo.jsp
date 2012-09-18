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
				<form name="AgregarPozo" action="/acueductourbano/insertarPozo" method="get">
				<table>
						<tr>
							<td>
								Profundidad:
							</td>
							<td>
								<input type="text" name="profundidad" size="60" value=""/>
							</td> 
						</tr>
						<tr>
							<td>
								Tipo Revestimiento:
							</td>
							<td>
								<input type="text" name="tipoRevestimiento" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Diametro:
							</td>
							<td>
								<input type="text" name="diametro"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Capacidad maxima seca:
							</td>
							<td>
								<input type="text" name="capacidadMaximaSeca" size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Capacidad maxima lluvia:
							</td>
							<td>
								<input type="text" name="capacidadMaximaLluvia" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Estacion bombeo:
							</td>
							<td>
								<input type="text" name="idEstacionBombeo"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Acciones
							</td>
							<td>
								<input type="submit" value="Agregar" />
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
