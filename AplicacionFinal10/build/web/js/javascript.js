

function  ajax(ruta,controlador,parametro,id,tipo)
{   var pagina=ruta+"/"+controlador+parametro;    
    var xmlhttp;
    if (window.XMLHttpRequest)
    { xmlhttp=new XMLHttpRequest();
    }
    else
    { xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
      {
      if (xmlhttp.readyState==4 && xmlhttp.status==200)
      {
        document.getElementById(id).innerHTML=xmlhttp.responseText;
      }
      }
    xmlhttp.open(tipo,pagina,true);
    xmlhttp.send(null);    
}
function  usuario(ruta,controlador,op)
{
  document.form.action=ruta+"/"+controlador;
  document.form.method="GET";
  document.form.op.value=op;
  document.form.submit();
}

 function  entra(ruta,controlador,op)
  {
         var  usuario=document.getElementById("txtusu").value;
         var  clave= document.getElementById("txtcla").value;
      
    if(controlador=="PersonalServlet") 
    {       
         var tiposuario=document.getElementById("tipousu").value;
         
      if(tiposuario=="0")
      {
          alert("Seleccione el  Tipo de Usuario");
          document.getElementById("tipousu").focus();
          return;
      }
      else if( usuario=="")
      {
          alert("Ingrese  Usuario !!!");
          document.getElementById("txtusu").focus();
          return;
      }else if(clave=="")
      {
          alert("Ingrese  Clave !!!");
          document.getElementById("txtcla").focus();
          return;          
      }else
      {
      
     document.form.action=ruta+"/"+controlador;
     document.form.method="POST";
     document.form.op.value=op;
     document.form.submit();  
      }
      
    }else
    {
               if( usuario=="")
              {
                  alert("Ingrese  Usuario !!!");
                  document.getElementById("txtusu").focus();
                  return;
              }else if(clave=="")
              {
                  alert("Ingrese  Clave !!!");
                  document.getElementById("txtcla").focus();
                  return;          
              }else
              {

             document.form.action=ruta+"/"+controlador;
             document.form.method="GET";
             document.form.op.value=op;
             document.form.submit();  
              }     
    }
      
 }
 function  Principal(ruta,controlador,op)
 {
    var paginamenu = ruta + "/" + controlador + "?op=" + op;
    var xmlhttp;
    // en esta condicional Doble se valida la Version del Navegador
    if (window.XMLHttpRequest)
    {
        xmlhttp = new XMLHttpRequest();// creando un de Ajax Moderno
    } else
    {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function ()
    {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
        {
            document.getElementById('contenido').innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET", paginamenu, true);
    xmlhttp.send(null);
 }
function  Datos(ruta,controlador,op,ab)
 {
    var paginamenu = ruta + "/" + controlador + "?op=" + op+ab;
    var xmlhttp;
    // en esta condicional Doble se valida la Version del Navegador
    if (window.XMLHttpRequest)
    {
        xmlhttp = new XMLHttpRequest();// creando un de Ajax Moderno
    } else
    {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function ()
    {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
        {
            document.getElementById('contenido').innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET", paginamenu, true);
    xmlhttp.send(null);
 }
function  entrar(ruta, controlador, op){
    var  usuario=document.getElementById("txtusuario").value;
    var  clave= document.getElementById("txtpass").value;
    var par="";
      
    if( usuario==""){
            alert("Ingrese  Usuario !!!");
            document.getElementById("txtusuario").focus();
            return;
        }else{
            if(clave==""){
            alert("Ingrese  Clave !!!");
            document.getElementById("txtpass").focus();
            return;          
            }else{
                par="&txtusuario="+usuario+"&txtpass="+clave;
                Datos(ruta,controlador,op,par);
            }
        }
    }
    
    
    
 function registrar(ruta,controlador,op){
    var  dni=document.getElementById("txtdni").value;
    var  nombre= document.getElementById("txtnombre").value;
    var  apellido1=document.getElementById("txtapellido1").value;
    var  apellido2= document.getElementById("txtapellido2").value;
    var  usuario=document.getElementById("txtusuario").value;
    var  clave= document.getElementById("txtpass").value;
    if(dni==""){
        alert("Ingrese  Dni !!!");
        document.getElementById("txtdni").focus();
        return;
    }else{
        if(nombre==""){
            alert("Ingrese  el nombre !!!");
            document.getElementById("txtnombre").focus();
            return;
        }else{
            if(apellido1==""){
                alert("Ingrese  apellido paterno !!!");
                document.getElementById("txtapellido1").focus();
                return;
            }else{
                if(apellido2==""){
                    alert("Ingrese  apellido materno !!!");
                    document.getElementById("txtapellido2").focus();
                    return;
                }else{
                    if(usuario==""){
                        alert("Ingrese  Usuario !!!");
                        document.getElementById("txtusuario").focus();
                        return;
                    }else{
                        if(clave==""){
                            alert("Ingrese  la clave !!!");
                            document.getElementById("txtpass").focus();
                            return;
                        }else{
                            document.form.action=ruta+"/"+controlador;
                            document.form.method="POST";
                            document.form.op.value=op;
                            document.form.submit();
                        }
                    }
                }
            }
        }
    }
 }
 function registrarasig(ruta,controlador,op){
                var  codigo=document.getElementById("codigo").value;
                var  nombre= document.getElementById("txtnombre").value;
                var  horas= document.getElementById("txthoras").value;
                var  carrera=document.getElementById("cbocarrera").value;
                if(codigo==""){
                    alert("Ingrese codigo !!!");
                    document.getElementById("codigo").focus();
                    return;
                }else{
                    if(nombre==""){
                        alert("Ingrese la Asignatura !!!");
                        document.getElementById("txtnombre").focus();
                        return;
                    }else{
                        if(horas==""){
                            alert("Ingrese la Cantidad de Horas !!!");
                            document.getElementById("txthoras").focus();
                            return;
                        }else{
                            if(carrera==""){
                                alert("Ingrese  Carrera !!!");
                                document.getElementById("cbocarrera").focus();
                                return;
                            }else{
                                  var par="&codigo="+codigo+"&txtnombre="+nombre+"&txthoras="+horas+"&cbocarrera="+carrera;
                                            Datos(ruta,controlador,op,par);
                            }
                        }
                    }
                }
            }
function registrarca(ruta,controlador,op){
    var  codigo=document.getElementById("codigo").value;
    var  nombre= document.getElementById("txtnombre").value;
    if(codigo==""){
        alert("Ingrese codigo !!!");
        document.getElementById("codigo").focus();
        return;
    }else{
        if(nombre==""){
            alert("Ingrese  Carrera !!!");
            document.getElementById("txtnombre").focus();
            return;
        }else{
              var par="&codigo="+codigo+"&txtnombre="+nombre;
                        Datos(ruta,controlador,op,par);
        }
    }
}
 function  modifica(ruta,controlador,op)
 {
     var  codigo=document.getElementById("codigo").value;
     var  txtnombre=document.getElementById("txtnombre").value;
          var par="&codigo="+codigo+"&txtnombre="+txtnombre;
        Datos(ruta,controlador,op,par);
     
 }
 function  modificaasig(ruta,controlador,op)
 {
     var  codigo=document.getElementById("codigo").value;
     var  txtnombre=document.getElementById("txtnombre").value;
     var  txthoras=document.getElementById("txthoras").value;
     var  cbocarrera=document.getElementById("cbocarrera").value;
          var par="&codigo="+codigo+"&txtnombre="+txtnombre+"&txthoras="+txthoras+"&cbocarrera="+cbocarrera;
        Datos(ruta,controlador,op,par);
     
 }
 function  modificar(ruta,controlador,op,codigo,txtdni,txtnombre,txtapellido1,txtapellido2,txtdireccion,txtfnacimiento,txttelefono,txtusuario,txtpass)
 {
        var par="&codigo="+codigo+"&txtdni="+txtdni+"&txtnombre="+txtnombre+"&txtapellido1="+
                txtapellido1+"&txtapellido2="+txtapellido2+"&txtdireccion="+txtdireccion+
                "&txtfnacimiento="+txtfnacimiento+"&txttelefono="+txttelefono+"&txtusuario="+
                txtusuario+"&txtpass="+txtpass;
        Datos(ruta,controlador,op,par);
     
 }
  function  modificarca(ruta,controlador,op,codigo,txtnombre){
      var par="&codigo="+codigo+"&txtnombre="+txtnombre;
                Datos(ruta,controlador,op,par);
  }
  function  modificarasig(ruta,controlador,op,codigo,txtnombre,txthoras,cbocarrera){
      var par="&codigo="+codigo+"&txtnombre="+txtnombre+"&txthoras="+txthoras+"&cbocarrera="+cbocarrera;
                Datos(ruta,controlador,op,par);
  }
  
 function  detalles(ruta,controlador,op,codigo,txtdni,txtnombre,txtapellido1,txtapellido2,txtdireccion,txtfnacimiento,txttelefono,txtusuario,txtpass,txtnombasig,txtnombca)
 {
                var par="&codigo="+codigo+"&txtdni="+txtdni+"&txtnombre="+txtnombre+"&txtapellido1="+
                        txtapellido1+"&txtapellido2="+txtapellido2+"&txtdireccion="+txtdireccion+
                        "&txtfnacimiento="+txtfnacimiento+"&txttelefono="+txttelefono+"&txtusuario="+
                        txtusuario+"&txtpass="+txtpass+"&txtnombasig="+txtnombasig+"&txtnombca="+txtnombca;
                Datos(ruta,controlador,op,par);
 }
 function  registrarestu(ruta,controlador,op,codestu,codmatri,txtdni,txtnombre,txtapellido1,txtapellido2,txtdireccion,txtfnacimiento,txttelefono,txtcategoria,txtseccion,txtturno,txtfecha,txtciclo,codasig,txtusuario,txtpass)
 {
                var par="&codigo="+codestu+"&codmatri="+codmatri+"&txtdni="+txtdni+"&txtnombre="+txtnombre+"&txtapellido1="+
                        txtapellido1+"&txtapellido2="+txtapellido2+"&txtdireccion="+txtdireccion+
                        "&txtfnacimiento="+txtfnacimiento+"&txttelefono="+txttelefono+"&txtcategoria="+
                        txtcategoria+"&txtseccion="+txtseccion+"&txtturno="+txtturno+"&txtfecha="+
                        txtfecha+"&txtciclo="+txtciclo+"&codasig="+codasig+"&txtusuario="+
                        txtusuario+"&txtpass="+txtpass;
                Datos(ruta,controlador,op,par);
 }
 function  inscribirest(ruta,controlador,op) {
    var  dni=document.getElementById("txtdni").value;
    var  nombres=document.getElementById("txtnom").value;
    var  ap1=document.getElementById("txtpat").value;
    var  ap2=document.getElementById("txtmat").value;
    var  direccion=document.getElementById("txtdir").value;
    var  nacimiento=document.getElementById("txtnac").value;
    var  telefono=document.getElementById("txttel").value;
    var  cbocat=document.getElementById("cbocat").value;
    var  txtsec=document.getElementById("txtsec").value;
    var  txttur=document.getElementById("txttur").value;
    var  cbocic=document.getElementById("cbocic").value;
    var  cbocur=document.getElementById("cbocur").value;
    var  correo=document.getElementById("txtusu").value;
    var  contra=document.getElementById("txtcon").value;
    var par="&txtdni="+dni+"&txtnom="+nombres+"&txtpat="+ap1+"&txtmat="+ap2+"&txtdir="+direccion+"&txtnac="+nacimiento+"&txttel="+telefono+"&cbocat="+cbocat+"&txtsec="+txtsec+"&txttur="+txttur+"&cbocic="+cbocic+"&cbocur="+cbocur+"&txtusu="+correo+"&txtcon="+contra;
    Datos(ruta,controlador,op,par);
 }
 function  Eliminar(ruta,controlador,op,codigo)
 {
      var par="&codigo="+codigo;
                Datos(ruta,controlador,op,par);
     
 }
 
        function guardar(e,obj,ruta,id,ab){
            tecla=(document.all) ? e.keyCode : e.which;
            if(tecla==13){
                var e1=document.getElementById(id+"1").value;
                var e2=document.getElementById(id+"2").value;
                var ep=document.getElementById(id+"p").value;
                var e3=document.getElementById(id+"3").value;
                var e4=document.getElementById(id+"4").value;
                var ef=document.getElementById(id+"f").value;
                    
                    if(e1=='')e1='0';
                    if(e2=='')e2='0';
                    if(ep=='')ep='0';
                    if(e3=='')e3='0';
                    if(e4=='')e4='0';
                    if(ef=='')ef='0';
                    
                var par="&n1="+e1+"&n2="+e2+"&np="+ep+"&n3="+e3+"&n4="+e4+"&nf="+ef+"&txtnot="+ab;
                Datos(ruta,'ProfesorServlet',4,par);    
            }
        }
        
        