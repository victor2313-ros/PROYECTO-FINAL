/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controlador;

import com.emergentes.dao.reservaDAO;
import com.emergentes.dao.reservadaoimpl;
import com.emergentes.modelo.reserva;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "reservaControlador", urlPatterns = {"/reservaControlador"})
public class reservaControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            reserva cli = new reserva();
            int id_reserva;
            reservaDAO dao = new reservadaoimpl();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {
                case "add":
                    request.setAttribute("reserva", cli);
                    request.getRequestDispatcher("frmreserva.jsp").forward(request, response);
                    break;
                case "edit":
                    id_reserva = Integer.parseInt(request.getParameter("id_reserva"));
                    cli = dao.getById(id_reserva);
                    request.setAttribute("reserva", cli);
                    request.getRequestDispatcher("edit.jsp").forward(request, response);
                    break;
                case "delete":
                    id_reserva = Integer.parseInt(request.getParameter("id_reserva"));
                    dao.delete(id_reserva);
                    response.sendRedirect("reservaControlador");
                    break;
                case "view":
                    List<reserva> lista = dao.getAll();
                    request.setAttribute("usuario", lista);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error en doGet: " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            reservaDAO dao = new reservadaoimpl();
            reserva reserva = new reserva();

            // Configurar los demás datos del objeto reserva
            reserva.setFechaReserva(request.getParameter("fechaReserva"));
            reserva.setNombres(request.getParameter("nombres"));
            reserva.setModeloVehiculo(request.getParameter("modeloVehiculo"));
            reserva.setNumeroPlaca(request.getParameter("numeroPlaca"));
            reserva.setDescripcionVehiculo(request.getParameter("descripcionVehiculo"));
            reserva.setAreaReservada(request.getParameter("areaReservada"));
            reserva.setEspacio_ID(Integer.parseInt(request.getParameter("espacio_ID")));

            String id_reserva = request.getParameter("id_reserva");

            if (id_reserva != null && !id_reserva.isEmpty()) {
                // Si hay un id_reserva, estamos editando
                reserva.setId_reserva(Integer.parseInt(id_reserva));
                dao.update(reserva);
            } else {
                // Si no hay id_reserva, estamos agregando
                dao.insert(reserva);
            }

            response.sendRedirect("reservaControlador");
        } catch (Exception e) {
            System.out.println("Error en doPost: " + e.getMessage());
        }
    }
}
