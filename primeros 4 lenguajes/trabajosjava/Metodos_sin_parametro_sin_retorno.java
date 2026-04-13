public class Metodos_sin_parametro_sin_retorno {
    void suma(){
        int a = 5;
        int b = 8;
        int resultado = a + b;
        System.out.println("la suma es " + resultado);
    }
    void resta(){
        int a = 8;
        int b = 39;
        int resultado = a - b;
        System.out.println("la resta es " + resultado);
    }
    void multiplicacion(){
        int a =12;
        int b = 23;
        int resultado = a * b;
        System.out.println("la multiplicacion es " + resultado);
    }
    void divicion(){
        int a = 54;
        int b = 52;
        double resultado = a / b;
        System.out.println("la divicion es " + resultado);
    }
    public static void main (String[]args){
        Metodos_sin_parametro_sin_retorno m1 = new Metodos_sin_parametro_sin_retorno();

        m1.suma();

        m1.resta();

        m1.multiplicacion();

        m1.divicion();


    }
    
}
