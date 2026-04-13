package TRABAJOSP11;

public class Eleven {
    public static todos Todos = new todos();

    public static void eleven() {
        int PT = Todos.A + Todos.B + Todos.C + Todos.D + Todos.E + Todos.F;
        System.out.println("produccion total " + PT);

        int PP = PT / 6;
        System.out.println("promedio de produccion: " + PP);
        if (PP >= 100) {
            System.out.println("recibira incentivos");
        } else {
            System.out.println("no recibira incentivos");
        }
    }
}