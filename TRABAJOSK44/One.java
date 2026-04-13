package TRABAJOSK44;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in);
        System.out.println("ingresa la base del cubo:");
double baseC = SP.nextDouble();

System.out.println("ingresa la profundidad del cubo:");
double profundidadC = SP.nextDouble();

System.out.println("ingresa la altura del cubo:");
double alturaC = SP.nextDouble();

double volumenC = baseC * profundidadC * alturaC;

System.out.println("el volumen del cubo es: " + volumenC);
SP.close();
    }
    
}
