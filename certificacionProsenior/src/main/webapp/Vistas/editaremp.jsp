
<%@page import="Modelo.Empleado"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <%
                EmpleadoDAO eda = new EmpleadoDAO();
                int num_empleado1 = Integer.parseInt(request.getParameter("num_empleado"));
                Empleado e = eda.list(num_empleado1);

        %>
        
        <title>Editar Empleado</title>
    </head>
    <body>
            <form action="Controlador">
                Num. Empleado:<br>
                <input type="number" name="num_empleado" value="<%= e.getNum_empleado() %>"><br>
                Nombre:<br>
                <input type="text" name="nom_empleado" value="<%= e.getNom_empleado() %>"><br>
                Rol(1.- Chofer, 2.- Cargador, 3.- Auxiliar):<br>
                <input type="number" name="rol_id" max="3" min="1" value="<%= e.getRol_id() %>"><br>
                Tipo(1.-Interno, 2.-Externo):<br>
                <input type="number" name="tipo_id" max="2" min="1"  value="<%= e.getTipo_id() %>"><br>
                <input type="submit" name="accion" value="Actualizar"><br>
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
    </body>
</html>
