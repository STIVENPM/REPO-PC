package TRABAJOSK44; 
import java.util.Scanner;

public class twelve {
    public static void main(String[]args){
        Scanner SP = new Scanner(System.in);  

        System.out.print("ingresa dolares ");
        double dolares = SP.nextDouble();

        double pesos = 4000;      
        double bolivares = 36;       
        double soles= 3.75;   
        double pesetas = 166.386;   
        double francos = 0.91; 

        double Pesos = dolares * pesos;
        double Bolivares = dolares * bolivares;
        double Soles = dolares * soles;
        double Pesetas = dolares * pesetas;
        double Francos = dolares * francos;

        System.out.println("pesos colombianos: " + Pesos);
        System.out.println("bolivares: " + Bolivares);
        System.out.println("soles: " + Soles);
        System.out.println("pesetas: " + Pesetas);
        System.out.println("francos: " + Francos);

        SP.close();
    }
}

        






