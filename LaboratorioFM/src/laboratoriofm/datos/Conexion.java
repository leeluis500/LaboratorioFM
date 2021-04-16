package laboratoriofm.datos;

import java.sql.*;

public class Conexion {

    // Estas constantes deben cambiarse temporalmente para probarlo localmente

<<<<<<< HEAD
    private static final String JDBC_URL = "jdbc:mysql://localhost/filmMagic";
=======
    private static final String JDBC_URL = "jdbc:mysql://localhost/filmmagic";
>>>>>>> 3ad510a0a95790cf3898c53a86fecdb898cbc523
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
