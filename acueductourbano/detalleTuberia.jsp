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
					Admnistraci&oacute;n de Tuberias
				</h1>
				<br>
			    <% Map obj = (Map)request.getAttribute("tuberia"); %>
				<form name="ActualizarTuberia" action="/acueductourbano/actualizarTuberia" method="get">
					<input type="hidden" name="id" value="<%= obj.get("id") %>"/>
					<table>
						<tr>
							<td>
								Material:
							</td>
							<td>
								<input type="text" name="material" size="60" value="<%= obj.get("material") %>"/>
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
								Tipo:
							</td>
							<td>
								<input type="text" name="tipo"  size="60" value="<%= obj.get("tipo") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Largo:
							</td>
							<td>
								<input type="text" name="largo" size="60" value="<%= obj.get("largo") %>"/>
							</td>
						</tr>
						<tr>
							<td>
								Presi&oacute;n M&aacute;xima:
							</td>
							<td>
								<input type="text" name="presionMaxima" size="60"  value="<%= obj.get("presion_maxima") %>"/>
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
