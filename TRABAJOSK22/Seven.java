package TRABAJOSK22;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println(" ingresa el primer nUmero real: ");
        double realOne = SP.nextDouble();

        System.out.println("ingresa el segundo numero real: ");
        double realTwo = SP.nextDouble();

        double DR1 = realOne * 2;
        double CR2 = realTwo * realTwo;
        double suma = DR1 + CR2;

        System.out.println("el doble del primer numero es: " + DR1);
        System.out.println("el cuadrado del segundo numero es: " + CR2);
        System.out.println("la suma del doble del primero y el cuadrado del segundo es: " + suma);



SP.close();
    }
    
}
