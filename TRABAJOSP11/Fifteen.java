package TRABAJOSP11;

public class Fifteen {
    public static todos Todos = new todos();

    public static void fifteen() {
        double TB = 0;

        if (Todos.a >= 0 && Todos.a < 1000) {
            TB = (0 * Todos.a) / 100;
        } else if (Todos.a >= 1000 && Todos.a < 5000) {
            TB = (3 * Todos.a) / 100;
        } else if (Todos.a >= 5000 && Todos.a < 20000) {
            TB = (5 * Todos.a) / 100;
        } else if (Todos.a >= 20000) {
            TB = (8 * Todos.a) / 100;
        }
        System.out.println("bonificacion total: " + TB);
    }
}