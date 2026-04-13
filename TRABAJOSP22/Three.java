import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in); 

        int[] numeros1 = new int[10]; 
        int[] numeros2 = new int[10]; 
        int pos1, pos2;
        double R = 0;
        String OP;

        
        for (int x = 0; x < 10; x++) {
            System.out.print("ingrese el numero " + (x + 1) + " del primer grupo: ");
            numeros1[x] = SP.nextInt();
        }

       
        for (int y = 0; y < 10; y++) {
            System.out.print("ingrese el numero " + (y + 1) + " del segundo grupo: ");
            numeros2[y] = SP.nextInt();
        }

       
        System.out.print("elige la primera posicion ");
        pos1 = SP.nextInt();

        System.out.print("elige la segunda posicion ");
        pos2 = SP.nextInt();

        int X = numeros1[pos1];
        int Y = numeros2[pos2];

        System.out.println("numeros elegidos: " + X + " y " + Y);

        
        System.out.print("elige una operacion (+, -, *, ^): ");
        SP.nextLine(); 
        OP = SP.nextLine();

        switch (OP) {
            case "+":
                R = X + Y;
                break;
            case "-":
                R = X - Y;
                break;
            case "*":
                R = X * Y;
                break;
            case "^":
                R = Math.pow(X, Y);
                break;
            default:
                System.out.println("no valida ");
                SP.close();
                return;
        }

        System.out.println("resultado: " + R);
        SP.close(); 
    }
}