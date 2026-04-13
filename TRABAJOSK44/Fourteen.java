package TRABAJOSK44;
import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.print("ingresa soles ");
        double soles = SP.nextDouble();

        double pesos = 1075.27; 
        double dolares = 0.27;    
        double bolivares = 9.6;   
        double pesetas = 44.36;   
        double francos = 0.24;   

        double Pesos = soles * pesos;
        double Dolares = soles * dolares;
        double Bolivares = soles * bolivares;
        double Pesetas = soles * pesetas;
        double Francos = soles * francos;

        System.out.println("pesos colombianos: " + Pesos);
        System.out.println("dolares: " + Dolares);
        System.out.println("bolivares: " + Bolivares);
        System.out.println("pesetas: " + Pesetas);
        System.out.println("francos: " + Francos);

        SP.close();
    }
    
}
