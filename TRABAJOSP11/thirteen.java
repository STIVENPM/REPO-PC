package TRABAJOSP11;

public class Thirteen {
    public static todos Todos = new todos();

    public static void thirteen() {
        if (Todos.A != Todos.B && Todos.B != Todos.C && Todos.C != Todos.A) {
            System.out.println("escaleno");
        } else {
            if (Todos.A == Todos.B && Todos.B == Todos.C) {
                System.out.println("equilatero");
            } else {
                System.out.println("isoceles");
            }
        }
    }
}