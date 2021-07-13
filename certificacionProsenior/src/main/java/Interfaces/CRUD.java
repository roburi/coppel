
package Interfaces;

import Modelo.Empleado;
import java.util.List;

public interface CRUD {
    public List listar();
    public Empleado list(int num_empleado);
    public boolean nuevo(Empleado emp);
    public boolean editar(Empleado emp);
    public boolean eliminar(Empleado emp);
}
