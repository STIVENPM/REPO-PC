package TRABAJOSP11;

import java.util.Scanner;

public class todos {
   
    public static todos Todos = new todos();
    public static Scanner SP = new Scanner(System.in);
    public static int A, B, C, D, E, F,votos,contador,consonantes, operador, letra,opcion, estado = 0, distancia, promedio, voto, PF, PRI, PRC, sum, edades;
    public static double a, b, c, d, R;

    public static void main(String[] args) {
        do {
            System.out.println("Seleccione un ejercicio:");
             System.out.println("1. Calcular distancia");
              System.out.println("2. Calcular promedio");
               System.out.println("3. Calcular puntaje de examen");
                System.out.println("4. Calcular puntaje de partidos");
                 System.out.println("5. Calcular sueldo");
                  System.out.println("6. Calcular area de triángulo");
                   System.out.println("7. Calcular CDs necesarios");
                    System.out.println("8. Distancia entre dos puntos");
                     System.out.println("9. Verifica si debe sacar la cedula");
                      System.out.println("10. Compara dos edades");
                       System.out.println("11. Producción semanal y promedio");
                        System.out.println("12. Mayor de tres numeros");
                         System.out.println("13. Clasificar triangulo");
                          System.out.println("14. Numero a romano");
                           System.out.println("15. Bonificacion por ventas");
                            System.out.println("16. Numero a letra");
                             System.out.println("17. Decenas y unidades");
                            System.out.println("18. Par o impar");
                           System.out.println("19. Primeros cinco pares");
                          System.out.println("20. Sueldo promedio");
                         System.out.println("21. Contar mayores y menores de edad");
                        System.out.println("22. Multiplicación por sumas sucesivas");
                       System.out.println("23. Mostrar impares del 1 al 10");
                      System.out.println("24. Sucesión: A = A*A + 1");
                     System.out.println("25. Detectar vocal y finalizar");
                    System.out.println("26. Serie de Fibonacci hasta 100000");
                   System.out.println("27. Calculadora basica con operadores");
                  System.out.println("28. Contar vocales y consonantes");
                 System.out.println("29. Simulacion de votación con ganador");
                System.out.println("30. sacar el promedio de dos numeros "); 

            System.out.println("0. Salir");

            opcion = SP.nextInt();

            switch (opcion) {
                case 1:
                    LeerDato.ScannerInt2();
                    One.one();
                    break;
                case 2:
                    LeerDato.ScannerInt3();
                    Two.two();
                    break;
                case 3:
                    LeerDato.ScannerInt3();
                    Three.three();
                    break;
                case 4:
                    LeerDato.ScannerInt3();
                    break;
                case 5:
                    LeerDato.ScannerDouble2();
                    break;
                case 6:
                    LeerDato.ScannerDouble3();
                    break;
                case 7:
                    LeerDato.ScannerDouble1();
                    Seven.seven();
                    break;
                case 8:
                    LeerDato.ScannerDouble4();
                    Eight.eight();
                    break;
                case 9:
                    LeerDato.ScannerInt1();
                    Nine.nine();
                    break;
                case 10:
                    LeerDato.ScannerInt2();
                    Teen.teen();
                    break;
                case 11:
                    LeerDato.ScannerInt6();
                    Eleven.eleven();
                    break;
                case 12:
                    LeerDato.ScannerInt3();
                    Twelve.twelve();
                    break;
                case 13:
                    LeerDato.ScannerInt3();
                    Thirteen.thirteen();
                    break;
                case 14:
                    LeerDato.ScannerInt1();
                    Fourteen.fourteen();
                    break;
                case 15:
                    LeerDato.ScannerDouble1();
                    Fifteen.fifteen();
                    break;
                case 16:
                    LeerDato.ScannerInt1();
                    Sixteen.sixteen();
                    break;
                case 17:
                    LeerDato.ScannerInt1();
                    Seventeen.seventeen();
                    break;
                case 18:
                    LeerDato.ScannerInt1();
                    Eighteen.eighteen();
                    break;
                case 19:
                    Nineteen.nineteen();
                    break;
                case 20: 
                System.out.println();
                    LeerDato.ScannerInt2();
                    salario.sueldo();
                    break;
                case 21:
                System.out.println();
                EdadDoscientos.docientos(); 

                    break;
                case 22:
                    LeerDato.ScannerInt2();
                    TwentyTwo.twentyTwo();
                    break;
                case 23:
                    TwentyThree.twentyThree();
                    break;
                case 24:
                    TwentyFour.twentyFour();
                    break;
                case 25:
                    System.out.println();
                    LeerDato.ScannerChar();
                    Vocal.vocal();
                case 26:
                    TwentySix.twentySix();
                    break;
                case 27: 
                    System.out.println();
                    LeerDato.ScannerInt2();
                    LeerDato.ScannerChar();
                    Operador.operador();
                    break;
                case 28:
                    LeerDato.ScannerChar();  
                    Consonantes.consonantes();  
                    break;
                case 29:
                Votos.votos();
                    break;
                case 30: {
                    LeerDato.ScannerInt2();
                    Thirty.thirty();
                    break;
                }
                case 0:
                    System.out.println("chao");
                  
                    break;
                default:
                    System.out.println("no valido");
            }
        } while (estado == 0);

        SP.close();
    }
}
    

