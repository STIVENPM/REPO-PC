package one;
import java.util.Scanner;

public class SixtySix {

public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

System.out.println("ingrese el numero del ejercicio a desarrollar:");

System.out.println("1. f(n)≥g(n)≥0 y que f(n),g(n) ∈ Θ(h(n))");
System.out.println("2. demuestra que ∀a,b (a,b>1 ⇒ lga n ∈Θ(lgb n))");
System.out.println("3. (a) o(f(n)) = o(h(n)) ⇒ o(lgf(n)) = o(lgh(n)) (b) o(lgf(n)) = o(lgh(n)) ⇒ o(f(n)) = o(h(n))");
System.out.println("4. calcula el orden exacto de la funcion t(n)");
System.out.println("5. un natural n≥1 es triangular si es la suma de una sucesion ascendente no nula de naturales consecutivos que comienza en 1.");
System.out.println("6. ¿cual es el mayor tamaño de entrada que podra gestionar nuestro programa, si su complejidad t(n) fuera (para alguna constante ki)?");
System.out.println("7. ¿cual es el mayor tamaño de entrada que podra gestionar nuestro programa en una hora, si su complejidad t(n) fuera (para alguna constante ki)?");
System.out.println("8. algoritmo que calcula los valores maximo y minimo de un vector con n valores realizando para ello menos de (3n/2)comparaciones entre dichos valores.");
System.out.println("9. ecuacion de recurrencia");
System.out.println("10. orden temporal");
System.out.println("11. la primera aparicion de un string");
System.out.println("12. para ordenar el vector de n elementos <e1, e2, ...,en> se utiliza una estrategia analoga al mergesort pero dividiendo el vector en n/2 trozos de tamaño 2 y generalizando elmerge a n/2 secuencias.");
System.out.println("13. dado el algoritmo siguiente, que determina si una cadena c es palindromo:");
System.out.println("14. ¿es la estrategia divide\r\n y venceras mas eficiente que la empleada en el algoritmo trivial?");
System.out.println("15. comparaciones");

int opciones = teclado.nextInt();

long val1 =0 , val2=0 , val3=0; 

switch (opciones) {
case 1:

for ( int n =1; n <= 100; n+=10)

{

val1 = 4 * n;
val2 = 4 * n;
val3 = val1 - val2;

System.out.printf("n = %d, val1 = %d, val2 = %d, val3 = %d%n", n , val1, val2, val3);

}

break;

case 2:

val1 = (long) (Math.log(1000) / Math.log(2));
val2 = (long) (Math.log(1000) / Math.log(10));
val3 = val1 - val2;
System.out.printf("val1 = log2(1000) = %d, val2 = log10(1000) = %d, val3 = 2*log2(1000) = %d%n", val1, val2, val3);

break;

case 3:

long f = 1000000;
long h = 1000000;
val1 = (long) (Math.log(f) / Math.log(2));
val2 = (long) (Math.log(h) / Math.log(2));
val3 = (long) (Math.pow(2, val1));
System.out.printf("log2(f) = %d, log2(h) = %d, 2^log2(f) = %d%n" , val1, val2, val3);
break;

case 4:

int n = 8;
val1 = (long)n * (n+1) / 2; // se asegura que la operacion se haga con long
val2 = 4L * (n/2) * ((n/2) + 1) /2; // se asegura que la operacion se haga con long
val3 = val1 + val2;
System.out.printf("val1 = bucles for = %d, val2 = llamadas recursivas = %d, total = %d%n", val1, val2, val3);
break;

case 5:

int num = 15;
int suma = 0, i =1;
boolean triangular = false;
while (suma < num) {

 suma +=i;
i++;
}

triangular = (suma ==num);
System.out.printf("%d %ses de un numero triangular%n", num, (triangular ? "" : "no"));
break;

case 6:

val1 = 3 * 1000000;
val2 = (long) Math.sqrt(3 * Math.pow(1000000, 2));
val3 = (long) (1000000 + Math.log10(3));
System.out.printf("lineal: %d, cuadratico: %d exponencial: %d%n", val1, val2, val3);
break;

case 7:

val1 = 100L * 1000000; // asegurarse de que la operacion se haga como long
val2 = (long) Math.sqrt(100L * Math.pow(1000000, 2)); // asegurarse de que la operacion se haga como long
val3 = 1000000 + 2;
System.out.printf("lineal: %d, cuadratico: %d exponencial: %d%n", val1, val2, val3);
break;

case 8:

int[] arr = {4,7,1,9,3,2};
int max = arr[0], min = arr[0];
for (int j = 1; j < arr.length; j++) {
if (arr[j] > max) max = arr[j];
if (arr[j] < min) min = arr[j];
}
System.out.printf("maximo = %d, minimo = %d,%n", max, min);
break;

case 9:

int m = 16;
val1 = 3L * m; // asegurar que la operacion sea con long
System.out.printf("orden aproximado de la recurrencia para n=%d es 0(n) = %d%n", m, val1);

break;

case 10:

int par = 5;
val1 = (long) Math.pow(2, par);
val2 = (long) par * par; // asegurar que la operacion sea con long
System.out.printf("parcial(n-1) = n2%d = %d, total = 0(n^2) = %d%n", par, val1, val2);
break;

case 11:

int nA = 7, mB = 3;
val1 = (long)(nA - mB +1) * mB; // asegurar que la operacion sea con long
System.out.printf("maximas comparaciones a(i)=b(j): %d%n", val1);
break; // añadir break para evitar fall-through

case 12:

val1 = 100;
val2 = val1 * (long)(Math.log(val1) / Math.log(2)); // asegurar que la operacion sea con long
System.out.printf("orden aproximado con monticulo: 0(n log n) = %d%n", val2);

break;

case 13:

int length =10;
val1 = length / 2;
val2 = 2;
System.out.printf("peor caso: %d comparaciones. caso medio = o(1)%n", val1);

break;

case 14:

int n14 = 64;
val1 = (long)(Math.log (n14) / Math.log(2)); // asegurar que la operacion sea con long
val2 = (long)n14 * n14; // asegurar que la operacion sea con long
System.out.printf("divide y venceras: %d, trivial cuadratico: %d%n", val1, val2);

break;

case 15:

int tam = 16;
val1 = (3L * tam/2) - 2; // asegurar que la operacion sea con long
System.out.printf("comparaciones maximas (peor caso): %d%n", val1);

break;

 default:

 System.out.println("ejercicio no valido. introduce un numero entre 1 y 15.");
break;
}

teclado.close();

}


}