import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner SP = new Scanner(System.in); 

        String[] N = new String[10];  
        String[] SN = new String[10];  
        String[] PA = new String[10];  
        String[] SA = new String[10];
        int[] telefono = new int[10];
        int[] edad = new int[100];
        String[] RH = new String[10];
        String[] correo = new String[50];
        String[] ocupacion = new String[100];
       
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese PRIMER NOMBRE " + (i + 1)+":" );
            N[i] = SP.nextLine();

            System.out.print("Ingrese SEGUNDO NOMBRE " + (i + 1)+":" );
            SN[i] = SP.nextLine();

            System.out.print("Ingrese PRIMER APELLIDO " + (i + 1)+":" );
            PA[i] = SP.nextLine();

            System.out.print("Ingrese SEGUNDO APELLIDO " + (i + 1)+":" );
            SA[i] = SP.nextLine();

            System.out.print("ingrese telefono" + (i + 1)+":" );
            telefono[i] =  SP.nextInt();

            System.out.print("ingrese edad " + (i + 1)+":" );
            edad[i] =  SP.nextInt();

            System.out.print("ingrese RH " + (i + 1)+":" );
            RH[i] =  SP.nextLine();

            System.out.print("ingrese correo " + (i + 1)+":" );
            correo[i] = SP.nextLine();

            System.out.print("ingrese ocupacion " + (i + 1)+":" );
            ocupacion[i] = SP.nextLine();
        }

        System.out.println("tabla de usuarios");
        for (int i = 0; i < 10; i++) {
            System.out.println("Usuario " + (i + 1) + ": "
                + N[i] + " " + SN[i] + " " + PA[i] + " " + SA[i] 
                + " Tel: " + telefono[i]
                + " Edad: " + edad[i]
                + " RH: " + RH[i]
                + " Correo: " + correo[i]
                + " Ocupacion: " + ocupacion[i]);
        }
        SP.close(); 
    }
}
