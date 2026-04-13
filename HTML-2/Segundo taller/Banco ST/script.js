// Array donde se guardan todos los usuarios
let usuarios = []; 

// Registro de usuarios
document.getElementById("formCuenta").addEventListener("submit", function(event) { // event: información del evento que ocurrió
    event.preventDefault(); // event.preventDefault(): evita que el formulario se recargue o se envíe

    let nombre = document.getElementById("nombre").value; 
    let correo = document.getElementById("correo").value; 

    if (nombre === "" || correo === "") {
        document.getElementById("resultado").textContent = "Debe completar todos los campos"; 
        document.getElementById("resultado").style.color = "red"; 
    } else {
        let nuevoUsuario = { // let: variable local para guardar el nuevo usuario
            nombre: nombre,
            correo: correo,
            saldo: 0
        };

        usuarios.push(nuevoUsuario); // push: agrega un elemento al final del array

        document.getElementById("resultado").textContent = "Usuario registrado correctamente"; 
        document.getElementById("resultado").style.color = "green"; 

        actualizarListasUsuarios();

        document.getElementById("formCuenta").reset(); // reset: limpia todos los campos del formulario
    }
});

// Funcion para actualizar el select de usuarios
function actualizarListasUsuarios() {
    let usuarioOperacion = document.getElementById("usuarioOperacion"); 

    // Limpiar el select
    usuarioOperacion.innerHTML = '<option value="">Seleccione un usuario</option>'; // innerHTML: reemplaza el contenido HTML

    // Recorrer el array de usuarios
    usuarios.forEach(function(usuario, indice) { // forEach: recorre uno por uno el array
        // indice: posición de cada usuario dentro del array
        let opcion = document.createElement("option");
        opcion.value = indice; 
        opcion.textContent = usuario.nombre; 
        usuarioOperacion.appendChild(opcion); // appendChild: agrega el elemento hijo al select
    });
}

// Operaciones bancarias
document.getElementById("btnOperacion").addEventListener("click", function() {
    let indice = document.getElementById("usuarioOperacion").value; 
    let operacion = document.getElementById("operacion").value; 
    let monto = parseFloat(document.getElementById("monto").value); 

    if (indice === "") {
        document.getElementById("resultadoOperacion").textContent = "Debe seleccionar un usuario"; 
        document.getElementById("resultadoOperacion").style.color = "red"; 
        return;
    }

    let usuario = usuarios[indice]; 

    if (operacion === "consultar") {
        document.getElementById("resultadoOperacion").textContent =
            "Saldo disponible de " + usuario.nombre + ": $" + usuario.saldo; 
        document.getElementById("resultadoOperacion").style.color = "green"; 
    }

    else if (operacion === "ingresar") {
        if (isNaN(monto) || monto <= 0) { // isNaN: verifica si el valor no es un número
            document.getElementById("resultadoOperacion").textContent = "Ingrese un monto válido"; 
            document.getElementById("resultadoOperacion").style.color = "red"; 
        } else {
            usuario.saldo = usuario.saldo + monto;
            document.getElementById("resultadoOperacion").textContent =
                "Se ingresaron $" + monto + " a " + usuario.nombre; 
            document.getElementById("resultadoOperacion").style.color = "green"; 
            actualizarListasUsuarios();
            document.getElementById("monto").value = ""; 
        }

    }

    else if (operacion === "retirar") {
        if (isNaN(monto) || monto <= 0) { 
            document.getElementById("resultadoOperacion").textContent = "Ingrese un monto válido"; 
            document.getElementById("resultadoOperacion").style.color = "red"; 
        } else if (monto > usuario.saldo) {
            document.getElementById("resultadoOperacion").textContent =
                "No se puede retirar. Saldo insuficiente"; 
            document.getElementById("resultadoOperacion").style.color = "red"; 
        } else {
            usuario.saldo -= monto;
            document.getElementById("resultadoOperacion").textContent =
                "Se retiraron $" + monto + " de " + usuario.nombre; 
            document.getElementById("resultadoOperacion").style.color = "green"; 
            actualizarListasUsuarios();
            document.getElementById("monto").value = ""; 
        }
    }
});