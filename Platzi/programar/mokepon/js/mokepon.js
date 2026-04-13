let ataqueJugador 
let ataqueEnemigo


function iniciarJuego(){
    let botonMascotaJugador = document.getElementById('boton-mascota')
    botonMascotaJugador.addEventListener('click', seleccionarMascotaJugador)

    let botonFuego = document.getElementById('boton-fuego')
    botonFuego.addEventListener('click', ataqueFuego)
    let botonAgua = document.getElementById('boton-agua')
    botonAgua.addEventListener('click', ataqueAgua)
    let botonTierra = document.getElementById('boton-tierra')
    botonTierra.addEventListener('click', ataqueTierra)
    


}

function  seleccionarMascotaJugador(){
    let inputMascota1 = document.getElementById('mascota1')
    let inputMascota2 = document.getElementById('mascota2')
    let inputMascota3 = document.getElementById('mascota3')
    let spanMascotaJugador = document.getElementById('mascota-jugador')

    if (inputMascota1.checked){
        spanMascotaJugador.innerHTML = ' mascota1 '
    } else if(inputMascota2.checked){
        spanMascotaJugador.innerHTML = ' mascota2 ' 
    } else if(inputMascota3.checked){
        spanMascotaJugador.innerHTML = ' mascota3 ' 
    } else {
        alert('selecciona una mascota ')
    }

    seleccionarMascotaEnemigo()
}
function  seleccionarMascotaEnemigo(){
    let mascotaAleatoria = aleatorio(1,3)
    let spanMascotaEnemigo = document.getElementById('mascota-enemigo')


    if (mascotaAleatoria == 1 ){
        spanMascotaEnemigo.innerHTML = ' mascota1 '
    } else if (mascotaAleatoria == 2){
        spanMascotaEnemigo.innerHTML = ' mascota2 '
    } else {
        spanMascotaEnemigo.innerHTML = ' mascota3 '
    }
}

function ataqueFuego(){
    ataqueJugador = 'fuego'
    ataqueAleatorioEnemigo()
}
function ataqueAgua(){
    ataqueJugador = 'fuego'
    ataqueAleatorioEnemigo()
}
function ataqueTierra(){
    ataqueJugador = 'fuego'
    ataqueAleatorioEnemigo()
}

function ataqueAleatorioEnemigo(){
    let ataqueAleatorio = aleatorio =(1,3)

    if (ataqueAleatorio == 1){
        ataqueEnemigo = 'fuego'
    } else if (ataqueAleatorio == 2){
        ataqueEnemigo = 'agua'
    } else{
        ataqueEnemigo ='tierra'
    }
    
}

function aleatorio(min, max){
    return Math.floor(Math.random() * (max - min + 1) + min)
}


window.addEventListener('load', iniciarJuego)