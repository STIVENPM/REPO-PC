// Array donde se guardarán los libros
let libros = [];

// Evento para registrar libros
document.getElementById("libroForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let titulo = document.getElementById("tituloLibro").value.trim();
    let autor = document.getElementById("autorLibro").value.trim();

    if (titulo === "" || autor === "") {
        document.getElementById("resultadoRegistro").textContent = "Debe ingresar el titulo y el autor del libro";
        document.getElementById("resultadoRegistro").style.color = "red";
        return;
    }

    let nuevoLibro = {
        titulo: titulo,
        autor: autor,
        estado: "Disponible"
    };

    libros.push(nuevoLibro);

    document.getElementById("resultadoRegistro").textContent = "Libro registrado correctamente";
    document.getElementById("resultadoRegistro").style.color = "green";

    document.getElementById("resultadoAccion").textContent = "";

    actualizarListaLibros();

    document.getElementById("libroForm").reset();
});

// Evento para prestar libro seleccionado
document.getElementById("prestarLibro").addEventListener("click", function() {
    let lista = document.getElementById("listaLibros");
    let indice = lista.selectedIndex;

    if (libros.length === 0) {
        document.getElementById("resultadoAccion").textContent = "No hay libros registrados";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    if (indice === -1) {
        document.getElementById("resultadoAccion").textContent = "Debe seleccionar un libro";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    if (libros[indice].estado === "Prestado") {
        document.getElementById("resultadoAccion").textContent = "El libro ya esta prestado";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    libros[indice].estado = "Prestado";

    document.getElementById("resultadoAccion").textContent = "Libro prestado correctamente";
    document.getElementById("resultadoAccion").style.color = "green";

    document.getElementById("resultadoRegistro").textContent = "";

    actualizarListaLibros();
});

// Evento para devolver libro seleccionado
document.getElementById("devolverLibro").addEventListener("click", function() {
    let lista = document.getElementById("listaLibros");
    let indice = lista.selectedIndex;

    if (libros.length === 0) {
        document.getElementById("resultadoAccion").textContent = "No hay libros registrados";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    if (indice === -1) {
        document.getElementById("resultadoAccion").textContent = "Debe seleccionar un libro";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    if (libros[indice].estado === "Disponible") {
        document.getElementById("resultadoAccion").textContent = "El libro ya esta disponible";
        document.getElementById("resultadoAccion").style.color = "red";
        return;
    }

    libros[indice].estado = "Disponible";

    document.getElementById("resultadoAccion").textContent = "Libro devuelto correctamente";
    document.getElementById("resultadoAccion").style.color = "green";

    document.getElementById("resultadoRegistro").textContent = "";

    actualizarListaLibros();
});

// Funcion para mostrar los libros en el select
function actualizarListaLibros() {
    let lista = document.getElementById("listaLibros");
    lista.innerHTML = "";

    if (libros.length === 0) {
        let opcion = document.createElement("option");
        opcion.textContent = "No hay libros registrados";
        opcion.value = "";
        lista.appendChild(opcion);
        return;
    }

    libros.forEach(function(libro) {
        let opcion = document.createElement("option");
        opcion.textContent = libro.titulo + " - " + libro.autor + " - " + libro.estado;
        lista.appendChild(opcion);
    });
}