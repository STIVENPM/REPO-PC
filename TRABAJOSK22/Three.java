package TRABAJOSK22;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa un numero real ");
        double real =
        SP.nextDouble();

        double cuadrado = real * real;

        System.out.println("el cuadrado de real es: " + cuadrado);

        SP.close(); 
    }
}