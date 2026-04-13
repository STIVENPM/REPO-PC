package TRABAJOSC33;

public class Temperatura {
    public static void main(String[] args) {
        int temperatura = 25;

        if (temperatura < 15) {
            System.out.println("hace frio");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("normal");
        } else {
            System.out.println("calor");
        }
    }
    
}
