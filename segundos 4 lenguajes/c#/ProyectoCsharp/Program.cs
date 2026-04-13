using System;

namespace ProyectoJugadores
{
    class Program
    {
        static void Main(string[] args)
        {
            var jn1 = new JugadorNormal();
            var jn2 = new JugadorNormal("Santiago", 15);
            var jn3 = new JugadorNormal("Mafe", 1);
            var jn4 = JugadorNormal.Copy(jn2);

            var jp1 = new JugadorPro();
            var jp2 = new JugadorPro("Luis", 30);
            var jp3 = new JugadorPro("Desconocido", 50);
            var jp4 = JugadorPro.Copy(jp2);

            Console.WriteLine("Instancias creadas:");
            Console.WriteLine(jn1.Nombre + " " + jn1.Nivel);
            Console.WriteLine(jn2.Nombre + " " + jn2.Nivel);
            Console.WriteLine(jp1.Nombre + " " + jp1.Nivel);
            Console.WriteLine(jp2.Nombre + " " + jp2.Nivel);
        }
    }
}
