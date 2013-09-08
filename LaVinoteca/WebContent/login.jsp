<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<form method="post" id="formulario" action="auth">
<div class="col-md-6">
	<p><label for="usuario">Usuario</label></p>
	<p><label for="password">Constraseña</label></p>
</div>
<div class="col-md-6">
	<p><input type="text" size="20" name="usuario" id="usuario" /></p>
	<p><input type="text" size="20" name="password" id="password" /></p>
	<p><input type="submit" value="enviar" /></p>
</div>
</form>