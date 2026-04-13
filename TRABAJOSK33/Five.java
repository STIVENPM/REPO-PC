package TRABAJOSK33;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa la base del triangulo:");
double BT = SP.nextDouble();

System.out.println("ingresa la altura del triangulo:");
double AT = SP.nextDouble();

double areaT = (BT * AT) / 2;

System.out.println("el area del triangulo es: " + areaT);



SP.close();
    }
    
}
