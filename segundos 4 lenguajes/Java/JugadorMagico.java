package Java;
abstract class JugadorMagico {
    String nombre;
    int nivel;

    public JugadorMagico() {
        nombre = "Mago";
        nivel = 5;
    }

    public JugadorMagico(String nombre) {
        this.nombre = nombre;
        this.nivel = 10;
    }

    public JugadorMagico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorMagico(JugadorMagico j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }

    abstract void lanzarHechizo();
}

