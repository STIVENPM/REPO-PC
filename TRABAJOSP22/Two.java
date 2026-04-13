import java.util.Scanner;
import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in); 
        String[] nombres = new String[10]; 

        for (int x = 0; x < 10; x++) {
            System.out.print("Ingrese nombre " + (x + 1) + ": ");
            nombres[x] = SP.nextLine();
        }

        Arrays.sort(nombres); 

        System.out.println("nombres ordenados");
        for (int y = 0; y < 10; y++) {
            System.out.println(nombres[y]);
        }

        SP.close(); 
    }
}

