package TRABAJOSK44;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa el radio de la esfera:");
double RadioE = SP.nextDouble();

double VolumenE = (4.0/3.0) * Math.PI * RadioE * RadioE * RadioE;

System.out.println("el volumen de la esfera es: " + VolumenE);
SP.close();
    }
    
}
