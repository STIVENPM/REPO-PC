package Java;
class JugadorExperto {
    String nombre;
    int nivel;

    public JugadorExperto() {
        nombre = "Experto";
        nivel = 20;
    }

    public JugadorExperto(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorExperto(String nombre) {
        this.nombre = nombre;
        this.nivel = 20;
    }

    public JugadorExperto(JugadorExperto j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }
}
