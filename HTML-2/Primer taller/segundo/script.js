   /* Botón de mensaje */ 
let contador = 0;
   document.getElementById("btnContador")
        .addEventListener("click", function() {
            contador++;
            document. getElementById("contador")
                .textContent = "Clics: " + contador;
    
});
// Ejercicio 5 - Lista dinámica

document.getElementById("btnAgregar").addEventListener("click", function(){

    var texto = document.getElementById("tareaInput").value;

    if(texto !== ""){
        var nuevoElemento = document.createElement("li");
        nuevoElemento.textContent = texto;
        document.getElementById("listaTareas")
        .appendChild(nuevoElemento);
        document.getElementById("tareaInput").value = "";
    }
});
// Ejercicio 6 - Validación de formulario

document.getElementById("formulario").addEventListener("submit", function(event){

    event.preventDefault(); // evita que la página se recargue

    var nombre = document.getElementById("nombre").value;
    var correo = document.getElementById("correo").value;
    var edad = document.getElementById("edad").value;

    if(nombre === "" || correo === "" || edad === ""){
        document.getElementById("mensaje").textContent = "Debe completar todos los campos";
        document.getElementById("mensaje").style.color = "red";
    }else{
        document.getElementById("mensaje").textContent = "Formulario enviado correctamente";
        document.getElementById("mensaje").style.color = "green";
    }

});
        