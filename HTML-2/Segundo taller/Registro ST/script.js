// Array donde se guardarán los estudiantes
let estudiantes = [];

document.getElementById("estudentForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let nombre = document.getElementById("nombreEstudiante").value;
    let curso = document.getElementById("cursoEstudiante").value;
    let nota = parseFloat(document.getElementById("notaEstudiante").value);

    if (nombre === "" || curso === "" || isNaN(nota)) {
        alert("Debe completar todos los campos correctamente");
        return;
    }

    let nuevoEstudiante = {
        nombre: nombre,
        curso: curso,
        nota: nota
    };

    estudiantes.push(nuevoEstudiante);

    document.getElementById("resultado").textContent = "Estudiante registrado correctamente";
    document.getElementById("resultado").style.color = "green";

    actualizarListaEstudiantes();

    document.getElementById("estudentForm").reset();
});

function actualizarListaEstudiantes() {
    let listaEstudiantes = document.getElementById("estudianteConsultar");

    listaEstudiantes.innerHTML = '<option value="">Seleccione un estudiante</option>';

    estudiantes.forEach(function(estudiante) {
        let option = document.createElement("option");
        option.value = estudiante.nombre;
        option.textContent = estudiante.nombre;
        listaEstudiantes.appendChild(option);
    });
}

document.getElementById("btnConsultar").addEventListener("click", function() {
    let nombreEstudiante = document.getElementById("estudianteConsultar").value;

    let estudianteEncontrado = estudiantes.find(function(estudiante) {
        return estudiante.nombre === nombreEstudiante;
    });

    if (estudianteEncontrado) {
        document.getElementById("nombreConsultar").value = "Nombre estudiante : " + estudianteEncontrado.nombre;
        document.getElementById("cursoConsultar").value = "Nombre curso : " + estudianteEncontrado.curso;
        document.getElementById("notaConsultar").value = "Nota final : " + estudianteEncontrado.nota;

    // Evaluar la nota
    if (estudianteEncontrado.nota < 3) {
        document.getElementById("resultadoConsulta").textContent = "Perdió el grado";
        document.getElementById("resultadoConsulta").style.color = "red";
    } 
    else if (estudianteEncontrado.nota <= 5) {
        document.getElementById("resultadoConsulta").textContent = "Aprobo el curso";
        document.getElementById("resultadoConsulta").style.color = "green";
    }
}
});