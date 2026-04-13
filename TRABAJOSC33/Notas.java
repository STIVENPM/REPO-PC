package TRABAJOSC33;

public class Notas {
    public static void main(String[] args) {
        int nota = 15;

        if (nota < 10) {
            System.out.println("Desaprobado");
        } else if (nota >= 10 && nota <= 13) {
            System.out.println("Regular");
        } else if (nota >= 14 && nota <= 17) {
            System.out.println("Bueno");
        } else if (nota >= 18 && nota <= 20) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota fuera de rango");
        }
    }
    
}
