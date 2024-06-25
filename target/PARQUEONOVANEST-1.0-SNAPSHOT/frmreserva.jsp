<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Parqueos Novanets - Reserva de Espacio</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.2/dist/full.min.css" rel="stylesheet">
        <link href="https://unpkg.com/@webpixels/css@1.2.6/dist/index.css" rel="stylesheet">
        <style>
            .mb-5 {
                margin-bottom: 1rem; /* Ajustar el margen inferior */
            }
            .form-control,
            .textarea,
            .select {
                padding: 0.5rem; /* Ajustar el padding */
            }
            .form-label {
                margin-bottom: 0.5rem; /* Ajustar el margen inferior del label */
            }
            .btn {
                padding: 0.5rem 1rem; /* Ajustar el padding del botón */
            }
            .flex-container {
                display: flex;
                flex-wrap: wrap;
            }
            .flex-item {
                flex: 1;
                min-width: 200px; /* Ajustar el tamaño mínimo de los elementos flex */
                padding: 0 1rem; /* Ajustar el padding horizontal */
            }
        </style>
    </head>
    <body>
        <div class="max-w-md mx-auto p-6">
            <h1 class="text-2xl font-bold mb-6">RESERVA DE ESPACIO</h1>
            <form action="reservaControlador" method="post">
                <input type="hidden" name="id_reserva" value="${reserva.id_reserva}">
                <input type="hidden" name="espacio_ID" >

                <div class="flex-container">
                    <div class="flex-item mb-5">
                        <label class="form-label" for="fechareserva">Fecha de Reserva</label>
                        <input type="date" class="form-control" id="fechareserva" name="fechaReserva" placeholder="Fecha de reserva">
                    </div>
                    <div class="flex-item mb-5">
                        <label class="form-label" for="nombres">Nombres</label>
                        <input type="text" class="form-control" id="nombres" name="nombres" placeholder="Nombres">
                    </div>
                    <div class="flex-item mb-5">
                        <label class="form-label" for="modeloVehiculo">Modelo de vehiculo</label>
                        <input type="text" class="form-control" id="modelovehiculo" name="modeloVehiculo" placeholder="Modelo de vehiculo">
                    </div>
                    <div class="flex-item mb-5">
                        <label class="form-label" for="numeroplaca">Numero de Placa</label>
                        <input type="text" class="form-control" id="numeroplaca" name="numeroplaca" placeholder="Numero de placa">
                    </div>
                    <div class="flex-item mb-5">
                        <label class="form-label" for="descripcionvehiculo">Descripcion del vehiculo</label>
                        <textarea class="form-control textarea textarea-success" id="descripcionvehiculo" name="descripcionVehiculo" placeholder="Descripcion del vehiculo"></textarea>
                    </div>
                    <div class="flex-item mb-5">
                        <label class="form-label" for="areaReservada">Areas Disponibles</label>
                        <select class="select select-bordered bg-white w-full max-w-xs" id="areaReservada" name="areaReservada">
                            <option disabled selected>Selecciona una area</option>
                            <option name="areaReservada">A-1</option>
                            <option name="areaReservada">A-2</option>
                            <option name="areaReservada" >A-3</option>
                            <option  name="areaReservada">A-4</option>
                            <option  name="areaReservada">A-5</option>
                            <option  name="areaReservada">A-6</option>
                            <option  name="areaReservada">A-7</option>
                            <option  name="areaReservada">A-8</option>
                            <option name="areaReservada" >A-9</option>
                            <option name="areaReservada">A-10</option>
                        </select>
                    </div>
                </div>
                <div>
                    <button type="submit" class="btn btn-success w-full">Reservar</button>
                </div>
            </form>
        </div>
    </body>
</html>
