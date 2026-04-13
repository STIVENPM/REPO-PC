package TRABAJOSP11;


public class Eight {
    public static todos Todos = new todos();

    public static void eight() {
        double D = Math.sqrt(Math.pow((Todos.b - Todos.a), 2) + Math.pow((Todos.d - Todos.c), 2));
        System.out.println("La distancia entre los puntos es: " + D);
    }
}
