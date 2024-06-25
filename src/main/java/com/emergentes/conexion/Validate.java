package com.emergentes.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Validate extends ConexionDB {
    private Connection con = this.conectar();

    public boolean checkUser(String correoelectronico, String contraseña) {
        boolean resultado = false;
        String sql = "SELECT * FROM usuario WHERE correoelectronico=? AND contraseña=?";
        try (PreparedStatement pr = con.prepareStatement(sql)) {
            pr.setString(1, correoelectronico);
            pr.setString(2, contraseña);
            try (ResultSet rs = pr.executeQuery()) {
                resultado = rs.next();
            }
        } catch (SQLException ex) {
            System.out.println("Error al autenticar: " + ex.getMessage());
        }
        return resultado;
    }

    public boolean isAdmin(String correoelectronico) {
        boolean isAdmin = false;
        String sql = "SELECT role FROM usuario WHERE correoelectronico=?";
        try (PreparedStatement pr = con.prepareStatement(sql)) {
            pr.setString(1, correoelectronico);
            try (ResultSet rs = pr.executeQuery()) {
                if (rs.next()) {
                    String role = rs.getString("role");
                    if ("admin".equals(role)) {
                        isAdmin = true;
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener rol: " + ex.getMessage());
        }
        return isAdmin;
    }
}


