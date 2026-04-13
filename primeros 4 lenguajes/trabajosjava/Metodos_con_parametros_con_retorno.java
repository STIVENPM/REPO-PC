public class Metodos_con_parametros_con_retorno {
    

    // Método con retorno
        int multiplicar(int x, int y) {
        return x * y; // devuelve el resultado
    }
        int Division(int x, int y){
        return x / y;
    }
        int Suma(int x, int y){
        return x + y;
    }   
        int Resta(int x, int y){
        return x - y; 
        }

    public static void main(String[] args) {
        Metodos_con_parametros_con_retorno calc = new Metodos_con_parametros_con_retorno();

        int resultado = calc.multiplicar(4, 2);
        System.out.println("La multiplicacion es: " + resultado); 

        int resultadoo = calc.Division(40, 10);
        System.out.println("la divicion es: " + resultadoo);

        int resultadooo = calc.Suma(5, 5);
        System.out.println("la suma es " + resultadooo);

        int resultadoooo = calc.Resta(7, 3);
        System.out.println("la resta es " + resultadoooo);
    }
}


    
