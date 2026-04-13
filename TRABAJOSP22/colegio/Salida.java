package colegio;
import java.util.Scanner;
import java.util.Random;

public class Salida {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static int totalAulas = 0;
    static int totalAlumnos = 0;

    static String nombreColegio = "";
    static String totalGrados = "";

    public static void nombre() {
        System.out.print("Ingrese nombre del colegio: ");
        nombreColegio = sc.nextLine();
        System.out.println("Bienvenido al colegio " + nombreColegio);
    }

    public static void Aula() {
        System.out.print("Ingrese el número de aulas (máximo 11): ");
        int aulas = sc.nextInt();
        

        

        String[] grados = {
            "Primero", "Segundo", "Tercero", "Cuarto", "Quinto",
            "Sexto", "Septimo", "Octavo", "Noveno", "Décimo", "Once"
        };

        totalAulas = aulas;
        totalAlumnos = 0;
        totalGrados = "";

        System.out.println("--- Distribución de aulas ---");
        for (int i = 1; i <= aulas; i++) {
            String grado = grados [random.nextInt(grados.length)];
            int alumnos = random.nextInt(25) + 1;

            totalAlumnos = alumnos;
            totalGrados = grado + " ";

            System.out.println("Aula " + i + " - Grado: " + grado + " - Alumnos: " + alumnos);
        }
    }

    public static void Reporte() {
        System.out.println("--- Reporte general ---");
        System.out.println("Colegio: " + nombreColegio);
        System.out.println("Total de aulas: " + totalAulas);
        System.out.println("Total de alumnos: " + totalAlumnos);
        System.out.println("Grados asignados: " + totalGrados.trim());
    }
}
