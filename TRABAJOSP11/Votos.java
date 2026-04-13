package TRABAJOSP11;
public class Votos {
    public static void votos() {
        todos.PF = 0; 
        todos.PRI = 0; 
        todos.PRC = 0; 
        todos.votos = 0; 

        for (todos.contador = 1; todos.contador <= 10; todos.contador++) {
            System.out.print("Ingrese voto " + todos.contador + " (1, 2, 3): ");
            todos.A = todos.SP.nextInt(); 

            switch (todos.A) {
                case 1: todos.PF++; break;
                case 2: todos.PRI++; break;
                case 3: todos.PRC++; break;
                default: todos.votos++; break;
            }
        }

        
        if (todos.PF > todos.PRI && todos.PF > todos.PRC && todos.PF > todos.votos) {
            System.out.println("Ganador: Candidato 1");
        } else if (todos.PRI > todos.PF && todos.PRI > todos.PRC && todos.PRI > todos.votos) {
            System.out.println("Ganador: Candidato 2");
        } else if (todos.PRC > todos.PF && todos.PRC > todos.PRI && todos.PRC > todos.votos) {
            System.out.println("Ganador: Candidato 3");
        } else {
            System.out.println("No hay ganador claro.");
        }
    }
}