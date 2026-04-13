package TRABAJOSK44;
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.print("ingresa bolivares ");
        double bolivares = SP.nextDouble();

        double pesos = 111.11;     
        double dolares = 0.028;    
        double soles = 0.104;     
        double pesetas = 4.74;    
        double francos = 0.025;    

        double Pesos = bolivares * pesos;
        double Dolares = bolivares * dolares;
        double Soles = bolivares * soles;
        double Pesetas = bolivares * pesetas;
        double Francos = bolivares * francos;

        System.out.println("pesos colombianos: " + Pesos);
        System.out.println("dolares: " + Dolares);
        System.out.println("soles: " + Soles);
        System.out.println("pesetas: " + Pesetas);
        System.out.println("francos: " + Francos);

        SP.close();
    }
    
}
