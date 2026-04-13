package TRABAJOSK44;
import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.print("ingrese punto P1 ");
        double P1 = SP.nextDouble();

        System.out.print("ingrese punto D1 ");
        double D1 = SP.nextDouble();

        System.out.print("ingrese punto P2 ");
        double P2 = SP.nextDouble();

        System.out.print("ingrese punto D2 ");
        double D2 = SP.nextDouble();

        double distancia = Math.sqrt(Math.pow((P2 - P1), 2) + Math.pow((D2 - D1), 2));
        System.out.println("la distancia entre los puntos es " + distancia);
       
        SP.close();
    }
    
}
