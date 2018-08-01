function  ir(ruta,controlador,op)
{
   document.form.action=ruta+controlador;
   document.form.method="GET";
   document.form.op.value=op;
   document.form.submit();
}


