
package com.emergentes.modelo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author VICTOR
 */

public class reserva {
    private int id_reserva;
    private String fechaReserva;
    private String nombres;
    private String modeloVehiculo;
    private String numeroPlaca;
    private String descripcionVehiculo;
    private String areaReservada;
    private int espacio_ID;
    private int usuario_ID;

    public reserva() {
        this.id_reserva = 0;
        this.fechaReserva = null;
        this.nombres = "";
        this.modeloVehiculo = "";
        this.numeroPlaca = "";
        this.descripcionVehiculo = "";
        this.areaReservada = "";
        this.espacio_ID = 1;
        this.usuario_ID = 0;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getDescripcionVehiculo() {
        return descripcionVehiculo;
    }

    public void setDescripcionVehiculo(String descripcionVehiculo) {
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public String getAreaReservada() {
        return areaReservada;
    }

    public void setAreaReservada(String areaReservada) {
        this.areaReservada = areaReservada;
    }

    public int getEspacio_ID() {
        return espacio_ID;
    }

    public void setEspacio_ID(int espacio_ID) {
        this.espacio_ID = espacio_ID;
    }

    public int getUsuario_ID() {
        return usuario_ID;
    }

    public void setUsuario_ID(int usuario_ID) {
        this.usuario_ID = usuario_ID;
    }

    @Override
    public String toString() {
        return "reserva{" + "id_reserva=" + id_reserva + ", fechaReserva=" + fechaReserva + ", nombres=" + nombres + ", modeloVehiculo=" + modeloVehiculo + ", numeroPlaca=" + numeroPlaca + ", descripcionVehiculo=" + descripcionVehiculo + ", areaReservada=" + areaReservada + ", espacio_ID=" + espacio_ID + ", usuario_ID=" + usuario_ID + '}';
    }


}


