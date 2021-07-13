
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmpleadoDAO implements CRUD{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Empleado e = new Empleado();
    
    @Override
    public List listar() {
        ArrayList<Empleado> list = new ArrayList<>();
        String sql = "select * from empleados";
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setNum_empleado(rs.getInt("num_empleado"));
                emp.setRol_id(rs.getInt("rol_id"));
                emp.setTipo_id(rs.getInt("tipo_id"));
                emp.setNom_empleado(rs.getString("nom_empleado"));
                
                list.add(emp);
            }
            
        } catch (Exception e) {
            
        }
        
        return list;
    }

    @Override
    public Empleado list(int num_empleado) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean nuevo(Empleado emp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean editar(Empleado emp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean eliminar(Empleado emp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
