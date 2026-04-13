package TRABAJOSP11;

public class Three {
    public static todos Todos = new todos();

    public static void three() {
        int PRC = Todos.A * 4;
        int PRI = Todos.B * -1;
        int PF = PRC + PRI;

        if (PF < 0) {
            System.out.println("Puntaje final menor a 0");
        }
        System.out.println("Puntaje final: " + PF);
    }
}
