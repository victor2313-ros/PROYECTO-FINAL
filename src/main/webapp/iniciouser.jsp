<%--
    Document   : index
    Created on : 17 jun. de 2024, 11:38:39
    Author     : VICTOR
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parqueos Novanets</title>
    
    <!-- External CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.2/dist/full.min.css" rel="stylesheet">
    <link href="https://unpkg.com/@webpixels/css@1.2.6/dist/index.css" rel="stylesheet">
    
    <!-- Tailwind CSS (assuming it's required) -->
    <link href="https://cdn.tailwindcss.com" rel="stylesheet">
    
    <!-- Modernizr -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
</head>
<body>
    <%@ include file="header_1.jsp" %>
 <div class="hero min-h-screen base-300">
        <div class="hero-content flex-col lg:flex-row base-300">
            <img src="https://img.freepik.com/vector-premium/parque-lugares-estacionamiento-llamadas-automoviles-estacionamiento_110633-1000.jpg" alt="Imagen de Estacionamiento" class="w-full lg:w-1/2 h-auto rounded-lg shadow-2xl" />
            <div class="lg:ml-6">
                <h1 class="text-5xl font-bold">Parqueos Novanets: Tu espacio seguro</h1>
                <p class="py-6">Parqueos Novanets te ofrece espacios de estacionamiento seguros y siempre disponibles. Asegura tu lugar con nosotros.</p>
            </div>
        </div>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
