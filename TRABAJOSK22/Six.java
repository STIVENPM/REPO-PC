package TRABAJOSK22;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa un numero real:");
        double real = SP.nextDouble();

        if (real >= 0) {
            double raiz = Math.sqrt(real);
            System.out.println("la raiz cuadrada del numero Real es:  " + raiz);
        } else {
            System.out.println("la raiz cuadrada es un numero negativo");
        }




SP.close(); 
    }
    
}
