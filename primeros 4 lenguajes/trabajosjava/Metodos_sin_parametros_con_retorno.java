public class Metodos_sin_parametros_con_retorno {
    String Saludo(){
        return "hola";
    }
    int edad(){
        return 18;
    }
    String vocal(){
        return "A";
    }
    String nombre(){
        return "stiven";
    }
    public static void main(String[]args){
        Metodos_sin_parametros_con_retorno s1 = new Metodos_sin_parametros_con_retorno();

        String texto = s1.Saludo();
        System.out.println(texto);

        int textoo = s1.edad();
        System.out.println(textoo);

        String textooo = s1.vocal();
        System.out.println(textooo);

        String textoooo = s1.nombre();
        System.out.println(textoooo);
    }








}
