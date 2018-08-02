

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
            <center>
                <input type="button"  value="Listar" onclick="listar('<%=request.getContextPath()%>','PersonaServlet',1)">
                
            </center>
            
        </form>        
        
    </body>
</html>
