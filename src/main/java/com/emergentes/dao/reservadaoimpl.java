package com.emergentes.dao;

import com.emergentes.conexion.ConexionDB;
import com.emergentes.modelo.reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp; // Asegúrate de importar correctamente Timestamp
import java.util.ArrayList;
import java.util.List;

public class reservadaoimpl extends ConexionDB implements reservaDAO {

public void insert(reserva reserva) throws Exception {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
        conn = this.conectar();
        String sql = "INSERT INTO reserva (fechareserva, nombres, modelovehiculo, numeroplaca, descripcionvehiculo, areareservada, espacio_id, usuario_id ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
        ps = conn.prepareStatement(sql);
        // Setear la fecha y hora de reserva desde el objeto reserva
        ps.setTimestamp(1, Timestamp.valueOf(reserva.getFechaReserva()));
        ps.setString(2, reserva.getNombres());
        ps.setString(3, reserva.getModeloVehiculo());
        ps.setString(4, reserva.getNumeroPlaca());
        ps.setString(5, reserva.getDescripcionVehiculo());
        ps.setString(6, reserva.getAreaReservada());
        ps.setInt(7, reserva.getEspacio_ID());
        ps.setInt(8, reserva.getUsuario_ID());

        // Ejecutar la consulta
        ps.executeUpdate();
    } catch (Exception e) {
        throw new Exception("Error al insertar reserva: " + e.getMessage());
    }}


    public void update(reserva reserva) throws Exception {
    try {
        Connection conn = this.conectar();
        String sql = "UPDATE reserva SET fechareserva=?, nombres=?, modelovehiculo=?, numeroplaca=?, descripcionvehiculo=?, areareservada=? WHERE id_reserva=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, reserva.getFechaReserva());
        ps.setString(2, reserva.getNombres());
        ps.setString(3, reserva.getModeloVehiculo());
        ps.setString(4, reserva.getNumeroPlaca());
        ps.setString(5, reserva.getDescripcionVehiculo());
        ps.setString(6, reserva.getAreaReservada());
        ps.setInt(7, reserva.getId_reserva()); // Aquí se debe asignar id_reserva en el índice 7
        ps.executeUpdate();
    } catch (Exception e) {
        throw new Exception("Error al actualizar reserva: " + e.getMessage());
    } finally {
        this.desconectar();
    }
}


    public void delete(int id_reserva) throws Exception {
        try {
            Connection conn = this.conectar();
            String sql = "DELETE FROM reserva WHERE id_reserva=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_reserva);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error al eliminar reserva: " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    public reserva getById(int id_reserva) throws Exception {
        reserva reserva = null;
        try {
            Connection conn = this.conectar();
            String sql = "SELECT * FROM reserva WHERE id_reserva=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_reserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva = new reserva();
                reserva.setId_reserva(rs.getInt("id_reserva"));
                reserva.setFechaReserva(rs.getString("fechareserva"));
                reserva.setNombres(rs.getString("nombres"));
                reserva.setModeloVehiculo(rs.getString("modelovehiculo"));
                reserva.setNumeroPlaca(rs.getString("numeroplaca"));
                reserva.setDescripcionVehiculo(rs.getString("descripcionvehiculo"));
                reserva.setAreaReservada(rs.getString("areareservada"));
                reserva.setEspacio_ID(rs.getInt("espacio_id"));
                reserva.setUsuario_ID(rs.getInt("usuario_id"));
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener reserva: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return reserva;
    }
    public List<reserva> getAll() throws Exception {
        List<reserva> lista = new ArrayList<>();
        try {
            Connection conn = this.conectar();
            String sql = "SELECT * FROM reserva";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reserva reserva = new reserva();
                reserva.setId_reserva(rs.getInt("idreserva"));
                reserva.setFechaReserva(rs.getString("fechareserva"));
                reserva.setNombres(rs.getString("nombres"));
                reserva.setModeloVehiculo(rs.getString("modelovehiculo"));
                reserva.setNumeroPlaca(rs.getString("numeroplaca"));
                reserva.setDescripcionVehiculo(rs.getString("descripcionvehiculo"));
                reserva.setAreaReservada(rs.getString("areareservada"));
                reserva.setEspacio_ID(rs.getInt("espacio_id"));
                reserva.setUsuario_ID(rs.getInt("usuario_id"));
                lista.add(reserva);
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener todas las reservas: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return lista;
    }
}
