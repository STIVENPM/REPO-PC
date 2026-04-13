// obtener la página actual
let pagina = window.location.pathname.split("/").pop();

// si está vacío significa que es index
if (pagina === "") {
    pagina = "index.html";
}

// seleccionar todos los enlaces del menú
let enlaces = document.querySelectorAll("nav a");

// recorrer los enlaces
enlaces.forEach(function(enlace){

    let link = enlace.getAttribute("href");

    // comparar con la página actual
    if(link.includes(pagina)){
        enlace.classList.add("activo");
    }

});