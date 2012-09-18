<%@ page import="java.util.Map" %>
<html>
  <head>
   <%@ include file="style.jsp" %>
<body>
<div class="container" id="page">
	<%@ include file="menu.jsp" %>
	<div id="content">
		<h1>
			Administrador General Para Acueductos Urbanos
		</h1>
		</br>
		<h1>
			Problematica a resolver :
		</h1>
		</br>
		<P> 
		    El Sistema de Inventario del  Acueducto  Urbano d e una  ciudad incluye  información sobre la red de tuberías, válvulas, medidores,  estaciones de bombeo, 
			pozos y tanques de almacenamiento. Sobre cada tubería se almacena su material (concreto, hierro, pvc), diámetro, tipo (principal,  secundaria, acometida), 
			largo, presión máxima, fecha de instalación, fecha de última inspección y estado (bueno, regular, malo). De cada válvula se almacena información sobre su 
			tipo (compuerta, macho, de globo, de bola, de  mariposa, etc.), diámetro, presión máxima, marca, número de serie, fecha de instalación,  fecha de última 
			inspección y estado (bueno, regular, malo).  Sobre los  medidores también se almacena información importante como: material, marca, tipo (chorro único, 
			chorro múltiple, tipo paleta, etc.),  diámetro,  presión de trabajo,  fecha de instalación, fecha  de última  inspección y estado (bueno, regular, malo). 
		</P> 	
		</br>
		<P> 	
			Adicionalmente, de cada medidor se guardan las últimas 10 lecturas que se han realizado incluyendo la fecha, medición, y persona que la realizó.
		</P> 
		</br>
		<p>
			Sobre cada estación de bombeo se incluye información sobre:presión de entrada, presión de salida, tipo (eléctrica, combustible), capacidad máxima, cantidad 
			de bombas, encargado de la estación, y teléfono. Sobre cada bomba individual se almacena: su marca, modelo, capacidad, fecha de instalación, fecha de último
			mantenimiento, y estado actual. Para cada pozo se guarda  información sobre: profundidad, tipo de revestimiento (hierro, pvc, concreto), diámetro, capacidad 
			máxima en época seca, capacidad máxima en época lluviosa.   Adicionalmente, cada pozo requiere de una o varias bombas. Para cada tanque de almacenamiento se 
			guarda: su  capacidad,  material (hierro,  concreto), tipo  (aéreo, en el terreno),  fecha  de  instalación, fecha  de última inspección, y estado general.
		</P>
	</div>
	<div class="clear"></div>
			<%@ include file="pie_pagina.jsp" %>
	</div>
</body>
</html>