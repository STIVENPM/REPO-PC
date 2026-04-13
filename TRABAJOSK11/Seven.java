package TRABAJOSK11;

public class Seven {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);

        String peludo = "me miro en un espejo y decido si me voy a afeitar o no";
        System.out.println(peludo);

        boolean meAfeito = false;
        boolean tengoTiempo = true;

        if (meAfeito) {
            System.out.println("me afeito");
        } else {
            System.out.println("no me afeito");

            if (tengoTiempo) {
                System.out.println("me afeito mas tarde y quedo guapo");
            } else {
                System.out.println("no me afeito y no me voy a ver bien");
            }
        }
    }
}
