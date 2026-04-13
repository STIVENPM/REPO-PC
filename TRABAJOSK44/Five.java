package TRABAJOSK44;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.println("ingresa los celsius");
        double celsius = SP.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("fahrenheit: " + fahrenheit);
SP.close();
    }
    
}
