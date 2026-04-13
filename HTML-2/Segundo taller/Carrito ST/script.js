// Array donde se guardarán los productos del carrito
let productos = [];

// Evento para agregar productos
document.getElementById("productForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let nombre = document.getElementById("nombreProducto").value.trim();
    let precio = parseFloat(document.getElementById("precioProducto").value);

    if (nombre === "" || isNaN(precio) || precio <= 0) {
        document.getElementById("resultadoAgregar").textContent = "Debe ingresar un nombre y un precio valido";
        document.getElementById("resultadoAgregar").style.color = "red";
        return;
    }

    let nuevoProducto = {
        nombre: nombre,
        precio: precio
    };

    productos.push(nuevoProducto);

    document.getElementById("resultadoAgregar").textContent = "Producto agregado correctamente";
    document.getElementById("resultadoAgregar").style.color = "green";

    document.getElementById("resultadoEliminar").textContent = "";

    actualizarListaProductos();
    actualizarTotal();

    document.getElementById("productForm").reset();
});

// Evento para eliminar producto seleccionado
document.getElementById("eliminarProducto").addEventListener("click", function() {
    let lista = document.getElementById("listaProductos");
    let indice = lista.selectedIndex;

    if (productos.length === 0) {
        document.getElementById("resultadoEliminar").textContent = "No hay productos en el carrito";
        document.getElementById("resultadoEliminar").style.color = "red";
        return;
    }

    productos.splice(indice, 1);

    document.getElementById("resultadoEliminar").textContent = "Producto eliminado correctamente";
    document.getElementById("resultadoEliminar").style.color = "green";

    document.getElementById("resultadoAgregar").textContent = "";

    actualizarListaProductos();
    actualizarTotal();
});

// Funcion para mostrar los productos en el select
function actualizarListaProductos() {
    let lista = document.getElementById("listaProductos");
    lista.innerHTML = "";

    if (productos.length === 0) {
        let opcion = document.createElement("option");
        opcion.textContent = "No hay productos agregados";
        opcion.value = "";
        lista.appendChild(opcion);
        return;
    }

    productos.forEach(function(producto) {
        let opcion = document.createElement("option");
        opcion.textContent = producto.nombre + " - $" + producto.precio;
        lista.appendChild(opcion);
    });
}

// Funcion para calcular y mostrar el total
function actualizarTotal() {
    let total = 0;

    productos.forEach(function(producto) {
        total += producto.precio;
    });

    document.getElementById("totalCompra").textContent = "$" + total;
}