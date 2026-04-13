package TRABAJOSK33;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa el primer  real:");
        double R1 = SP.nextDouble();

        System.out.println("ingresa el segundo  real:");
        double R2 = SP.nextDouble();

        
        System.out.println("ingresa el tercer  real:");
        double R3 = SP.nextDouble();

        double MultipicacionR1= (R1 * 100);
        double MultipicacionR2 = (R2 * 10);
        double MultipicacionR3 = (R3 * 1);


        double suma = MultipicacionR1 + MultipicacionR2 + MultipicacionR3;

        System.out.println("la ssumatoria de los tres reales es: " + suma);



    SP.close();
    }
    
}
