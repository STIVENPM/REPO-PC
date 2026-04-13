package TRABAJOSK22;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println(" ingresa un numero real: ");
        double Real = SP.nextDouble();

        double cubo = Real * Real * Real;

        System.out.println("el cubo de numero Real es: " + cubo);

SP .close();
    }
    
}
