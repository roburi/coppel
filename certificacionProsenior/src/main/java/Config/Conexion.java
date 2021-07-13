package Config;

import java.sql.Connection;
import java.sql.*;

public class Conexion {
    Connection connec;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connec = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/examendb","root","123456");
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error "+e);
        }
    }
    
    public Connection getConexion(){
        return connec;
    }
}
