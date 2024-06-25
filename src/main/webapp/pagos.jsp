
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
    <title>Parqueos Novanets</title>
</head>
<body class="p-6">
    <div class="bg-white rounded-lg shadow-lg p-4 max-w-3xl mx-auto h-auto">
        <h1 class="text-2xl font-bold mb-4">RESERVAS</h1>
        <form action="process_entrada.jsp" method="POST" class="space-y-4">
            <div class="form-control w-full">
                <label class="label">
                    <span class="label-text">COD DE TRANSACCION</span>
                </label>
                <input type="text" placeholder="COD" class="input input-bordered w-full bg-white" name="placa" required />
                <button type="button" class="btn btn-info mt-2">Buscar</button>
            </div>

            <div class="overflow-x-auto mt-6">
                <table class="table w-full">
                      <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Nombre del usuario</th>
                            <th>Modelo de vehiculo</th>
                            <th>Numero de placa</th>
                            <th>Descripcion</th>
                            <th></th>
                        </tr>
                    </thead>
                     <tbody>
                        <tr>
                            <td>01/01/2023</td>
                            <td>Cy Ganderton</td>
                            <td>Chevrolet Spark</td>
                            <td>ABC123</td>
                            <td>Usuario regular</td>
                            <td><a href="#">Editar</a> | <a href="#">Eliminar</a></td>
                        </tr>
                        <tr>
                            <td>02/02/2023</td>
                            <td>Hart Hagerty</td>
                            <td>Ford Mustang</td>
                            <td>XYZ456</td>
                            <td>Administrador</td>
                            <td><a href="#">Editar</a> | <a href="#">Eliminar</a></td>
                        </tr>
                        <tr>
                            <td>03/03/2023</td>
                            <td>Brice Swyre</td>
                            <td>Toyota Corolla</td>
                            <td>DEF789</td>
                            <td>Usuario regular</td>
                            <td><a href="#">Editar</a> | <a href="#">Eliminar</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
</body>
</html>
