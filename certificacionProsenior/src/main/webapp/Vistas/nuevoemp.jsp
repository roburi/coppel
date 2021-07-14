<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Empleado</title>
    </head>
    <body>
        <div>
            <h1>Agregar Persona</h1>
            <a href="Controlador?accion=add"></a>
            <form action="Controlador">
                Num. Empleado:<br>
                <input type="number" name="num_empleado"><br>
                Nombre:<br>
                <input type="text" name="nom_empleado"><br>
                Rol(1.- Chofer, 2.- Cargador, 3.- Auxiliar):<br>
                <input type="number" name="rol_id" max="3" min="1"><br>
                Tipo(1.-Interno, 2.-Externo):<br>
                <input type="number" name="tipo_id" max="2" min="1" ><br>
                <input type="submit" name="accion" value="Agregar"><br>
            </form>
        </div>
    </body>
</html>
