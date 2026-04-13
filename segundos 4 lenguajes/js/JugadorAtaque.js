export class JugadorAtaque {
    constructor(nombre = "Anon", nivel = 1, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }

    golpear() {
        throw new Error("Método golpear() debe implementarse.");
    }
}
