package TRABAJOSP11;
public class Consonantes {
    public static void consonantes() {
        todos.votos = 0; 
        todos.consonantes = 0; 

        for (todos.contador = 1; todos.contador <= 10; todos.contador++) {
            System.out.print("Ingrese letra " + todos.contador + ": ");
            todos.letra = todos.SP.next().charAt(0);

            switch (Character.toLowerCase(todos.letra)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    todos.votos++;
                    break;
                default:
                    if (Character.isLetter(todos.letra)) {
                        todos.consonantes++;
                    }
            }
        }

        System.out.println("Vocales: " + todos.votos);
        System.out.println("Consonantes: " + todos.consonantes);
    }
}