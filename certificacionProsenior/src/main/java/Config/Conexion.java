package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection connec;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/examendb", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error " + e);
        }
    }

    public Connection getConexion() {
        return connec;
    }
}
