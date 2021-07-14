
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "select * from empleados where num_empleado ="+num_empleado;
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado emp = new Empleado();
                e.setNum_empleado(rs.getInt("num_empleado"));
                e.setRol_id(rs.getInt("rol_id"));
                e.setTipo_id(rs.getInt("tipo_id"));
                e.setNom_empleado(rs.getString("nom_empleado"));
                
            }
            
        } catch (Exception e) {
            
        }
        
        return e;
    }

    @Override
    public boolean nuevo(Empleado emp) {
       String sql ="INSERT INTO empleados(nom_empleado, rol_id, num_empleado, tipo_id) values('"+emp.getNom_empleado()+"','"+emp.getRol_id()+"','"+emp.getNum_empleado()+"','"+emp.getTipo_id()+"')";
       
        try {
            
            con = cn.getConexion();
            ps =  con.prepareStatement(sql);
            ps.execute();
            
        } catch (Exception e) {
            
        }
       
        return false;
    }

    @Override
    public boolean editar(Empleado emp) {
         String sql ="UPDATE empleados SET nom_empleado ="+emp.getNom_empleado()+" , rol_id ="+emp.getRol_id()+" , tipo_id = "+emp.getTipo_id()+" WHERE num_empleado ="+emp.getNum_empleado();
         
         try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
         
         return false;
    }

    @Override
    public boolean eliminar(Empleado emp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
