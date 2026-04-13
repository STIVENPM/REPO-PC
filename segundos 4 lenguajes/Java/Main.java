package Java;
public class Main {
    public static void main(String[] args) {

            /*
         * NOTA IMPORTANTE:
         * - Las clases abstractas no se pueden instanciar directamente.
         *   Por eso en este main solo se crean objetos de clases normales.
         *
         * - En Java no existen destructores como en C++.
         *   El manejo de memoria lo realiza automáticamente el Garbage Collector.
         */

        // 1. JugadorNormal
    
        JugadorNormal jn1 = new JugadorNormal();        // sin parámetros
        JugadorNormal jn2 = new JugadorNormal("Santiago", 15);  // con parámetros
        JugadorNormal jn3 = new JugadorNormal("Mafe");         // sobrecargado
        JugadorNormal jn4 = new JugadorNormal(jn2);          // copia

    
        // 2. JugadorPro

        JugadorPro jp1 = new JugadorPro();             // sin parámetros
        JugadorPro jp2 = new JugadorPro("Luis", 30);       // con parámetros
        JugadorPro jp3 = new JugadorPro(50);         // sobrecargado
        JugadorPro jp4 = new JugadorPro(jp2);          // copia

        // 3. JugadorVIP
        
        JugadorVIP jv1 = new JugadorVIP();
        JugadorVIP jv2 = new JugadorVIP("Sofia", 100);
        JugadorVIP jv3 = new JugadorVIP("Marta");
        JugadorVIP jv4 = new JugadorVIP(jv2);

        // 4. JugadorNovato
        
        JugadorNovato jno1 = new JugadorNovato();
        JugadorNovato jno2 = new JugadorNovato("Pepito", 2);
        JugadorNovato jno3 = new JugadorNovato(5);
        JugadorNovato jno4 = new JugadorNovato(jno2);

        // 5. JugadorExperto
    
        JugadorExperto je1 = new JugadorExperto();
        JugadorExperto je2 = new JugadorExperto("Raúl", 40);
        JugadorExperto je3 = new JugadorExperto("Andrea");
        JugadorExperto je4 = new JugadorExperto(je2);

        // MOSTRAR
        
        System.out.println("Instancias creadas de los jugadores:");
        System.out.println("JugadorNormal: " + jn2.nombre + " Nivel " + jn2.nivel);
        System.out.println("JugadorPro: " + jp2.nombre + " Nivel " + jp2.nivel);
        System.out.println("JugadorVIP: " + jv2.nombre + " Nivel " + jv2.nivel);
        System.out.println("JugadorNovato: " + jno2.nombre + " Nivel " + jno2.nivel);
        System.out.println("JugadorExperto: " + je2.nombre + " Nivel " + je2.nivel);
    }
}

