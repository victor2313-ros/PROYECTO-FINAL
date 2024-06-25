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
        <h1 class="text-2xl font-bold mb-4">INGRESOS GENERADOS</h1>
        <form action="process_entrada.jsp" method="POST" class="space-y-4">
            <div class="form-control w-full">
                <label class="label">
                    <span class="label-text">Fecha</span>
                </label>
                <input type="date" placeholder="Fecha" class="input input-bordered w-full bg-white" name="fecha" required />
                <button type="button" class="btn btn-info mt-2">Generar PDF</button>
            </div>

            <div class="overflow-x-auto mt-6">
                <table class="table w-full">
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Precio</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>2024-06-25</td>
                            <td>$10.00</td>
                        </tr>
                        <tr>
                            <td>2024-06-25</td>
                            <td>$15.00</td>
                        </tr>
                        <tr>
                            <td>2024-06-25</td>
                            <td>$12.50</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </form>
    </div>
</body>
</html>
