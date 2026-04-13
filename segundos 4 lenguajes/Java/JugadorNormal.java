package Java;
public class JugadorNormal  {
    String nombre;
    int nivel;

    // Constructor sin parámetros
    public JugadorNormal()  {
        this.nombre = "Juan";
        this.nivel = 10;

        System.out.println("El jugadador normal es: " + nombre + ""+ nivel );
    }

    // Constructor con parámetros
    public JugadorNormal(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;

    
    }

    // Constructor sobrecargado (solo nombre)
    public JugadorNormal(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
    }

    // Constructor copia
    public JugadorNormal(JugadorNormal copia) {
        this.nombre = copia.nombre;
        this.nivel = copia.nivel;

        System.out.println();
    }
}


