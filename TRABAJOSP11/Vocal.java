package TRABAJOSP11;
public class Vocal {
    public static void vocal() {
        do {
            System.out.print("Ingrese una letra: ");
            todos.letra = todos.SP.next().charAt(0); 

            switch (Character.toLowerCase(todos.letra)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("¡Vocal ingresada! Fin del programa.");
                    return; // Termina el método
                default:
                    System.out.println("No es una vocal. Intente nuevamente.");
            }
        } while (true);
    }
}