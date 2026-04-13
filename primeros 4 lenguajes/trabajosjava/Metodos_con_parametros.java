public class Metodos_con_parametros {
        // Método con parámetros
    void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }
        public static void main(String[] args) {
        // Crear objetos de cada clase
        Metodos_con_parametros s1 = new Metodos_con_parametros();
        s1.sumar(5, 3);

        Resta r1 = new Resta();
        r1.resta(10, 4);

        Multiplicacion m1 = new Multiplicacion();
        m1.multiplicacion(3, 9);

        Division d1 = new Division();
        d1.division(4, 1);

        Calculadora c1 = new Calculadora();
        c1.calculadora(5, 4);
    }
}
    class Resta{
        void resta(int a, int b){
            int resultado = a - b;
            System.out.println("la resta es " + resultado);
        }
    }
    class Multiplicacion{
        void multiplicacion(int a, int b){
            int resultado = a * b;
            System.out.println("la multiplicacion es " + resultado);
        }
    }
    class Division{
        void division(int a, int b){
            int resultado = a / b;
            System.out.println("la division es " + resultado);
        }
    }
    class Calculadora{
        void calculadora(int a, int b){
            int resultado = (a + b) + a;
            System.out.println("el calculo es " + resultado);
        }
    }
    

    

