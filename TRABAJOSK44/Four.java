package TRABAJOSK44;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa el radio del cono:");
double radioC = SP.nextDouble();

System.out.println("ingresa la altura del cono:");
double alturaD = SP.nextDouble();

double VolumenC = (Math.PI * radioC * radioC * alturaD) / 3.0;

System.out.println("el volumen del cono es: " + VolumenC);

        






SP.close();
    }
    
}
