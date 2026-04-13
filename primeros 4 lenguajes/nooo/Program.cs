using System;

class Program
{
    static void Main()
    {
        Console.WriteLine("atributo");
        Atributos a = new Atributos();
        Console.WriteLine($"numero: {a.numero}, Pi: {a.pi}, Letra: {a.letra}, Nombre: {a.nombre}, Activo: {a.activo}, Salario: {a.salario}, Peso: {a.peso}, Poblacion: {a.poblacion}");

        Console.WriteLine("clase");
        Clases c = new Clases();
        Console.WriteLine($"Nombre: {c.Nombre.Nombre}, Edad: {c.Edad.Edad}, Ciudad: {c.Ciudad.Ciudad}, Cargo: {c.Cargo.Cargo}, Salario: {c.Salario.Salario}");

        Console.WriteLine("metodos con parametros");
        MetodosConParametros m = new MetodosConParametros();
        m.Nombre("stiven");
        m.Edad(18);
        m.Ciudad("Neiva");
        m.Cargo("Desarrollador");
        m.Salario(10.000m);

        Console.WriteLine("metodos con retorno ");
        MetodosConRetorno mn = new MetodosConRetorno();
        Console.WriteLine($"nombre: {mn.Nombre()}");
        Console.WriteLine($"edad: {mn.Edad()}");
        Console.WriteLine($"ciudad {mn.Ciudad()}");
        Console.WriteLine($"cargo {mn.Cargo()}");
        Console.WriteLine($"salario {mn.salario()}");


        Console.WriteLine("metodos sin parametros ");
        MetodosSinParametros ms = new MetodosSinParametros();
        ms.nombre();
        ms.edad();
        ms.ciudad();
        ms.cargo();
        ms.salario();


        Console.WriteLine("metodos sin retorno ");
        var msr = new MetodosSinRetorno();
        msr.nombre();
        msr.edad();
        msr.ciudad();
        msr.cargo();
        msr.salario();

        


    }
}






































































































































































































// using System.Diagnostics;

//  int result = Fibonacci(5);
// Console.WriteLine(result);

// static int Fibonacci(int n)
// {
//     int n1 = 0;
//     int n2 = 1;
//     int sum;

//     for (int i = 2; i < n; i++)
//     {
//         sum = n1 + n2;
//         n1 = n2;
//         n2 = sum;
//         Debug.WriteLineIf(sum == 1, $"sum is 1, n1 is {n1}, n2 is {n2}");
//     }

//     return n == 0 ? n1 : n2;
    
// Debug.WriteLine($"Entering {nameof(Fibonacci)} method");
// Debug.WriteLine($"We are looking for the {n}th number");
// }

// using System;
// using System.Diagnostics;

// class Program
// {
//     static void Main()
//     {
//         int result = Fibonacci(5);
//         Console.WriteLine($"Resultado: {result}");
//     }

//     static int Fibonacci(int n)
//     {
//         Debug.WriteLine($"Entrando al método {nameof(Fibonacci)}");
//         Debug.WriteLine($"Buscando el número {n} de la secuencia Fibonacci");

//         int n1 = 0;
//         int n2 = 1;
//         int sum;

//         for (int i = 2; i <= n; i++)
//         {
//             sum = n1 + n2;
//             n1 = n2;
//             n2 = sum;
//             Debug.WriteLine($"Iteración {i}: n1 = {n1}, n2 = {n2}, sum = {sum}");
//         }

//         return n == 0 ? n1 : n2;
//     }
// }




// using System.Diagnostics;

// class Program
// {
//     static void Main()
//     {
//         Debug.WriteLine("Inicio del programa");
//         int resultado = Sumar(5, 3);
//         Debug.WriteLine($"Resultado calculado: {resultado}");
//     }

//     static int Sumar(int a, int b)
//     {
//         Debug.WriteLine("Entró al método Sumar");
//         int suma = a + b;
//         Debug.WriteLine($"a={a}, b={b}, suma={suma}");
//         return suma;
//     }
// }


// using System.Diagnostics;

// class Program
// {
//     static void Main()
//     {
//         int edad = 15;

//         Debug.Assert(edad >= 15, "El usuario debe ser mayor de edad");
//         Debug.WriteLine("Edad verificada correctamente");
//     }
// }
