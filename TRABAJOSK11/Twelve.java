package TRABAJOSK11;

public class Twelve {
    public static void main(String[] args) {
        
    
    String persona = "Stiven";
        System.out.println("Persona: " + persona);

        boolean noArmar = true;
        boolean quiereArmarla = false;

        if (noArmar) {
            System.out.println("Hay una cama por armar");

            if (quiereArmarla) {
                System.out.println("Stiven decide armar la cama");
            } else {
                System.out.println("Stiven no quiere armar la cama ahora");
            }

        } else {
            System.out.println("No hay ninguna cama para armar");
        }
    }

    
}
