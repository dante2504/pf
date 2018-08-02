<%@page import="Bean.PersonaBean" %>

<%@page import=" java.util.ArrayList" %>

<%! 

  ArrayList<PersonaBean>  lista;

%>

<% 
  lista=(ArrayList<PersonaBean>)request.getAttribute("lista");

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
        <form  name="form">
            <input type="hidden" name="op">
            <input type="hidden" name="codigo">
            <center>
                <table border="5">
                    <tr>
                        <td>Codigo:</td>
                        <td><input type="text" name="txtcodigo"></td>    
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="txtnombre"></td>    
                    </tr>
                    <tr>
                        <td>Apellido:</td>
                        <td><input type="text" name="txtapellido"></td>    
                    </tr>
                    <tr>
                        <td coldspan="2"><input type="button" value="Grabar"
                            onclick="registrar('<%=request.getContextPath()%>','PersonaServlet',4)"></td>    
                    </tr>
                </table>
                <table  border="2">
                    <tr>
                        <td>Elegir</td>
                        <td>Codigo</td>
                        <td>Nombre</td>
                        <td>Apellido</td>
                    </tr>
         <%  for(PersonaBean  objpb:lista) {  %>         
                   <tr>
                       <td><input type="radio" name="elegir" onclick="eliminar('<%=request.getContextPath()%>','PersonaServlet','<%=objpb.getCodigo()%>',3)">
                       </td>
                       <td><%=objpb.getCodigo()%></td>
                       <td><%=objpb.getNombre()%></td>
                       <td><%=objpb.getApellido()%></td>                       
                   </tr>                      
         <%             }                    %>           
                    
                    <tr>
                        <td><input type="button" value="regresar" onclick="regresar('<%=request.getContextPath()%>','PersonaServlet',2)"></td>
                    </tr>
                </table>
            </center>
        </form>
    </body>
</html>
