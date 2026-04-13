package TRABAJOSP11;

public class Sixteen {
    public static todos Todos = new todos();

    public static void sixteen() {
        String V = "";

        switch (Todos.A) {
            case 1:
                V = "A";
                break;
            case 2:
                V = "B";
                break;
            case 3:
                V = "C";
                break;
            case 4:
                V = "D";
                break;
            case 5:
                V = "E";
                break;
            case 6:
                V = "F";
                break;
            case 7:
                V = "G";
                break;
            case 8:
                V = "H";
                break;
            case 9:
                V = "I";
                break;
            case 10:
                V = "J";
                break;
            default:
                V = "numero fuera de rango";
                break;
        }
        System.out.println("el numero ingrado es: " + Todos.A + " y vale " + V);
    }
}