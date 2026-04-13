package psena; 

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        // Crea un objeto Scanner para poder leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Variable para almacenar la opción ingresada por el usuario
        String opcion;
        
        // Variable de control para salir del bucle
        boolean salir = false;

        
        do {
           
            System.out.println("opciones ");
            System.out.println("1. elige el numero de la region y el centro y sede");
            System.out.println("2. asignacion de hambientes a sede");
            System.out.println("3. asignacion de aprendices a el ambiente y el centro y sede");
            System.out.println("4. instructor asisgnado a linea ");
            System.out.println("5. asignar horario a instructor ");
            System.out.println("6. asignar cordinador a un instructor ");
            System.out.println("7. descripcion de los ambientes ");
            System.out.println("8. asignacion de horarios a aprendices");
            System.out.println("9. asignacion de intructor a ambiente");
            System.out.println("0. Salir");
            
            // Lee la opción ingresada por el usuario
            opcion = sc.nextLine();

          
            switch (opcion) {
                case "1":
                    Salida.nombre(); 
                    break;

                case "2":
                    Salida.ambientes(); 
                    break;

                case "3":
                    Salida.asignacionA();  
                    break;

                case "4":
                    Salida.instructorL();  
                    break;

                case "5":
                    Salida.horarioI();  
                    break;

                case "6":
                    Salida.cordinadorI();  
                    break;

                case "7":
                    Salida.descripcionA(); 
                    break;

                case "8":
                    Salida.horarioA();  
                    break;

                case "9":
                    Salida.instructorA();  
                    break;
            
                default:
                    
                    System.out.println("Opcion no valida");
            }

        // El bucle sigue mientras 'salir' sea false
        } while (!salir);

        // Cierra el scanner para liberar recursos
        sc.close();
    }
}

