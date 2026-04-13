let productos = []; // let: crea una variable donde se guardan los productos

document.getElementById("formProducto").addEventListener("submit", function(event) { 
    event.preventDefault(); // event: objeto del evento que evita que el formulario se recargue

    let nombre = document.getElementById("nombreProducto").value;
    let precio = parseFloat(document.getElementById("precioProducto").value); // parseFloat: convierte el valor a número decimal
    let cantidad = parseInt(document.getElementById("cantidadProducto").value); // parseInt: convierte el valor a número entero

    if (nombre === "" || isNaN(precio) || isNaN(cantidad)) { // isNaN: verifica si el valor no es un número
        document.getElementById("resultado").textContent = "Debe completar todos los campos correctamente";
        document.getElementById("resultado").style.color = "red";
    } else {
        let nuevoProducto = {
            nombre: nombre,
            precio: precio,
            cantidad: cantidad
        };
24793
        productos.push(nuevoProducto); // push: agrega un elemento al final del array

        document.getElementById("resultado").textContent = "Producto agregado correctamente";
        document.getElementById("resultado").style.color = "blue";

        actualizarListaProductos();

        document.getElementById("formProducto").reset(); // reset: limpia todos los campos del formulario
    }
});

function actualizarListaProductos() {
    let listaProductos = document.getElementById("productoConsulta");
    listaProductos.innerHTML = '<option value="">Seleccione un producto</option>';

    productos.forEach(function(producto) {
        let option = document.createElement("option");
        option.value = producto.nombre;
        option.textContent = producto.nombre;
        listaProductos.appendChild(option); // appendChild: agrega un elemento hijo al select
    });
}

document.getElementById("btnConsultar").addEventListener("click", function() {
    let nombreProducto = document.getElementById("productoConsulta").value;

    let productoEncontrado = productos.find(function(producto) { // find: busca un elemento dentro del array
        return producto.nombre === nombreProducto;
    });

    if (productoEncontrado) {

        let valorTotal = productoEncontrado.precio * productoEncontrado.cantidad;

        document.getElementById("nombreConsulta").value = "Nombre del producto: " + productoEncontrado.nombre;
        document.getElementById("precioConsulta").value = "Precio: $" + productoEncontrado.precio;
        document.getElementById("cantidadConsulta").value = "Cantidad disponible: " + productoEncontrado.cantidad;
        document.getElementById("valorTotalConsulta").value = "Valor total inventario: $" + valorTotal;

        document.getElementById("resultadoConsulta").textContent = "Consulta realizada correctamente";
        document.getElementById("resultadoConsulta").style.color = "blue";
    } else {
        document.getElementById("resultadoConsulta").textContent = "Producto no encontrado";
        document.getElementById("resultadoConsulta").style.color = "red";
    }
});