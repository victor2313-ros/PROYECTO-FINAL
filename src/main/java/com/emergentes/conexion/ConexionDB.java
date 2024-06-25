package com.emergentes.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    static public String url = "jdbc:postgresql://localhost:5432/bd_parqueo";
    static public String usuario = "postgres";
    static public String password = "1234";
    protected Connection conn = null;

    public ConexionDB() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usuario, password);
            if (conn != null) {
                System.out.println("Conexion OK" + conn);
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectar " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver " + ex.getMessage());
        }
    }

    public Connection conectar() {
        return conn;
    }

    public void desconectar() {
        System.out.println("Cerrando la BD " + conn);
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la BD: " + ex.getMessage());
        }
    }
}

