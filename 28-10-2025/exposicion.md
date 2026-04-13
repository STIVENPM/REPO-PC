 # Tema de exposición

“Abstracción, clases, métodos abstractos y diferencia con encapsulamiento”

# 1. ¿Qué es la Abstracción en POO?
 Definición 

La abstracción es el principio de la POO que consiste en modelar solo las características esenciales de un objeto y ocultar los detalles innecesarios.
Se enfoca en qué hace un objeto y no en cómo lo hace.

Idea principal
La abstracción simplifica la complejidad mostrando únicamente lo necesario.

# Explicación
Cuando creamos clases y métodos, no mostramos toda la lógica interna, sino lo que el usuario o el programador necesita usar.

# 2. Clases
Definición

Una clase es el plano que define las características (atributos) y comportamientos (métodos) de un objeto en POO.

Idea clave
Una clase describe, un objeto existe.

Ejemplo real:
class Carro {
    // Atributos
    String marca;
    int modelo;

    // Método
    void mostrarInfo() {
        System.out.println("Carro: " + marca + " Modelo: " + modelo);
    }
}

// Clase principal para ejecutar
public class Main {
    public static void main(String[] args) {

        // Crear objeto (instancia de la clase)
        Carro c1 = new Carro();
        c1.marca = "Mazda";
        c1.modelo = 2020;

        // Uso del método
        c1.mostrarInfo();
    }
}



# 3. Métodos Abstractos
Definición

Un método abstracto es un método que se declara pero no tiene implementación, su lógica se define en las clases hijas y Solo pueden existir en clases abstractas.

Objetivo
Obliga a que las clases hijas implementen su propia versión del método, esto asegura consistencia en la jerarquía de clases.

abstract class Pago {
    abstract void procesarPago(); // método abstracto
}

class PagoTarjeta extends Pago {
    void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito...");
    }
}

public class Main {
    public static void main(String[] args) {
        Pago pago = new PagoTarjeta();
        pago.procesarPago();
    }
}


Animal es una clase abstracta y No se puede instanciar.
sonido() obliga a cada animal a definir su propio sonido.
Cada hijo implementa la lógica.

# 4. Diferencia entre Abstracción y Encapsulamiento
Concepto Qué hace Ejemplo
Abstracción	Oculta detalles complejos y muestra solo lo importante	Método sonido() sin implementación
Encapsulamiento	Protege datos y controla acceso	private int edad; + getters/setters

La abstracción oculta la idea interna.
El encapsulamiento oculta los datos internos.


# Conclusión
La abstracción nos ayuda a construir sistemas más claros, organizados y fáciles de mantener.
Junto con principios como encapsulamiento, herencia y polimorfismo, forma la base de cualquier diseño orientado a objetos profesional.

¿Qué es abstracción?	
Mostrar lo esencial, ocultar lo complejo.
¿Para qué sirve un método abstracto?	
Para obligar a las clases hijas a implementar su propia lógica.
