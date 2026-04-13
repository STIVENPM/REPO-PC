export class JugadorCurador {
    constructor(nombre = "Curador", nivel = 1, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }

    curar() {
        throw new Error("Método curar() debe implementarse.");
    }
}
