package TRABAJOSK33; 
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        
        System.out.println("ingresa el primer  real:");
        double realOne = SP.nextDouble();

        System.out.println("ingresa el segundo  real:");
        double realTwo = SP.nextDouble();

        
        System.out.println("ingresa el tercer  real:");
        double realThree = SP.nextDouble();

        double suma = realOne + realTwo + realThree;

        System.out.println("la suma de los tres reales es: " + suma);

SP.close();
    }
    
}