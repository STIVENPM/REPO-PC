package TRABAJOSP11;

public class Teen {
    public static todos Todos = new todos();

    public static void teen() {
        if (Todos.A > Todos.B) {
            System.out.println("La primera edad es mayor");
            System.out.println("Por: " + (Todos.A - Todos.B) + " años");
        } else if (Todos.B > Todos.A) {
            System.out.println("La segunda edad es mayor");
            System.out.println("Por: " + (Todos.B - Todos.A) + " años");
        } else {
            System.out.println("Ambas edades son iguales");
        }
    }
}
