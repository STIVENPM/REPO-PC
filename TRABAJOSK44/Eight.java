package TRABAJOSK44;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa fahrenheit  ");
        double fahrenheit  = SP.nextInt();

        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("The temperature in Kelvin is: " + kelvin);
SP.close();
    }
    
}
