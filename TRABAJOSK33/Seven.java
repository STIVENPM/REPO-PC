package TRABAJOSK33;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa el radio de la circunferencia:");
double RC = SP.nextDouble();

double areaC = Math.PI * RC * RC;

System.out.println("el area de la circunferencia es: " + areaC);



        SP.close();
    }
    
}
