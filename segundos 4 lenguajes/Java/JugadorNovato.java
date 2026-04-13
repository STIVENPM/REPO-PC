package Java;
class JugadorNovato {
    String nombre;
    int nivel;

    public JugadorNovato() {
        nombre = "Novato";
        nivel = 1;
    }

    public JugadorNovato(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorNovato(int nivel) {
        this.nombre = "Novato";
        this.nivel = nivel;
    }

    public JugadorNovato(JugadorNovato j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }
}

