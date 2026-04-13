package TRABAJOSC33;

public class Horas {
    public static void main(String[] args) {
        
    
    int hora = 17; 

    if (hora >= 6 && hora <= 12) {
        System.out.println("mañana");
    } else if (hora >= 13 && hora <= 18) {
        System.out.println("tarde");
    } else if (hora >= 19 && hora <= 23) {
        System.out.println("noche");
    } else if (hora >= 0 && hora <= 5) {
        System.out.println("madrugada");
    } else {
        System.out.println("hora fuera de rango");
    }
}

}
