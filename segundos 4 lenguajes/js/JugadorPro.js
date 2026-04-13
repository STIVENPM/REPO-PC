export class JugadorPro {
    constructor(nombre = "Juan", nivel = 10, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }
}
