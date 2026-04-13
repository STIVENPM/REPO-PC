package matrix;

import java.util.Random;
import java.util.Scanner;

public class casos {
    static Scanner sc = new Scanner(System.in);

    public static void calcular() {
        int[][] matriz = new int[3][3];
        Random aleatorio = new Random();

        System.out.print("ingrese un numero que no sea mayor a 45: ");
        int numero = sc.nextInt();
        sc.nextLine();

        if (numero < 1 || numero > 45) {
            System.out.println("numero debe estar entre 1 y 45.");
            return;
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = aleatorio.nextInt(5) + 1;
                System.out.print(matriz[i][j] + "\t");
            }
        }
       
        int[] valores = new int[9];
        int idx = 0;
        for (int[] fila : matriz) {
            for (int val : fila) {
                valores[idx++] = val;
            }
        }
       
        int suma = 0;
        System.out.println("\nNúmeros usados para alcanzar " + numero + ":");
        for (int i = 0; i < valores.length && suma < numero; i++) {
            if (suma + valores[i] <= numero) {
                System.out.print(valores[i] + " ");
                suma += valores[i];
            }
        }

        System.out.println("Suma total: " + suma);
        if (suma != numero) {
            System.out.println("No se pudo alcanzar exactamente el número con esta combinación.");
        }



       
        







}
}
