package Java;
public class JugadorVIP {
    String nombre;
    int nivel;

    public JugadorVIP() {
        nombre = "VIP Juan";
        nivel = 50;
    }

    public JugadorVIP(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public JugadorVIP(String nombre) {
        this.nombre = nombre;
        this.nivel = 99;
    }

    public JugadorVIP(JugadorVIP j) {
        this.nombre = j.nombre;
        this.nivel = j.nivel;
    }
}

