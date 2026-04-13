package TRABAJOSK33; 
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        
        System.out.println("ingresa el primer  real:");
        double realOne = SP.nextDouble();

        System.out.println("ingresa el segundo  real:");
        double realTwo = SP.nextDouble();

        double suma = realOne + realTwo;

        System.out.println("la suma de los dos reales es: " + suma);

SP.close();
    }
    
}
