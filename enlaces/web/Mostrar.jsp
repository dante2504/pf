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
                 <table border="2">   
                    <tr>
                        <td>Eliminar</td>
                        <td>Codigo</td>    <!--columnas-->
                        <td>Nombre</td>     
                        <td>Apellido</td>
                        <td>Dni</td>
                        <td>Telefono</td>
                        <td>Direccion</td>
                        <td>Correo</td>
                        <td>Edad</td>
                        <td>Clave</td>
                        <td>Codigo Apoderado</td>
                        <td>Codigo Modulo</td>
                    </tr>
                <% for(AlumnoBean objpb:lista){ %> <!--filas que se obtiene del arraylist-->
                <tr>
                    <td><input type="radio" name="elegir" 
        onclick="eliminar('<%=request.getContextPath()%>','AlumnoServlet','<%=objpb.getCodAlum()%>',5)"></td> 
                    <td><%=objpb.getCodAlum()%></td>
                    <td><%=objpb.getNomAlum()%></td>
                    <td><%=objpb.getApelliAlum()%></td>
                    <td><%=objpb.getDniAlum()%></td>
                    <td><%=objpb.getTelefAlum()%></td>
                    <td><%=objpb.getDirecAlum()%></td>
                    <td><%=objpb.getCorreoAlum()%></td>
                    <td><%=objpb.getEdadAlum()%></td>
                    <td><%=objpb.getPswAlum()%></td>
                    <td><%=objpb.getCodApod1()%></td>
                    <td><%=objpb.getCodMod1()%></td>
                </tr>
       <%          } %>
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
