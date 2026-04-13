package Java;
abstract class JugadorBase {
    String nombre;
    int nivel;

    public JugadorBase() {
        nombre = "Juan";
        nivel = 10;
    }

    public JugadorBase(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorBase(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
    }

    public JugadorBase(JugadorBase j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }

    abstract void atacar();
}

