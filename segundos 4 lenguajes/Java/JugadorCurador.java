package Java;
abstract class JugadorCurador {
    String nombre;
    int nivel;

    public JugadorCurador() {}

    public JugadorCurador(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorCurador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
    }

    public JugadorCurador(JugadorCurador j) {
        nombre = j.nombre;
        nivel = j.nivel;
    }

    abstract void curar();
}

