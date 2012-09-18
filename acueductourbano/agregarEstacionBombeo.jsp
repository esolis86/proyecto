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
				<form name="AgregarEstacionBombeo" action="/acueductourbano/insertarEstacionBombeo" method="get">
					<table>
						<tr>
							<td>
								Nombre:
							</td>
							<td>
								<input type="text" name="nombreEstacion" size="60" value=""/>
							</td> 
						</tr>
						<tr>
							<td>
								Encargado:
							</td>
							<td>
								<input type="text" name="encargado" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Telefono:
							</td>
							<td>
								<input type="text" name="telefono"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Tipo:
							</td>
							<td>
								<input type="text" name="tipo" size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Cantidad Bombas:
							</td>
							<td>
								<input type="text" name="cantidadBombas" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Capacidad Maxima:
							</td>
							<td>
								<input type="text" name="capacidadMaxima"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Presion Salida :
							</td>
							<td>
								<input type="text" name="presionSalida"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Presion Entrada:
							</td>
							<td>
								<input type="text" name="presionEntrada"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Acueducto:
							</td>
							<td>
								<input type="text" name="idAcueducto"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Acciones:
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
