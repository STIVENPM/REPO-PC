package TRABAJOSK11;
public class One {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);
       
        boolean Prende = false;
        boolean bombilloNuevo = true;

        if (Prende) {
            System.out.println("el bombillo prende");
        } else {
            System.out.println("el bombillo no prende, Hay que cambiarlo");

            if (bombilloNuevo) {
                System.out.println("Se cambio el bombillo y ahora funciona");
            } else {
                System.out.println("no hay electricida por eso no funciona ");
            }
        }
    }
}
