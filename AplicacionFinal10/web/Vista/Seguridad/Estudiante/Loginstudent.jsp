<html>
    <head>
        <title>Login</title>
        <link href="<%=request.getContextPath()%>/css/estilo.css" rel="stylesheet" type="text/css"/>
        <script src="<%=request.getContextPath()%>/jquery-ui/jquery.js"></script>  
        <script src="<%=request.getContextPath()%>/jquery-ui/jquery.alerts.js" ></script>        
        <script src="<%=request.getContextPath()%>/js/bootstrap.min1.js" ></script>     
        <script  src="<%=request.getContextPath()%>/js/javascript.js"></script>


    </head>
    <body>
        <input type="hidden" name="op" >
        <div class="login-box">
            <img src="<%=request.getContextPath()%>/images/avatar.png" class="avatar"/>
            <div class="form-group">
                <label for="usuario" class="col-lg-3 control-label">Usuario:</label>
                <div class="col-lg-8">
                    <input type="text" id="txtusu"  name="txtusu" class="form-control" placeholder="Ingrese su Usuario" value="" >
                </div>
            </div>
            <div class="form-group">
                <label for="clave" class="col-lg-3 control-label">Clave:</label>
                <div class="col-lg-8">
                    <input type="password"   id="txtcla"   name="txtcla" class="form-control" placeholder="Ingrese su Clave" value=""  >
                </div>
            </div>

            <div class="form-group text-center">

                <button type="button" class="btn btn-primary"   onclick="usuario()('<%=request.getContextPath()%>','/Studentservlet', 1)">
                   Iniciar Sesión
                </button>
            </div>   

        </form>
    </div>


</body>
</html>