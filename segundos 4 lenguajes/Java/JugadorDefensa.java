package Java;
abstract class JugadorDefensa {
    String nombre;
    int nivel;

    public JugadorDefensa() {}

    public JugadorDefensa(String nombre) {
        this.nombre = nombre;
    }

    public JugadorDefensa(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorDefensa(JugadorDefensa j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }

    abstract void defender();
}

