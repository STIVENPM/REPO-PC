package TRABAJOSK44;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        
        System.out.println("ingresa grados celsius ");
        double celsius = SP.nextDouble();
        
        double kelvin = celsius + 273.15;
        System.out.println("grados kelvin son: "+kelvin);
SP.close();
    }
    
}
