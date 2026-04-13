package TRABAJOSP11;
public class Operador {
    public static void operador() {
        todos.R = 0; 
        switch (todos.letra) {
            case '+':
                todos.R = todos.A + todos.B;
                break;
            case '-':
                todos.R = todos.A - todos.B;
                break;
            case '*':
                todos.R = todos.A * todos.B;
                break;
            case '/':
                todos.R = (double) todos.A / todos.B;
                break;
            case '^':
                todos.R = Math.pow(todos.A, todos.B);
                break;
        }

        System.out.println("Resultado: " + todos.R);
    }
}