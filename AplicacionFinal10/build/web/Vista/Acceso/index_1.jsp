<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>PAGINA INICIAL DEL SISTEMA</title>    
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min_1.css">
    <script src="<%=request.getContextPath()%>/jquery-ui/jquery.js"></script>   
    <script src="<%=request.getContextPath()%>/js/bootstrap.min1.js" ></script>
    <script src="<%=request.getContextPath()%>/js/javascript.js"></script>  
   
    
    <!--css-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
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
    <form  name="form">
        <input type="hidden" name="op">
        
		
        <div class="panel panel-primary">
            <div class="header">
			<div class="header-top">
				<div class="container">
					<div class="detail">
						<ul>
							<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i> + 1 599-033-5036</li>
							<li><i class="glyphicon glyphicon-time" aria-hidden="true"></i> sabados 9:00 Am a 16:00 Pm </li>
						</ul>
					</div>
					<div class="indicate">
						<p><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>General Los olivenses, Los olivos.</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
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
								<h1><a href="index.jsp">GRUPO <span>CERO</span></a></h1>
							</div>
						</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<nav class="link-effect-2" id="link-effect-2">
								<ul class="nav navbar-nav">
									<li class="active"><a href="index.jsp">INICIO</a></li>
									<li><a href="<%=request.getContextPath()%>/GeneralServlet?op=1">NOSOTROS</a></li>
									<li><a href="<%=request.getContextPath()%>/GeneralServlet?op=2">SERVICIOS</a></li>
									
									<li><a href="<%=request.getContextPath()%>/GeneralServlet?op=3">CURSOS</a></li>
									<li><a href="<%=request.getContextPath()%>/GeneralServlet?op=4">INGRESO</a></li>
									<li><a href="<%=request.getContextPath()%>/GeneralServlet?op=5">CONTACTENOS</a></li>
								</ul>
							</nav>
						</div>
					</div>
				</nav>
			</div>
		</div>
            <div class="panel-body">
			   			
			   
						
			   
			    <div class="row">
			    	<div class="col-md-6 col-md-offset-3 soluc">
                                    <center> 
                                        <button    class="btn btn-success btn-xlarge"  onclick="usuario('<%=request.getContextPath()%>','/Studentservlet',1)" >
                                            <center>  <img  src="<%=request.getContextPath()%>/images/iconl.png" width="100px" height="100px"></center><br>
                                            Alumno
                                        </button> 
                                        <button    class="btn btn-warning btn-xlarge"  onclick="usuario('<%=request.getContextPath()%>','/AdministradorServlet',1)" >
                                            <center>  <img  src="<%=request.getContextPath()%>/images/descarga3.png" width="100px" height="100px"></center><br>
                                            Personal
                                        </button>                
                                    </center>                          
			    	</div>
			    </div>				   
            </div>
           	<div class="footer-w3">
				<div class="container">
					<div class="footer-grids">
						<div class="col-md-4 footer-grid">
							<h4>Acerca de nosotros</h4>
							<p>GRUPO CERO ES UN GRUPO ESTUDIANTIL MATEMÁTICO NACIDO CON LA FINALIDAD DE ALCANZAR EL ÉXITO PROFESIONAL DE SUS ALUMNOS . <span> ENSEÑÁNDOLES DESDE LO MAS BÁSICO DE FORMA DIDÁCTICA Y SENCILLA HASTA LO MAS COMPLEJO 
								.</span></p>
						</div>
						
						<div class="col-md-4 footer-grid">
						<h4>Informacion</h4>
							<ul>
								<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>General Los olivenses, Los olivos.</li>
								<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>970-616-267</li>
								<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="#"> @grupocero2018</a></li>
								<li><i class="glyphicon glyphicon-time" aria-hidden="true"></i>Sabados 9:00 Am a 16:00 Pm</li>
							</ul>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		<!--footer-->
		<!---copy--->
			<div class="copy-section">
				<div class="container">
					<div class="social-icons">
						<a href="#"><i class="icon1"></i></a>
						<a href="#"><i class="icon2"></i></a>
						<a href="#"><i class="icon3"></i></a>
						<a href="#"><i class="icon4"></i></a>
					</div>
					<div class="copy">
						<p>&copy; 2018  UNFV . Todos los derechos reservados | Diseñado por <a href="http://w3layouts.com"> Mi</a></p>
					</div>
				</div>
			</div>           
        </div>					
	
    </form>
</body>
</html>

