package TRABAJOSK11;

public class Eleven {
    public static void main(String[] args) {
        String persona = "Stiven";
        System.out.println("Persona: " + persona);

        boolean hayViaje = false;
        boolean quiereIr = true;

        if (hayViaje) {
            System.out.println("Hay un viaje programado.");

            if (quiereIr) {
                System.out.println("Stiven hace las maletas y se va de viaje.");
            } else {
                System.out.println("Stiven decide no ir al viaje.");
            }

        } else {
            System.out.println("No hay ningún viaje planeado.");
        }
    }

    
}
