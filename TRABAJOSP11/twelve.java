package TRABAJOSP11;

public class Twelve  {
    public static todos Todos = new todos();

    public static void twelve() {
        int NM;
        if (Todos.A > Todos.B && Todos.A > Todos.C) {
            System.out.println("el primer numero es el mayor");
            NM = Todos.A;
            System.out.println("numero: " + NM);
        } else if (Todos.B > Todos.C) {
            System.out.println("el segundo numero es el mayor");
            NM = Todos.B;
            System.out.println("numero: " + NM);
        } else {
            System.out.println("el tercer numero es el mayor");
            NM = Todos.C;
            System.out.println("numero: " + NM);
        }
    }
}