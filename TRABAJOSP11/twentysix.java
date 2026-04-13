package TRABAJOSP11;

public class TwentySix {
    public static todos Todos = new todos(); 

    public static void twentySix() {
        int A = 0, B = 1, C = A + B;

        System.out.print(A + ", " + B);

        while (C < 100000) {
            System.out.print(", " + C);
            A = B;
            B = C;
            C = A + B;
        }
        System.out.println(); 
    }
}