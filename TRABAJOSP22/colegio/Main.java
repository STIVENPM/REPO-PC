package colegio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String opcion;
        boolean salir = false;

        do{
            System.out.println("1. nombre del coleguio q va a crear");
            System.out.println("2. crea un max de 11 aulas, con un maximo de 11 grados y un maximo de 11 salones");
            System.out.println("3. reporte ");
            System.out.println("4. salir");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();



            switch (opcion) {
                    case "1":
                    Salida.nombre();
                    break;

                    case "2":
                    Salida.Aula();

                    break;
                    case "3":
                    Salida.Reporte();
                    break;

                    case "4":
                    salir = true;
                    break;

                    default:
                    System.out.println("Opcion no valida");
            }
        }while (!salir);
        sc.close();

    }
}
