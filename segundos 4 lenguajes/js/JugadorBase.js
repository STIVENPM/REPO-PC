export class JugadorBase {
    constructor(nombre = "Juan", nivel = 10, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }

    atacar() {
        throw new Error("Método atacar() debe ser implementado.");
    }
}
