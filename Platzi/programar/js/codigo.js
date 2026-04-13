
    function aleatorio(min, max) {
        return Math.floor(Math.random() * (max - min + 1) + min);
    }
    function eleccion (jugada){
        let resultado=""
        // Mostrar elección según la jugada que se pase
        if (jugada == 1) {
            resultado ="Piedra"
        } else if (jugada == 2) {
            resultado ="Papel"
        } else if (jugada == 3) {
            resultado ="Tijera"
        } else {
            resultado ="Opción inválida"
        }
        return resultado
    }

    // Elección de la PC
    let jugador = 0
    let pc = 0
    let triunfos = 0
    let perdidas = 0
    

    while (triunfos < 3 && perdidas < 3) {
        // Elección de la PC
        pc = aleatorio(1, 3);

        // Elección del jugador
        jugador = prompt("Elige: 1 para piedra, 2 para papel, 3 para tijera");

        alert("PC eligió: " + eleccion(pc))
        alert("Tú elegiste: " + eleccion(jugador))

        // Combate (solo si la elección del jugador es válida)
        if(pc == jugador){
            alert("empate")
        }else if(jugador ==1 && pc ==3){
            alert("ganaste")
            triunfos= triunfos + 1
        }else if(jugador ==2 && pc ==1){
            alert("ganaste")
            triunfos= triunfos + 1
        }else if(jugador ==3 && pc ==2){
            alert("ganaste")
            triunfos= triunfos + 1
        }else{
            alert("Perdiste 😢");
            perdidas= perdidas + 1
        }
        
    }
    alert(" ganaste " + triunfos + "veces. perdiste " + perdidas + " veces ")

