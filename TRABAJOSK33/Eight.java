package TRABAJOSK33;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa la base mayor del trapecio:");
double BMayor = SP.nextDouble();

System.out.println("ingresa la base menor del trapecio:");
double BMenor = SP.nextDouble();

System.out.println("ingresa la altura del trapecio:");
double alturaTrapecio = SP.nextDouble();

double areaT = ((BMayor + BMenor) / 2) * alturaTrapecio;

System.out.println("el area del trapecio es: " + areaT);









        SP.close();
    }
    
}
