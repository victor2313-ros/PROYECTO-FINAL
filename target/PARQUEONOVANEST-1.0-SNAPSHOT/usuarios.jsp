<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.2/dist/full.min.css" rel="stylesheet">
    <link href="https://unpkg.com/@webpixels/css@1.2.6/dist/index.css" rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
    <title>Listado de Usuarios</title>
</head>
<body>
    <%@ include file="header_1.jsp" %>
    
    <div class="overflow-x-auto p-6">
        <table class="table w-full">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Correo Electrónico</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Juan Perez</td>
                    <td>juan.perez@example.com</td>
                    <td>
                        <a href="#" class="text-blue-500 mr-2"><i class="bi bi-pencil-square"></i> Editar</a>
                        <a href="#" class="text-red-500" onclick="return confirm('¿Está seguro de eliminar este usuario?')"><i class="bi bi-trash3-fill"></i> Eliminar</a>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Maria Gomez</td>
                    <td>maria.gomez@example.com</td>
                    <td>
                        <a href="#" class="text-blue-500 mr-2"><i class="bi bi-pencil-square"></i> Editar</a>
                        <a href="#" class="text-red-500" onclick="return confirm('¿Está seguro de eliminar este usuario?')"><i class="bi bi-trash3-fill"></i> Eliminar</a>
                    </td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>Carlos Ruiz</td>
                    <td>carlos.ruiz@example.com</td>
                    <td>
                        <a href="#" class="text-blue-500 mr-2"><i class="bi bi-pencil-square"></i> Editar</a>
                        <a href="#" class="text-red-500" onclick="return confirm('¿Está seguro de eliminar este usuario?')"><i class="bi bi-trash3-fill"></i> Eliminar</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
