function Mostrar(ruta,controlador,op){ //funcion que indica al sevlet que accion tomar 
  document.form.action=ruta+"/"+controlador;
  document.form.method="GET";
  document.form.op.value=op;
  document.form.submit();
}

function regresar(ruta,controlador,op){ 
  document.form.action=ruta+"/"+controlador;
  document.form.method="GET";
  document.form.op.value=op;
  document.form.submit();
}

function eliminar(ruta,controlador,cod,op){ 
  document.form.action=ruta+"/"+controlador;
  document.form.method="GET";
  document.form.op.value=op;
  document.form.codigo.value = cod;
  document.form.submit();
}

function Registrar(ruta,controlador,op){ 
  document.form.action=ruta+"/"+controlador;
  document.form.method="GET";
  document.form.op.value=op;
  document.form.submit();
}

function grabar(ruta,controlador,op){ 
  document.form.action=ruta+"/"+controlador;
  document.form.method="GET";
  document.form.op.value=op;
  document.form.submit();
}

