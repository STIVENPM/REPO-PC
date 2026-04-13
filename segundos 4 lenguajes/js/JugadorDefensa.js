export class JugadorDefensa {
    constructor(nombre = "Defensor", nivel = 1, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }

    defender() {
        throw new Error("Método defender() debe implementarse.");
    }
}
