   /* Botón de mensaje */ 
   document.getElementById("btnMensaje")
        .addEventListener("click", function() {
    document.getElementById("resultado")
        .textContent = "Hola mundo desde JavaScript";
});
    /* Botón de suma */
    document.getElementById("btnSumar")
        .addEventListener("click", function() {
            addEventListener
            var num2 = parseFloat (document.getElementById("num2").value);
            var suma = num1 + num2;
    document.getElementById("resultadoSuma")
    .textContent = "La suma es: " + suma;
});
// Ejercicio 3 - Cambiar color de fondo

document.addEventListener("DOMContentLoaded", () => {

    const colores = {
        btnRojo: "#e74c3c",
        btnAzul: "#3498db",
        btnVerde: "#2ecc71"
    };

    document.getElementById("btnRojo").addEventListener("click", function(){
        document.body.style.backgroundColor = colores.btnRojo;
    });

    document.getElementById("btnAzul").addEventListener("click", function(){
        document.body.style.backgroundColor = colores.btnAzul;
    });

    document.getElementById("btnVerde").addEventListener("click", function(){
        document.body.style.backgroundColor = colores.btnVerde;
    });

});
        