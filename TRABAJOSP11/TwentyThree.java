package TRABAJOSP11;

public class TwentyThree {
    public static todos Todos = new todos(); // No se usa directamente para la lógica, pero mantiene la estructura

    public static void twentyThree() {
        for (int k = 1; k <= 10; k++) {
            int Q = k / 2;
            int R = k - (Q * 2);

            if (R == 0) {
                continue; // Si es par, saltar a la siguiente iteración
            } else {
                System.out.println(k);
            }
        }
    }
}