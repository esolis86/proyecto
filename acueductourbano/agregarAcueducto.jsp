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
				<form name="AgregarAcueducto" action="/acueductourbano/insertarAcueducto" method="get">
					<table>
						<tr>
							<td>
								Nombre:
							</td>
							<td>
								<input type="text" name="nombre" size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Direcci&oacute;n:
							</td>
							<td>
								<input type="text" name="direccion" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Tel&eacute;fono:
							</td>
							<td>
								<input type="text" name="telefono"  size="60" value=""/>
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
