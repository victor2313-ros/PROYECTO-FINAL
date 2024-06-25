package com.emergentes.dao;

import com.emergentes.conexion.ConexionDB;
import com.emergentes.modelo.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class registrodaoimpl extends ConexionDB  implements registroDAO{

    @Override
    public void insert(com.emergentes.modelo.usuario usuario) throws Exception {
            try{
            this.conectar();
            PreparedStatement ps= this.conn.prepareStatement("INSERT INTO usuario(nombre,correoelectronico,contraseña) values(?,?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreoelectronico());
            ps.setString(3, usuario.getContraseña());
            ps.executeUpdate();
        }catch (Exception e){
            throw  e;
        }finally{
            this.desconectar();
        }
        
    }

    @Override
    public void update(com.emergentes.modelo.usuario usuario) throws Exception {
    try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE usuario SET nombre=?,correoelectronico=? ,contraseña=? where id_usuario=?");
              ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreoelectronico());
            ps.setString(3, usuario.getContraseña());
            ps.setInt(4, usuario.getId_usuario());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id_usuario) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM usuario where id_usuario=?");
             ps.setInt(1, id_usuario);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public com.emergentes.modelo.usuario getById(int id_usuario) throws Exception {
              usuario user = new usuario();
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM usuario where id_usuario=?");
            ps.setInt(1, id_usuario);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setId_usuario(rs.getInt("id_usuario"));
                user.setNombre(rs.getString("nombre"));
                user.setCorreoelectronico(rs.getString("correoelectronico"));
                user.setContraseña(rs.getString("contraseña"));
                user.setFechaRegistro(rs.getDate("fecharegistro"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return user;
    
    }

    @Override
    public List<com.emergentes.modelo.usuario> getAll() throws Exception {
                       List<usuario> lista = null;
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM usuario ");
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<usuario>();
            while(rs.next()){
                usuario user=new usuario();
                 user.setId_usuario(rs.getInt("id_usuario"));
                user.setNombre(rs.getString("nombre"));
                user.setCorreoelectronico(rs.getString("correoelectronico"));
                user.setContraseña(rs.getString("contraseña"));
                user.setFechaRegistro(rs.getDate("fecharegistro"));
                lista.add(user);
            }
            rs.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }}
