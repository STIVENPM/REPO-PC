import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. registrar libro");
            System.out.println("2. filtrar libro por titulo");
            System.out.println("3. registrar lector");
            System.out.println("4. registrar prestamo");
            System.out.println("5. listar prestamos");
            System.out.println("6. devolver libro");
            System.out.println("0. salir");
            System.out.print("seleccione una opcion: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1: registrarLibro();
                break;
                case 2: buscarLibroPorTitulo();
                break;
                case 3: registrarLector();
                break;
                case 4: registrarPrestamo();
                break;
                case 5: listarPrestamos();
                break;
                case 6: devolverLibro();
                break;
                case 0: System.out.println("saliendo del sistema...");
                break;
                default: System.out.println("opcion invalida.");
            }
        } while (opcion != 0);
    }

    static void registrarLibro() {
        System.out.println("isbn: ");
        String isbn = scan.nextLine();
        System.out.println("titulo: ");
        String titulo = scan.nextLine();
        System.out.println("autor: ");
        String autor = scan.nextLine();
        System.out.println("genero: ");
        String genero = scan.nextLine();
        System.out.println("fecha publicacion (yyyy-mm-dd): ");
        String fecha = scan.nextLine();
        System.out.println(biblioteca.registrarLibro(isbn, titulo, autor, genero, fecha));
    }

    static void buscarLibroPorTitulo() {
        System.out.println("titulo a buscar: ");
        String titulo = scan.nextLine();
        Libro libro = biblioteca.buscarPorTitulo(titulo);
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("libro no encontrado.");
        }
    }

    static void registrarLector() {
        System.out.println("id lector: ");
        String id = scan.nextLine();
        System.out.println("nombre lector: ");
        String nombre = scan.nextLine();
        System.out.println("correo lector: ");
        String correo = scan.nextLine();
        System.out.println(biblioteca.registrarLector(id, nombre, correo));
    }

    static void registrarPrestamo() {
        System.out.println("id del lector: ");
        String idLector = scan.nextLine();
        System.out.println("titulo del libro: ");
        String tituloLibro = scan.nextLine();
        System.out.println(biblioteca.registrarPrestamo(idLector, tituloLibro));
    }

    static void listarPrestamos() {
        biblioteca.listarPrestamos();
    }

    static void devolverLibro() {
        System.out.println("titulo del libro a devolver: ");
        String titulo = scan.nextLine();
        System.out.println(biblioteca.devolverLibro(titulo));
    }
}