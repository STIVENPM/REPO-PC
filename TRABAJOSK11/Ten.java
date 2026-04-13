package TRABAJOSK11;

public class Ten {
    public static void main(String[] args) {
        String persona = "Stiven";
        System.out.println("Persona: " + persona);

        boolean tieneTarea = false;
        boolean quiereHacerla = false;

        if (tieneTarea) {
            System.out.println("Tiene una tarea pendiente.");

            if (quiereHacerla) {
                System.out.println("La hace de inmediato.");
            } else {
                System.out.println("Decide no hacerla y prefiere descansar.");
            }

        } else {
            System.out.println("No tiene tareas por hacer.");
        }
    }
}
