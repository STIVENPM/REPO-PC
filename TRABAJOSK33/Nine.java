package TRABAJOSK33;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa la diagonal mayor del rombo:");
double DMayor = SP.nextDouble();

System.out.println("ingresa la diagonal menor del rombo:");
double DMenor = SP.nextDouble();

double areaR = (DMayor * DMenor) / 2;

System.out.println("el area del rombo es: " + areaR);




SP.close();
    }
    
}
