package banco;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String opcion;
        boolean salir = false;

        do{
            System.out.println("1. nombre banco ");
            System.out.println("2. sucursales");
            System.out.println("3. reporte general");
            System.out.println("4. reporte productos");
            System.out.println("5. campañas de sucursales ");
            System.out.println("6. salir");
            System.out.println("7. reiniciar");

        
            opcion = sc.nextLine();



            switch (opcion) {
                    case "1":
                    Pais.nombre();
                    
                    break;

                    case "2":
                    Pais.sucursales();
                    

                    break;
                    case "3":
                    Pais.ReporteGeneral();
                
                    break;
                    case "4":
                    Pais.reporteProductos();
                    
                    break;
                    case "5":
                    Pais.seleccionSucursal();
                    break;


                    case "6":
                    salir = true;
                    break;

                    default:
                    System.out.println("Opcion no valida");
            }
        }while (!salir);
        sc.close();


    }
}
