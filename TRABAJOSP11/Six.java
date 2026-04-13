package TRABAJOSP11;

public class Six {
    public static todos Todos = new todos();

    public static void six() {
        double LS = (Todos.a + Todos.b + Todos.c) / 2;
        double AT = Math.sqrt(LS * (LS - Todos.a) * (LS - Todos.b) * (LS - Todos.c));
        System.out.println("El area del triangulo es: " + AT);
    }
}
