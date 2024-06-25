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
        <h1 class="text-2xl font-bold mb-6">Iniciar sesi�n</h1>
        <form action="login" method="post">
            <div class="mb-5">
                <label class="form-label" for="correoelectronico">Email</label>
                <input type="email" class="form-control" id="correoelectronico" name="correoelectronico" placeholder="Email" required>
            </div>
            <div class="mb-5">
                <label class="form-label" for="contrase�a">Contrase�a</label>
                <input type="password" class="form-control" id="contrase�a" name="contrase�a" placeholder="Contrase�a" autocomplete="current-password" required>
            </div>
            <div>
                <button class="btn btn-primary w-full" type="submit">Iniciar</button>
            </div>
            <div class="mt-4">
                <center><a class="link" href="#">Volver</a></center>
            </div>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
