package TRABAJOSK11;

public class Three {
    public static void main(String[] args) {
        String Person = "stiven";
        System.out.println(Person);

        boolean muelaDuele = true;
        boolean voyAlDentista = true;

        if (!muelaDuele) {
            System.out.println("la muela no me duele si me cepillo bien");
        } else {
            System.out.println("la muela me duele, no me cepillo bien");

            if (voyAlDentista) {
                System.out.println("voy a la clinica a que me la saquen");
            } else {
                System.out.println("no voy al dentista y sigo con dolor");
            }
        }
    }
}
