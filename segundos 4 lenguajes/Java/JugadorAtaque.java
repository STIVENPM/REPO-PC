package Java;
abstract class JugadorAtaque {
    String nombre;
    int nivel;

    public JugadorAtaque() {}

    public JugadorAtaque(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorAtaque(int nivel) {
        this.nombre = "Anon";
        this.nivel = nivel;
    }

    public JugadorAtaque(JugadorAtaque j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }

    abstract void golpear();
}

