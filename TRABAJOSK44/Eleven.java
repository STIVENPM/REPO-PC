package TRABAJOSK44;
import java.util.Scanner;

public class Eleven {
    public static void main(String[]args){
        Scanner SP = new Scanner(System.in);

        System.out.print("ingrese pesos colombianos ");
        double pesos = SP.nextDouble();

        double dolares = 0.00025;    
        double bolivar = 0.009;    
        double soles = 0.00093;    
        double pesetas = 0.042;     
        double francos = 0.00022;   

        double Dolares = pesos * dolares;
        double Bolivares = pesos * bolivar;
        double Soles = pesos * soles;
        double Pesetas = pesos * pesetas;
        double Francos = pesos * francos;

        System.out.println("dolares " + Dolares);
        System.out.println("bolivares " + Bolivares);
        System.out.println("soles " + Soles);
        System.out.println("pesetas " + Pesetas);
        System.out.println("francos " + Francos);

SP.close();
    }
    
}
