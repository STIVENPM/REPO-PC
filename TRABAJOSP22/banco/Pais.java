package banco;
import java.util.Scanner;
import java.util.Random;

public class Pais {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    
    static String nombreBanco = "";
    static int totalSucursales = 0;
    static String[] productosBanco = {
        "Cuenta de ahorros",
        "Cuenta corriente",
        "Tarjeta de crédito",
        "Tarjeta débito",
        "Crédito hipotecario",
        "Crédito de libre inversión",
        "CDT",
        "Crédito educativo",
        "Seguro de vida",
        "Seguro para vehículo"
    };

    static int[] clientesSucursal = new int[5];
    static String[] productosSucursal = new String[5];

    public static void nombre() {
        System.out.print("Ingrese nombre del banco: ");
        nombreBanco = sc.nextLine();
        System.out.println("Bienvenido al banco " + nombreBanco);
    }

    public static void sucursales() {
        System.out.print("Ingrese el número de sucursales (máximo 5): ");
        totalSucursales = sc.nextInt();

        if (totalSucursales > 5) {
            System.out.println("Error: no puede crear más de 5 sucursales");
            return;
        }

        System.out.println("--- Distribución de sucursales ---");
        for (int i = 0; i < totalSucursales; i++) {
            int clientes = random.nextInt(9) + 1;
            String producto = productosBanco[random.nextInt(productosBanco.length)];

            clientesSucursal[i] = clientes;
            productosSucursal[i] = producto;

            System.out.println("Sucursal " + (i + 1) + " - Clientes: " + clientes + " - Producto: " + producto);
        }
    }

    public static void ReporteGeneral() {
        System.out.println("--- Reporte general ---");
        System.out.println("Nombre del banco: " + nombreBanco);
        System.out.println("Total de sucursales: " + totalSucursales);

        for (int i = 0; i < totalSucursales; i++) {
            System.out.println("Sucursal " + (i + 1) + " - Clientes: " + clientesSucursal[i] + " - Producto: " + productosSucursal[i]);
        }
    }
    public static void reporteProductos(){
        String[] productosBanco = {
        "Cuenta de ahorros", "Cuenta corriente", "Tarjeta de crédito", "Tarjeta débito", "Seguro de vida",
        "Crédito hipotecario", "Crédito de libre inversión", "CDT", "Crédito educativo", "Seguro para vehículo"
        };

        System.out.println("Lista de productos disponibles:");
            for (int i = 0; i < productosBanco.length; i++) {
            System.out.println((i + 1) + ". " + productosBanco[i]);
        }
    }
    public static void seleccionSucursal() {
    String[] campañaBanco = {
        "Apertura de cuenta de ahorros con bono de bienvenida",
        "Cuenta corriente sin cuota de manejo por 6 meses",
        "Tarjeta de crédito con 0% interés por 3 meses",
        "Tarjeta débito con cashback del 5% en supermercados",
        "Seguro de vida con cobertura ampliada sin costo adicional",
        "Crédito hipotecario con tasa fija del 11%",
        "Crédito de libre inversión aprobado en 24 horas",
        "CDT con tasa preferencial del 12%",
        "Crédito educativo sin interés durante el primer año",
        "Seguro para vehículo con descuento del 15% en SOAT"
    };
    System.out.println("----sucursales y sus campañas-----");
    
    for (int i = 0; i < totalSucursales; i++) {
        int campaña = random.nextInt(campañaBanco.length); 
        String campañaSeleccionada = campañaBanco[campaña];
        System.out.println("Sucursal " + (i + 1) + " - Campaña: " + campañaSeleccionada);
    }
  }
}








    
