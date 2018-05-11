<%-- 
    Document   : MenuAlcalde
    Created on : 28-04-2018, 17:19:21
    Author     : basti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css">
        <title>JSP Page</title>
    </head>
    <% HttpSession sesion = request.getSession();
   %>
    <body bgcolor="#008B8B">
        <h1>Conexión correcta</h1>
        <h2>Bienvenido Sr: <%= sesion.getAttribute("nombre") %> </h2>
    </body>
</html>

