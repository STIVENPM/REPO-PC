// Ejercicio 7 - Calculadora básica

document.getElementById("btnCalcular").addEventListener("click", function(){

    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var operacion = document.getElementById("operacion").value;

    var resultado;

    if(operacion === "+"){
        resultado = num1 + num2;
    }
    else if(operacion === "-"){
        resultado = num1 - num2;
    }
    else if(operacion === "*"){
        resultado = num1 * num2;
    }
    else if(operacion === "/"){
        resultado = num1 / num2;
    }

    document.getElementById("resultadoCalc").textContent = "Resultado: " + resultado;

});
// Ejercicio 8 - Lista con eliminar

document.getElementById("btnAgregar2").addEventListener("click", function(){

    var texto = document.getElementById("tareaInput2").value;

    if(texto !== ""){

        // crear elemento li
        var tarea = document.createElement("li");

        // texto de la tarea
        tarea.textContent = texto ;

        // crear boton eliminar
        var botonEliminar = document.createElement("button");

        botonEliminar.textContent = "Eliminar";

        // evento para eliminar
        botonEliminar.addEventListener("click", function(){
            tarea.remove();
        });

        // agregar boton al li
        tarea.appendChild(botonEliminar);

        // agregar li a la lista
        document.getElementById("listaTareas2").appendChild(tarea);

        // limpiar input
        document.getElementById("tareaInput2").value = "";
    }

});
// Ejercicio 9 - Temporizador

let segundos = 0;
let intervalo = null;

document.getElementById("btnIniciar").addEventListener("click", function(){

    if(intervalo === null){

        intervalo = setInterval(function(){

            segundos++;

            document.getElementById("tiempo").textContent = segundos;

        }, 1000);

    }

});

document.getElementById("btnDetener").addEventListener("click", function(){

    clearInterval(intervalo);
    intervalo = null;

});

document.getElementById("btnReiniciar").addEventListener("click", function(){

    clearInterval(intervalo);
    intervalo = null;
    segundos = 0;

    document.getElementById("tiempo").textContent = segundos;

});