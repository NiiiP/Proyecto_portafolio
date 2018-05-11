<%-- 
    Document   : login
    Created on : 02-04-2018, 17:20:16
    Author     : basti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        
        <title>Municipalidad Vista Hermosa</title>
    </head>
    <body bgcolor="#008B8B">
        

  <div class="wrapper">
	<div class="container">
		<h1>Bienvenido a la Municipalidad de Vista Hermosa</h1>

                
		
		<form action="Controller" method="post">
			<input type="hidden" name="action" value="login"/>
			<input type="text" name="usuario" required="" placeholder="Nombre de usuario">
			<input type="password" name="password" required="" placeholder="Contraseña">
			<button type="submit" value="Login" >Ingresar</button>
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  

    <script  src="js/index.js"></script>




</body>
</html>
