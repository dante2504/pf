function  listar(ruta, controlador, op)
{
    document.form.action = ruta + "/" + controlador;
    document.form.method = "GET";
    document.form.op.value = op;
    document.form.submit();

}
function regresar(ruta, controlador, op)
{
    document.form.action = ruta + "/" + controlador;
    document.form.method = "GET";
    document.form.op.value = op;
    document.form.submit();

}
function eliminar(ruta, controlador, cod, op)
{
    document.form.action = ruta + "/" + controlador;
    document.form.method = "GET";
    document.form.op.value = op;
    document.form.codigo.value = cod;
    document.form.submit();

}
function registrar(ruta, controlador, op)
{
    var codigo, nombre, apellido;
    codigo = document.form.txtcodigo.value;
    nombre = document.form.txtnombre.value;
    apellido = document.form.txtapellido.value;
    if (codigo == '') {
        alert("INGRESE CODIGO POR FAVOR !!!");
        document.form.txtcodigo.focus();
        return;


    } else if (nombre == '') {
        alert("INGRESE NOMBRE POR FAVOR !!!");
        document.form.txtnombre.focus();
        return;

    } else if (apellido == '') {
        alert("INGRESE APELLIDO POR FAVOR !!!");
        document.form.txtapellido.focus();
        return;

    } else {

        document.form.action = ruta + "/" + controlador;
        document.form.method = "GET";
        document.form.op.value = op;
        document.form.submit();
    }
}
