package TRABAJOSC33;

public class Contraseñas {
    public static void main(String[] args) {
        String admin = "admin";
        String contraseñaA = "1234";

        String usuario = "admin"; 
        String contraseñaU = "1234"; 
        if (usuario.equals(admin) && contraseñaU.equals(contraseñaA)) {
            System.out.println("Acceso concedido");
        } else if (!usuario.equals(admin) || !contraseñaU.equals(contraseñaA)) {
            System.out.println("Acceso denegado");
        } else {
           
            System.out.println("Error inesperado en la autenticacion");
        }
    }
    
}
