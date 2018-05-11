<%-- 
    Document   : MenuFuncionario
    Created on : 19-04-2018, 17:32:01
    Author     : basti
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Permiso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
         <link rel="stylesheet" href="css/estilos.css">
         <script type="text/javascript" src="js/jquery-1.12.3.min.js" ></script>
         <script type="text/javascript" src="js/script.js"></script>
         
        <title>Portal Funcionario</title>
    </head>
    <% HttpSession sesion = request.getSession();
   %>
    <body>
        <h1>Conexión correcta</h1>
        <h2>Bienvenido Sr: <%= sesion.getAttribute("nombre") %> </h2>
                      
        
        
        <div class="container"><h1>Portal del funcionario  </h1></div>
        
        <div id="prueba"
<div id="exTab1" class="container">
<ul  class="nav nav-pills">
			<li class="active">
        <a  href="#1a" data-toggle="tab">Generar permiso</a>
			</li>
			<li><a href="#2a" data-toggle="tab">Permisos generados</a>
			</li>
			
		</ul>

			<div class="tab-content clearfix">
			  <div class="tab-pane active" id="1a">
                              
                              <h3>
          <table id="datos"> 
<TR> 
   <th>Nombre: <%= sesion.getAttribute("nombre1") %> </th> 
   <th>Apellido Paterno: <%= sesion.getAttribute("apellido") %></Th> 
   <th>Apellido Materno: <%= sesion.getAttribute("apellidom") %></th>
   <td></td>
  
</TR> 

<TR> 
   <th name="rut_p">Rut: <%= sesion.getAttribute("rut") %></th> 
   <th>Mail: <%= sesion.getAttribute("mail") %></th> 
 
</TR> 
<tr>
    <th>Cargo: <%= sesion.getAttribute("nombre_cargo") %></th>
    <th>Departamento: <%= sesion.getAttribute("nombre_departamento") %></th>
</tr>
<tr>
    <c:forEach items="${permisos}" var="permisos">
            <c:forEach items="${permisos}" var="permisos">
                <h2>asd</h2>
        </c:forEach>
        </c:forEach>
</tr>


          </TABLE> </h3>
                    
                    <form action="GenerarSolicitud" method="POST">
                        <table id="datos1">
                            <tr>
                                <td> Seleccione tipo de permiso<br> 
                              <select name="seleccion_permiso">
                                        <option value="1">Permiso administrativo</option> 
                                        <option value="2" >Feriado legal anual</option>
                                        <option value="3">Fallecimiento</option>
                                        <option value="4">Permiso parental</option>
                              </select> </td>
                              
                              <td>Fecha Inicio <br> <br> <input id="fecha_i" name="fecha_i" style="position: absolute"id="date" type="date"></td>
                              
                              <td>Fecha Termino <br> <br> <input id="fecha_t" name="fecha_t" style="position: absolute"id="date" type="date"></td>
                              
                              <td>Motivo <br><br> <textarea name="motivo" style="float: right"id="comentario"></textarea></td>
                              
                              <td> <button class="btn btn-success" type="submit">Enviar</button></td>
                            </tr>
                            <tr>
                                <td>Días solicitados: <input name="dias" type="number" id="dia" size="3" maxlength="2" readonly></td>
                            </tr>
                            
                        </table>



                    </form>
                                                                               
                              
				</div>
				<div class="tab-pane" id="2a">
                                    <h3>
                                        
                                        <table class="table table-striped"> 
                                            <tr> 
                                                <th>Código</th>
                                                <th>Departamento</th>
                                                <th>Tipo de permiso</th>
                                                <th>Fecha envío</th>
                                                <th>Detalle</th>
                                                <th>Estado</th>
                                                <th>Descarga</th>
                                            </tr>     
                                            

                                            </table>
                                    </h3>
				</div>
        
          
			</div>
  </div>

    

<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        
        
        
        
        
    </body>
</html>
