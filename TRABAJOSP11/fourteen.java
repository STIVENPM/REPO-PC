package TRABAJOSP11;

public class Fourteen  {
    public static todos Todos = new todos();

    public static void fourteen() {
        String ER = "";

        switch (Todos.A) {
            case 1:
                ER = " I ";
                break;
            case 2:
                ER = " II";
                break;
            case 3:
                ER = " III";
                break;
            case 4:
                ER = " IV";
                break;
            case 5:
                ER = " V";
                break;
            case 6:
                ER = " VI";
                break;
            case 7:
                ER = " VII ";
                break;
            case 8:
                ER = " VIII ";
                break;
            case 9:
                ER = " IX ";
                break;
            case 10:
                ER = " X ";
                break;
        }
        System.out.println("el numero " + Todos.A + " en romano es " + ER + "");
    }
}