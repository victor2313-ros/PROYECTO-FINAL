package com.emergentes.modelo;


import java.sql.Date;

public class usuario {

    private int id_usuario;
    private String nombre;
    private String correoelectronico;
    private String contraseña;
    private Date fechaRegistro;
    private String role;

    public usuario() {
        this.id_usuario = 0;
        this.nombre = "";
        this.correoelectronico = "";
        this.contraseña = "";
        this.fechaRegistro = null;
        this.role = "";
    }
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "usuario{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", correoelectronico=" + correoelectronico + ", contrase\u00f1a=" + contraseña + ", fechaRegistro=" + fechaRegistro + ", role=" + role + '}';
    }
    
}
