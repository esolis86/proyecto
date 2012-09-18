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
				<form name="AgregarMedidor" action="/acueductourbano/insertarMedidor" method="get">
					<table>
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
								Diametro:
							</td>
							<td>
								<input type="text" name="diametro" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Presi&oacute;n M&aacute;xima:
							</td>
							<td>
								<input type="text" name="presionMaxima"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Marca:
							</td>
							<td>
								<input type="text" name="marca" size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Material
							</td>
							<td>
								<input type="text" name="material" size="60"  value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha Instalaci&oacute;n:
							</td>
							<td>
								<input type="text" name="fechaInstalacion"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha Ultima Inspecci&oacute;n:
							</td>
							<td>
								<input type="text" name="fechaUltimaInspeccion"  size="60" value=""/>
							</td>
						</tr>
						<tr>
							<td>
								Estado:
							</td>
							<td>
								<input type="text" name="estado"  size="60" value=""/>
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
