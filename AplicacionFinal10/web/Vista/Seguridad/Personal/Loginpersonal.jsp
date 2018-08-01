
<html>
    <head>
        <title>Login</title>
        
        <link href="<%=request.getContextPath()%>/css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="login-box">
            <img src="<%=request.getContextPath()%>/images/g0.png" class="avatar"/>
            <h1></h1>
            <form>
               
					
					
                
                <div class="form-horizontal" role="form">
                                       <div class="form-group">
						<label for="Tipo" class="col-lg-3 control-label">Tipo :</label>
						<div class="col-lg-8">
							<select  name="tipousu"   id="tipousu" class="form-control"    >
                                                            <option value="0">-----------------</option> 
                                                            <option value="1">Docente Curso</option> 
                                                            <option value="2">Coordinador Curso</option> 
                                                            <option value="3">Administrador Sistema</option> 
                                                        </select>
						</div>
					</div>                                   
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
					<hr>
					<div class="form-group text-center">
						
                                        <button type="button" class="btn btn-primary"  onclick="entrar('<%=request.getContextPath()%>','AdministradorServlet',2)" >
		                              Iniciar Sesión
		                        </button>
		                        </div>
                                       <% if(request.getAttribute("mensaje")!=null)
                                          {    
                                       %>
                                        
                                        <div class="alert alert-warning">
                                                  <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                                   <strong><%=(String)request.getAttribute("mensaje")%></strong>

                                        </div>                                         
                                        <%  }   %>                                       
				</div>
              
            </form>
        </div>
    </body>
</html>

