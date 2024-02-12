
package com.desarrollo.modelo;
//clase que va a establecer conexión con nuestra BDD

import java.sql.*;

public class Conexion {
    //1. Definir la cadena de conexión
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    //2. Credenciales de la BDD
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="admin";
    
    //3. Retornar objeto de conexión
    public static Connection getConeccion() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    //4. Cierrar objetos de conexión
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
