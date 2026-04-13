package TRABAJOSP11;



public class salario {
    public static void sueldo() {
        todos.sum = 0; 

        for (todos.contador = 1; todos.contador <= todos.A; todos.contador++) {
            System.out.print("Ingrese sueldo " + todos.contador + ": ");
            todos.B = todos.SP.nextInt(); 
            todos.sum += todos.B; 
        }

        todos.promedio = todos.sum / todos.A; 
        System.out.println("Sueldo promedio: " + todos.promedio);
    }
}