
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Empleado"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Empleados</title>
    </head>
    <body>
        <div>
            <h1>Empleados</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>Num. Empleado</th>
                        <th>Nombre</th>
                        <th>Rol</th>
                        <th>Tipo</th>
                    </tr>
                </thead>
                
                <% 
                    EmpleadoDAO dao = new EmpleadoDAO();
                    List<Empleado> list = dao.listar();
                    Iterator<Empleado> iter = list.iterator();
                    Empleado em = null;
                    
                    while(iter.hasNext()){
                        em = iter.next();
                %>
                
                <tbody>
                    <tr>
                        <td><%= em.getNum_empleado() %></td>
                        <td><%= em.getNom_empleado() %></td>
                        <td><%= em.getRol_id() %></td>
                        <td><%= em.getTipo_id() %></td>
                        <td>
                            <a href="Controlador?accion=editar&num_empleado=<%= em.getNum_empleado() %>">Editar</a>
                            <a>Eliminar</a>
                        </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
    </body>
</html>
