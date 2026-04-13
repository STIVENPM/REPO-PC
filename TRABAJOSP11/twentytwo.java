package TRABAJOSP11;

public class TwentyTwo {
    public static todos Todos = new todos();

    public static void twentyTwo() {
        int producto = 0;
        for (int k = 1; k <= Todos.B; k++) { 
            producto += Todos.A; 
        }
        System.out.println("el producto es: " + producto);
    }
}