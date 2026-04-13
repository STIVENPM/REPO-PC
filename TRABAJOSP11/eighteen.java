package TRABAJOSP11;

public class Eighteen {
    public static todos Todos = new todos();

    public static void eighteen() {
        int Q = Todos.A / 2;
        int R = Todos.A - (Q * 2);
        String MSG = "";

        if (R == 0) {
            MSG = "es par";
        } else {
            MSG = "es impar";
        }
        System.out.println(MSG);
    }
}