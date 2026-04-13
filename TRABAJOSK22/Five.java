package TRABAJOSK22;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println(" ingresa un numero real: ");
        double real = SP.nextDouble();

        double doble = real * 2;
        double cuadrado = real * real;
        double suma = doble + cuadrado;

        System.out.println("el numero ingresado es: " + real);
        System.out.println("el doble del numero es: " + doble);
        System.out.println("el cuadrado del numero es: " + cuadrado);
        System.out.println("la suma del doble y el cuadrado es: " + suma);








        SP.close();
    }
    
}
