export class JugadorNovato {
    constructor(nombre = "Novato", nivel = 1, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }
}
