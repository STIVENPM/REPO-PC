package TRABAJOSK11;

public class Two {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);

        boolean camisetaLimpia = false;
        boolean tengoCamisetaNueva = true;

        if (camisetaLimpia) {
            System.out.println("la camiseta esta limpia y huele bien");
        } else {
            System.out.println("la camiseta esta sucia y huele feo");

            if (tengoCamisetaNueva) {
                System.out.println("me cambio la camiseta y ya huele bien");
            } else {
                System.out.println("no hay camisetas limpias, me aplico locion");
            }
        }
    }
}
