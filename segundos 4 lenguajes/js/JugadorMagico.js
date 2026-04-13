export class JugadorMagico {
    constructor(nombre = "Mago", nivel = 5, copia = null) {
        if (copia) {
            this.nombre = copia.nombre;
            this.nivel = copia.nivel;
        } else {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }

    lanzarHechizo() {
        throw new Error("Método lanzarHechizo() debe implementarse.");
    }
}
