package com.emergentes.controlador;

import com.emergentes.dao.registroDAO;
import com.emergentes.dao.registrodaoimpl;
import com.emergentes.modelo.usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "registroControlador", urlPatterns = {"/registroControlador"})
public class registroControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            usuario cli = new usuario();
            int id_usuario;
            registroDAO dao = new registrodaoimpl();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {
                case "add":
                    request.setAttribute("usuario", cli);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    break;
                case "edit":
                    id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
                    cli = dao.getById(id_usuario);
                    request.setAttribute("usuario", cli);
                    request.getRequestDispatcher("editfrmregis.jsp").forward(request, response); // replace with actual path
                    break;
                case "delete":
                    id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
                    dao.delete(id_usuario);
                    response.sendRedirect("registroControlador");
                    break;
                case "view":
                    List<usuario> lista = dao.getAll();
                    request.setAttribute("usuario", lista);
                    request.getRequestDispatcher("login.jsp").forward(request, response); // replace with actual path
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String idUsuarioStr = request.getParameter("id_usuario");
            int id_usuario = 0;

        if (idUsuarioStr != null && !idUsuarioStr.isEmpty()) {
            id_usuario = Integer.parseInt(idUsuarioStr);
        }
            String nombre = request.getParameter("nombre");
            String correoelectronico = request.getParameter("correoelectronico");
            String contraseña = request.getParameter("contraseña");


            usuario cli = new usuario();
            registroDAO dao = new registrodaoimpl();

            cli.setId_usuario(id_usuario);
            cli.setNombre(nombre);
            cli.setCorreoelectronico(correoelectronico);
            cli.setContraseña(contraseña);

            if (id_usuario == 0) {
                dao.insert(cli);
            } else {
                usuario existingUser = dao.getById(id_usuario);
                cli.setFechaRegistro(existingUser.getFechaRegistro()); 
                dao.update(cli);
            }

            response.sendRedirect("login.jsp");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
