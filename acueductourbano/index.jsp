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
		    El Sistema de Inventario del  Acueducto  Urbano d e una  ciudad incluye  informaci�n sobre la red de tuber�as, v�lvulas, medidores,  estaciones de bombeo, 
			pozos y tanques de almacenamiento. Sobre cada tuber�a se almacena su material (concreto, hierro, pvc), di�metro, tipo (principal,  secundaria, acometida), 
			largo, presi�n m�xima, fecha de instalaci�n, fecha de �ltima inspecci�n y estado (bueno, regular, malo). De cada v�lvula se almacena informaci�n sobre su 
			tipo (compuerta, macho, de globo, de bola, de  mariposa, etc.), di�metro, presi�n m�xima, marca, n�mero de serie, fecha de instalaci�n,  fecha de �ltima 
			inspecci�n y estado (bueno, regular, malo).  Sobre los  medidores tambi�n se almacena informaci�n importante como: material, marca, tipo (chorro �nico, 
			chorro m�ltiple, tipo paleta, etc.),  di�metro,  presi�n de trabajo,  fecha de instalaci�n, fecha  de �ltima  inspecci�n y estado (bueno, regular, malo). 
		</P> 	
		</br>
		<P> 	
			Adicionalmente, de cada medidor se guardan las �ltimas 10 lecturas que se han realizado incluyendo la fecha, medici�n, y persona que la realiz�.
		</P> 
		</br>
		<p>
			Sobre cada estaci�n de bombeo se incluye informaci�n sobre:presi�n de entrada, presi�n de salida, tipo (el�ctrica, combustible), capacidad m�xima, cantidad 
			de bombas, encargado de la estaci�n, y tel�fono. Sobre cada bomba individual se almacena: su marca, modelo, capacidad, fecha de instalaci�n, fecha de �ltimo
			mantenimiento, y estado actual. Para cada pozo se guarda  informaci�n sobre: profundidad, tipo de revestimiento (hierro, pvc, concreto), di�metro, capacidad 
			m�xima en �poca seca, capacidad m�xima en �poca lluviosa.   Adicionalmente, cada pozo requiere de una o varias bombas. Para cada tanque de almacenamiento se 
			guarda: su  capacidad,  material (hierro,  concreto), tipo  (a�reo, en el terreno),  fecha  de  instalaci�n, fecha  de �ltima inspecci�n, y estado general.
		</P>
	</div>
	<div class="clear"></div>
			<%@ include file="pie_pagina.jsp" %>
	</div>
</body>
</html>