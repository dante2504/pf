<%-- 
    Document   : index
    Created on : 02/08/2018, 01:38:08 AM
    Author     : JESUS HAYLEN
--%>

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
            <center>
                <input type="button" value="Registrar"
                       onclick="Registrar('<%=request.getContextPath()%>','AlumnoServlet',1)">
                <input type="button" value="Mostrar"
                       onclick="Mostrar('<%=request.getContextPath()%>','AlumnoServlet',4)"> <!--llama al js-->
            </center>
        </form>
    </body>
</html>
