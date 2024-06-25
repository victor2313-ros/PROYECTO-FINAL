package com.emergentes.controlador;

import com.emergentes.conexion.Validate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correoelectronico = request.getParameter("correoelectronico");
        String contraseña = request.getParameter("contraseña");

        Validate validator = new Validate();
        if (validator.checkUser(correoelectronico, contraseña)) {
            HttpSession session = request.getSession();
            session.setAttribute("login", "Ok");
            
            // Verificar si el usuario es administrador
            if (validator.isAdmin(correoelectronico)) {
                response.sendRedirect("iniciouser.jsp"); // Página para administradores
            } else {
                response.sendRedirect("index_1.jsp");  // Página para usuarios normales
            }
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
