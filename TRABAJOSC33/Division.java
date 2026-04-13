package TRABAJOSC33;

public class Division {
    public static void main(String[] args) {
        int dividendo = 2;
        int divisor = 4;

        if (divisor != 0) {
            int resultado = dividendo / divisor;
            System.out.println("el resultado de la division es " + resultado);
        } else {
            System.out.println("no se puede dividir por cero");
        }
    }
    
}
