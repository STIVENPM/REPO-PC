package TRABAJOSK44;
import java.util.Scanner;

public class sixteen {
    
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);

        System.out.print("ingrese la base ");
        double base = SP.nextDouble();

        System.out.print("ingrese la altura ");
        double altura = SP.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("el area del triangulo es " + area);

        SP.close();
    }
}
