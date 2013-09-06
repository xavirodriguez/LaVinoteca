<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="es-ES">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>La Vinoteca</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/jquery-1.9.1.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/vinoteca.js"></script>
</head>
<body>
	<div class="container">
		<header id="page-header" class="page-header">
			<div class="row">
				<div id="h1-nav" class="col-md-9">
					<h1 id="h1-principal">La vinoteca</h1>
					<h3>Tu tienda de vinos en internet</h3>
				</div>
				<div id="selector-vino" class="col-md-3">
					<nav class="row">
						<ul class="col-md-4" id="tinto"><a href="#">Tinto</a>
						</ul>
						<ul class="col-md-4" id="blanco"><a href="#"> Blanco</a>
						</ul>
						<ul class="col-md-4" id="rosado"><a href="#">Rosado</a>
						</ul>
					</nav>
				</div>
			</div>
			<div class="row" id="barra-buscador">
				<div class="col-md-8" id="buscador">
					<form name="search" action="#" method="get">
					
					<select>
					    <option value="todo"> Todo </option>
					    <option value="anyocosecha"> A&ntilde;o de cosecha </option>
					    <option value="bodega">Bodega</option>  
						<optgroup label="Categoria"> 
						    <option value="cosecha">Cosecha</option> 
						    <option value="crianza">Crianza</option>  
						    <option value="reserva">Reserva</option>  
						    <option value="granreserva">Gran Reserva</option>  
						</optgroup>  
						<optgroup label="Tipo">  
						    <option value="tinto">Tinto</option>  
						    <option value="blanco">Blanco</option>  
						    <option value="rosado">Rosado</option>  
						</optgroup>  
					</select> 
					<input type="text" name="words" size="40"> <input
							type="submit" value="Submit">
					</form>
				</div>
				<div class="col-md-4" id="botonera">
					<a href="#"> <img src="img/cart.png" alt="carrito" /></a> <a
						href="#"> <img src="img/lock.png" alt="acceso usuarios" /></a> <a
						href="#"> <img src="img/comments.png" alt="contacta" /></a>
				</div>
			</div>
		</header>