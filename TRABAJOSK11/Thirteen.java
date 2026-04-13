package TRABAJOSK11;

public class Thirteen {
    public static void main(String[] args) {
        String persona = "Stiven";
        System.out.println("Persona: " + persona);

        boolean PcParaConectar = true;
        boolean quiereConectarla = false;

        if (PcParaConectar) {
            System.out.println("Hay una PC lista para conectar.");

            if (quiereConectarla) {
                System.out.println("Stiven conecta la PC y la enciende.");
            } else {
                System.out.println("Stiven decide no conectar la PC por ahora.");
            }

        } else {
            System.out.println("No hay ninguna PC para conectar.");
        }
    }
    
}
