// Array donde se guardarán los vehiculos
let vehiculos = [];

// Evento para registrar vehiculos
document.getElementById("vehiculoForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let nombre = document.getElementById("nombreVehiculo").value.trim();
    let velocidad = parseFloat(document.getElementById("velocidadVehiculo").value);

    if (nombre === "" || isNaN(velocidad) || velocidad < 0) {
        document.getElementById("resultadoRegistro").textContent = "Debe ingresar un nombre y una velocidad valida";
        document.getElementById("resultadoRegistro").style.color = "red";
        return;
    }

    let nuevoVehiculo = {
        nombre: nombre,
        velocidad: velocidad
    };

    vehiculos.push(nuevoVehiculo);

    document.getElementById("resultadoRegistro").textContent = "Vehiculo registrado correctamente";
    document.getElementById("resultadoRegistro").style.color = "green";

    document.getElementById("resultadoAccion").textContent = "";

    actualizarListaVehiculos();

    document.getElementById("vehiculoForm").reset();
});

// Evento para aumentar velocidad
document.getElementById("aumentarVelocidad").addEventListener("click", function() {
    let lista = document.getElementById("listaVehiculos");
    let indice = lista.selectedIndex;

    if (indice === -1) {
        document.getElementById("resultadoAccion").textContent = "Debe seleccionar un vehiculo";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    vehiculos[indice].velocidad += 10;

    document.getElementById("resultadoAccion").textContent =
        "La velocidad de " + vehiculos[indice].nombre + " ahora es " + vehiculos[indice].velocidad + " km/h";
    document.getElementById("resultadoAccion").style.color = "green";

    actualizarListaVehiculos();
});

// Evento para disminuir velocidad
document.getElementById("disminuirVelocidad").addEventListener("click", function() {
    let lista = document.getElementById("listaVehiculos");
    let indice = lista.selectedIndex;

    if (indice === -1) {
        document.getElementById("resultadoAccion").textContent = "Debe seleccionar un vehiculo";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    if (vehiculos[indice].velocidad <= 0) {
        document.getElementById("resultadoAccion").textContent =
            "El vehiculo " + vehiculos[indice].nombre + " ya esta detenido";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    vehiculos[indice].velocidad -= 10;

    if (vehiculos[indice].velocidad < 0) {
        vehiculos[indice].velocidad = 0;
    }

    document.getElementById("resultadoAccion").textContent =
        "La velocidad de " + vehiculos[indice].nombre + " ahora es " + vehiculos[indice].velocidad + " km/h";
    document.getElementById("resultadoAccion").style.color = "green";

    actualizarListaVehiculos();
});

// Funcion para mostrar los vehiculos en el select
function actualizarListaVehiculos() {
    let lista = document.getElementById("listaVehiculos");
    lista.innerHTML = "";

    if (vehiculos.length === 0) {
        let opcion = document.createElement("option");
        opcion.textContent = "No hay vehiculos registrados";
        opcion.value = "";
        lista.appendChild(opcion);
        return;
    }

    vehiculos.forEach(function(vehiculo) {
        let opcion = document.createElement("option");
        opcion.textContent = vehiculo.nombre + " - " + vehiculo.velocidad + " km/h";
        lista.appendChild(opcion);
    });
}