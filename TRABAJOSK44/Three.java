package TRABAJOSK44;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        
        System.out.println("ingresa el radio del cilindro:");
double RadioC = SP.nextDouble();

System.out.println("ingresa la altura del cilindro:");
double AlturaC = SP.nextDouble();

double VolumenC = Math.PI * RadioC * RadioC * AlturaC;

System.out.println("el volumen del cilindro es: " + VolumenC);

SP.close();
    }
    
}
