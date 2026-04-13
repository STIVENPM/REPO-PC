package TRABAJOSK33; 
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa el primer  real:");
        double realOne = SP.nextDouble();

        System.out.println("ingresa el segundo  real:");
        double realTwo = SP.nextDouble();

        
        System.out.println("ingresa el tercer  real:");
        double realThree = SP.nextDouble();

        double suma = (realOne + realTwo + realThree)/3;

        System.out.println("el promedio de los tres numeros es: " + suma);
SP.close();
    }
    
}
