import java.util.Scanner;
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in); 
        int[] numeros = new int[10]; 

        for (int x = 0; x < 10; x++) {
            System.out.print("Ingrese valor " + (x + 1) + ": ");
            numeros[x] = SP.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Valores ordenados:");
        for (int y = 0; y < 10; y++) {
            System.out.println(numeros[y]);
        }

        SP.close(); 
    }
}
