<%@page import="Bean.AlumnoBean"%>  <!--se importa el paquete bean y la clase personabean-->
<%@page import="java.util.ArrayList"%>
<%!
ArrayList<AlumnoBean> lista; 
%> <!--se crea el arraylist-->
<%
  lista=(ArrayList<AlumnoBean>)request.getAttribute("lista"); 
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="<%=request.getContextPath()%>/js/javascript.js" type="text/javascript"></script>
    </head>
    <body>
        <form name="form">
        
        <input type="hidden" name="op"> 
        <input type="hidden" name="codigo">
            
            <center>
                <table border="5"> <!--borde de tabla-->
                    <tr>
                        <td>Codigo :</td>    <!--columnas-->
                        <td><input type="text" name="txtcodigo"></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>  
                        <td><input type="text" name="txtnombre"></td>
                    </tr>
                    <tr>
                        <td>Apellido</td>
                        <td><input type="text" name="txtapellido"></td>
                    </tr>
                    <tr>
                        <td>Dni</td>
                        <td><input type="text" name="txtdni"></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>
                        <td><input type="text" name="txttelefono"></td>
                    </tr>
                    <tr>
                        <td>Direccion</td>
                        <td><input type="text" name="txtdireccion"></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td><input type="text" name="txtcorreo"></td>
                    </tr>
                    <tr>
                        <td>Edad</td>
                        <td><input type="text" name="txtedad"></td>
                    </tr>
                    <tr>
                        <td>Clave</td>
                        <td><input type="text" name="txtclave"></td>
                    </tr>
                    <tr>
                        <td>Codigo Apoderado</td>
                        <td><input type="text" name="txtcodigoApoderado"></td>
                    </tr>
                    <tr>
                        <td>Codigo Modulo</td>
                        <td><input type="text" name="txtcodigoModulo"></td>
                    </tr>
                    <tr>
                        <td coldspan="2"><input type="button" value="Grabar"
                             onclick="grabar('<%=request.getContextPath()%>','AlumnoServlet',3)">
                        </td>
                    </tr>
                    <tr>
           <td>
              <input type="button" value="regresar"
                       onclick="regresar('<%=request.getContextPath()%>','AlumnoServlet',6)"> <!--boton-->
           </td>
       </tr>
       </table>
            </center>
        </form> 
    </body>
</html>
