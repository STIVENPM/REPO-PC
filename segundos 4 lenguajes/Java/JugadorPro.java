package Java;
class JugadorPro {
    String nombre;
    int nivel;

    public JugadorPro() {
        this("Juan", 10);
    }

    public JugadorPro(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorPro(int nivel) {
        this.nombre = "Desconocido";
        this.nivel = nivel;
    }

    public JugadorPro(JugadorPro p) {
        this.nombre = p.nombre;
        this.nivel = p.nivel;
    }
}

