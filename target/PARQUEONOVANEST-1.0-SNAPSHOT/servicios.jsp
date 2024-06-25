<%-- Document : registro.jsp
     Created on : 17 jun. de 2024, 12:58:30
     Author : VICTOR
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.2/dist/full.min.css" rel="stylesheet" type="text/css" />
    <link href="https://unpkg.com/@webpixels/css@1.2.6/dist/index.css" rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
    <title>Registro</title>
    <script>
        function loadContent(url) {
            fetch(url)
                .then(response => response.text())
                .then(data => {
                    document.getElementById('dynamic-content').innerHTML = data;
                })
                .catch(error => console.error('Error loading content:', error));
        }
        document.addEventListener('DOMContentLoaded', function () {
            document.getElementById('reserva-espacio').addEventListener('click', function (event) {
                event.preventDefault();
                loadContent('frmreserva.jsp');
            });
        });
                function ubi(url) {
            fetch(url)
                .then(response => response.text())
                .then(data => {
                    document.getElementById('dynamic-content').innerHTML = data;
                })
                .catch(error => console.error('Error loading content:', error));
        }
        document.addEventListener('DOMContentLoaded', function () {
            document.getElementById('ubi').addEventListener('click', function (event) {
                event.preventDefault();
                loadContent('ubi.jsp');
            });
        });
    </script>
</head>
<body>
    <%@ include file="header_2.jsp" %>
    
    <div class="flex h-screen bg-gray-100">
        <!-- Vertical Navbar -->
        <nav class="w-64 bg-white border-l border-gray-200 h-full shadow-xl">
            <div class="py-4 px-6">
                <h2 class="text-lg font-semibold">Menu</h2>
                <ul class="mt-6 space-y-4">
                    <li>
                        <a href="#" id="reserva-espacio" class="flex items-center space-x-3 text-gray-700 hover:text-gray-900">
                            <i class="bi bi-house"></i>
                            <span>Reserva de espacio</span>
                        </a>
                    </li>
                    <li>
                        <a href="ubi.jsp" id="ubi" class="flex items-center space-x-3 text-gray-700 hover:text-gray-900">
                            <i class="bi bi-bar-chart"></i>
                            <span>Ubicaciones</span>
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
        <main class="flex-grow py-10 bg-surface-secondary">
            <div id="dynamic-content" class="container mx-auto p-4">
            </div>
        </main>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
