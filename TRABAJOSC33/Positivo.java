package TRABAJOSC33;

public class Positivo {
    public static void main(String[] args) {
        double totalCompra = 120.0;
        double descuentoPorcentaje = 0.10; 

        if (totalCompra > 100) {
            double descuento = totalCompra * descuentoPorcentaje;
            double totalConDescuento = totalCompra - descuento;
            System.out.println("Total de la compra: " + totalCompra);
            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Total con descuento: " + totalConDescuento);
        } else {
            System.out.println("Total de la compra: " + totalCompra);
            System.out.println("No aplica descuento");
        }
    }
    
}
