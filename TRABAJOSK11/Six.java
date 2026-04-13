package TRABAJOSK11;

public class Six {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);

        String caja = "busco una caja";
        System.out.println(caja);

        boolean construyoCaja = true;
        boolean materialesDisponibles = true;

        if (construyoCaja) {
            System.out.println("construyo la caja");
        } else {
            System.out.println("no construyo la caja");

            if (materialesDisponibles) {
                System.out.println("puedo construirla despues");
            } else {
                System.out.println("no voy a tener una caja construida");
            }
        }
    }
}
