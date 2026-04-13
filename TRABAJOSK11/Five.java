package TRABAJOSK11;

public class Five {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);

        String veiculo = "miro si el carro esta sucio";
        System.out.println(veiculo);

        boolean carroLimpio = false;
        boolean tengoTiempo = true;

        if (carroLimpio) {
            System.out.println("no lo tengo que lavar");
        } else {
            System.out.println("el carro esta sucio");

            if (tengoTiempo) {
                System.out.println("lavo el carro y salgo con el carro limpio");
            } else {
                System.out.println("no lo lavo y salgo con el carro sucio");
            }
        }
    }
}
