package TRABAJOSK11;

public class Four {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);

        String casa = "salgo de la casa";
        System.out.println(casa);

        boolean voyEnMoto = false;
        boolean voyCaminando = true;

        if (voyEnMoto) {
            System.out.println("llego mas ligero");
        } else {
            System.out.println("madrugo mas para llegar temprano caminando");

            if (voyCaminando) {
                System.out.println("mejoro mi fisico");
            } else {
                System.out.println("llego cansado");
            }
        }
    }
}
