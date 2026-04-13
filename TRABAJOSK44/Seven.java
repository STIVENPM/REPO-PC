package TRABAJOSK44;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa fahrenheit");
        double fahrenheit = SP.nextInt();

        double celsius = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("la temperatura en celsius es: " + celsius);
SP.close();
    }
    
}
