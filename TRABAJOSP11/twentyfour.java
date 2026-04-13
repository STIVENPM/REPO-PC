package TRABAJOSP11;

public class TwentyFour {
    public static todos Todos = new todos(); // No se usa directamente para la lógica, pero mantiene la estructura

    public static void twentyFour() {
        int S = 1;
        while (S < 1000) {
            System.out.println(S);
            S = (S * S) + 1;
        }
    }
}