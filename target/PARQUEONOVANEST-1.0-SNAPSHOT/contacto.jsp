<%-- 
    Document   : registro
    Created on : 17 jun. de 2024, 12:58:30
    Author     : VICTOR
--%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.2/dist/full.min.css" rel="stylesheet">
        <script src="https://cdn.tailwindcss.com"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
        <link href="https://unpkg.com/@webpixels/css@1.2.6/dist/index.css" rel="stylesheet">
    </head>
    <body>
        <%@ include file="header_2.jsp" %>
        <div class="container mx-auto p-4">
            <div class="flex flex-wrap justify-center gap-4">
                <div class="card w-96 bg-base-100 shadow-xl">
                    <a href="https://www.facebook.com">
                        <figure><img src="https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg" alt="Facebook" class="w-full h-48 object-contain p-4" /></figure>
                    </a>
                    <div class="card-body">
                        <div class="card-actions justify-end">
                            <a href="https://www.facebook.com" class="btn btn-primary w-full">Entrar</a>
                        </div>
                    </div>
                </div>
                <div class="card w-96 bg-base-100 shadow-xl">
                    <a href="https://www.whatsapp.com">
                        <figure><img src="https://static.whatsapp.net/rsrc.php/yZ/r/JvsnINJ2CZv.svg" alt="WhatsApp" class="w-full h-48 object-contain p-4" /></figure>
                    </a>
                    <div class="card-body">
                        <div class="card-actions justify-end">
                            <a href="https://www.whatsapp.com" class="btn btn-primary w-full">Entrar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
