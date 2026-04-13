package TRABAJOSK33;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa el lado del cuadrado:");
double LC = SP.nextDouble();

double areaC = LC * LC;

System.out.println("el area del cuadrado es: " + areaC);


        SP.close();
    }
}
