<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parqueos Novanets</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.2/dist/full.min.css" rel="stylesheet">
    <link href="https://unpkg.com/@webpixels/css@1.2.6/dist/index.css" rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
</head>
<body class="bg-gray-100 p-4">
    <div class="max-w-md mx-auto bg-white rounded-lg shadow-lg p-6">
        <h1 class="text-2xl font-bold mb-6">Registro</h1>
        <form action="registroControlador" method="post">
            <input type="hidden" name="id_usuario" value="${usuario.id_usuario}">
            <div class="mb-5">
                <label class="form-label" for="nombre">Nombres</label>
                <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombres" required>
            </div>
            <div class="mb-5">
                <label class="form-label" for="correoelectronico">Email</label>
                <input type="email" class="form-control" name="correoelectronico" id="correoelectronico" placeholder="Email" required>
            </div>
            <div class="mb-5">
                <label class="form-label" for="contraseņa">Contraseņa</label>
                <input type="password" class="form-control" name="contraseņa" id="contraseņa" placeholder="Contraseņa" autocomplete="current-password" required>
            </div>
            <div>
                <button type="submit" class="btn btn-primary w-full">
                    Registrarse
                </button>
            </div>
            <div class="mt-4 text-center">
                <a href="index.jsp" class="link">Volver</a>
            </div>
        </form>
    </div>

    <%@ include file="footer.jsp" %>
</body>
</html>
