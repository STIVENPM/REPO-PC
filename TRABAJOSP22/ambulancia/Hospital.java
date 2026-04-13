package ambulancia;

import java.util.Scanner;

public class Hospital {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
         boolean salir = false;

        
        do {
            System.out.println("--- HOSPITAL ---");
            System.out.println("1. ingresar datos de el conducto ");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Asignar paciente a veiculo con conductor ");
            System.out.println("4. Asiggnacion de hospital a conductor ");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    Registrar.Conductor();
                    break;

                case "2":
                    Registrar.MostrarDatos();
                    break;
                    
                case "3":
                    Registrar.Paciente();
                    break;

                      case "4":
                    Registrar.hospitales();
                    break;
                
                
                case "5":
                    System.out.println("chao");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida"); 
            }
        } while (!salir);
        sc.close();
    }
}