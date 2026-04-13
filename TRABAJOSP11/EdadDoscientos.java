package TRABAJOSP11;
public class EdadDoscientos {
    public static void docientos() {
        todos.edades = 0; 
        todos.votos = 0;  

        for (todos.contador = 1; todos.contador <= 200; todos.contador++) {
            System.out.print("Ingrese edad " + todos.contador + ": ");
            todos.A = todos.SP.nextInt(); 

            if (todos.A < 18) {
                todos.votos++; 
            } else {
                todos.edades++; 
            }
        }

        System.out.println("Mayores de edad: " + todos.edades);
        System.out.println("Menores de edad: " + todos.votos);
    }
}