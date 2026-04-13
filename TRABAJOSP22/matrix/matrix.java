package matrix;

import java.util.Scanner;


public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        boolean salir = false;

        do {
            System.out.println("--- matrix ---");
            System.out.println("1. Ingresar número y calcular con matriz");
            
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    casos.calcular();
                    break;
                case "2":
                   
                    break;
                case "5":
                    System.out.println("Chao");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!salir);
        sc.close();
    }
}
