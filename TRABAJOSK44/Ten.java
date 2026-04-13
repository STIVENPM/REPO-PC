package TRABAJOSK44;
import java.util.Scanner;

public class Ten {
    public static void main (String []args){
        Scanner SP = new Scanner (System.in );
        
        System .out.println("ingrese kelvin");
        double kelvin = SP.nextDouble();

        double celsius = kelvin - 273.15;
        System.out.println("la temperatura en celsius es: "+celsius);

        SP.close();
    }
    
}
