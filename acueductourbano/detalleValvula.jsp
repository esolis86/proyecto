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
			    <% Map obj = (Map)request.getAttribute("valvula"); %>
				<form name="ActualizarValvula" action="/acueductourbano/actualizarValvula" method="get">
					<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
					<table>
						<tr>
							<td>
								Tipo:
							</td>
							<td>
								<input type="text" name="tipo" size="60" value="<%= obj.get("tipo") %>"/>
							</td> 
						</tr>
						<tr>
							<td>
								Diametro:
							</td>
							<td>
								<input type="text" name="diametro" size="60"  value="<%= obj.get("diametro") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Presi&oacute;n M&aacute;xima:
							</td>
							<td>
								<input type="text" name="presionMaxima"  size="60" value="<%= obj.get("presion_maxima") %>"/>
							</td>
						</tr>
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
								N&uacute;mero de Serie:
							</td>
							<td>
								<input type="text" name="numeroSerie" size="60"  value="<%= obj.get("numero_serie") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha Instalaci&oacute;n:
							</td>
							<td>
								<input type="text" name="fechaInstalacion"  size="60" value="<%= obj.get("fecha_instalacion") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Fecha Ultima Inspecci&oacute;n:
							</td>
							<td>
								<input type="text" name="fechaUltimaInspeccion"  size="60" value="<%= obj.get("fecha_ultima_inspeccion") %>"/>
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
								Acueducto:
							</td>
							<td>
								<input type="text" name="idAcueducto"  size="60" value="<%= obj.get("id_acueducto") %>"/>
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
