package TRABAJOSK44;
import java.util.Scanner;

public class Nine {
    public static void main(String []args){
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa kelvinn");
        double kelvin = SP.nextInt();

        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.println("fahrenheit: " + fahrenheit);
        SP.close();
    }

    
}
