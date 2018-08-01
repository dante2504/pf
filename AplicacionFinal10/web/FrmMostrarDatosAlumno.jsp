<%@page    import="java.util.ArrayList"       %>
<%@page    import="Bean.StudentBean"%>
<%@page session="true"%>

<%
    if(session.getAttribute("datos")==null) {
        response.sendRedirect("Vista/Acceso/index_1.jsp");
    }
%>

<% StudentBean objEstu=null; %>
<% objEstu=(StudentBean)session.getAttribute("datos");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/ken-burns.css" type="text/css" media="all" />
<link rel="stylesheet" href="css/animate.min.css" type="text/css" media="all" />
<!--css-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Studies Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--js-->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!--js-->
<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!--webfonts-->
    </head>
    <body>
        <div class="header">
		
			<div class="container">
				<nav class="navbar navbar-default">
					<div class="container-fluid">
				<!---Brand and toggle get grouped for better mobile display--->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>				  
							<div class="navbar-brand">
								<h1><a href="index.jsp">Datos</a></h1>
							</div>
						</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<nav class="link-effect-2" id="link-effect-2">
								<ul class="nav navbar-nav">
									
									
									<li><a href="<%=request.getContextPath()%>/Studentservlet?op=3">Mostrar Datos</a></li>
									
									<li><a href="<%=request.getContextPath()%>/Studentservlet?op=4">Actualizar Informacion</a></li>
									<li><a href="<%=request.getContextPath()%>/Studentservlet?op=5">NOTAS</a></li>
									<li><a href="<%=request.getContextPath()%>/Studentservlet?op=6">Cerrar sesion </a></li>
								</ul>
							</nav>
						</div>
					</div>
				</nav>
			</div>
		</div>
    <center>
            <form name="form">
                <input type="hidden" name="op">
<%----------------------------------------------------------------------------------------------------------------%>
                    <div style="background-color: #556">
                        <div class="divi2">
                            <ul>
                                <li class="divi22"><center><%=objEstu.getNOMB_ALU()%> <%=objEstu.getAPEPAT_ALU()%> <%=objEstu.getAPEMAT_ALU()%> <a style="padding-left: 300px;">Codigo: <%=objEstu.getCOD_ALU()%></a></center></li>
                            </ul>
                        </div>
                      
                    </div>
                    <div class="divc" style="padding-top: 90px;">
                        <div class="panel">
                        <table style="float: left">
                            <tr>
                                <td>
                                    <img src="<%=request.getContextPath()%>/Imagenes/Foto/<%=objEstu.getCOD_ALU()%>.jpg" width="200px" height="280px" alt=""/>
                                </td>
                            </tr>
                        </table>
                        <table style="float: left">
                            <tr class="filap">
                                <td class="columna1">Codigo</td>
                                <td class="columna2"><%=objEstu.getCOD_ALU()%></td>
                                <td class="columna1">Dni</td>
                                <td class="columna2"><%=objEstu.getDNI_ALU()%></td>
                            </tr>
                            <tr class="filap">
                                <td class="columna1">Nombre</td>
                                <td class="columna2"><%=objEstu.getNOMB_ALU()%></td>
                                <td class="columna1">Telefono</td>
                                <td class="columna2"><%=objEstu.getTEL_ALU()%></td>
                            </tr>
                            <tr class="filap">
                                <td class="columna1">Apellido Paterno</td>
                                <td class="columna2"><%=objEstu.getAPEPAT_ALU()%></td>
                                <td class="columna1">Apellido Materno</td>
                                <td class="columna2"><%=objEstu.getAPEMAT_ALU()%></td>
                            </tr>
                            <tr class="filap">
                                <td class="columna1">Turno</td>
                                <td class="columna2"><%=objEstu.getTURN_ALU()%></td>
                                <td class="columna1">Fecha Nacimiento</td>
                                <td class="columna2"><%=objEstu.getFEC_NAC_ALU()%></td>
                            </tr>
                            
                       
                        </table>
                        </div>
                    </div>
<%----------------------------------------------------------------------------------------------------------------%>      
            </form>
        </center>
    </body>
</html>
