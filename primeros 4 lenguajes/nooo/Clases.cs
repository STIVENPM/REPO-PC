public class Clases
{
    public ClaseNombre Nombre { get; set; } = new ClaseNombre();
    public ClaseEdad Edad { get; set; } = new ClaseEdad();
    public ClaseCiudad Ciudad { get; set; } = new ClaseCiudad();
    public ClaseCargo Cargo { get; set; } = new ClaseCargo();
    public ClaseSalario Salario { get; set; } = new ClaseSalario();

    public class ClaseNombre
    {
        public string Nombre { get; set; } = "stiven";

        public void N()
        {
            Console.WriteLine($" Nombre: {Nombre}");
        }
    }

    public class ClaseEdad
    {
        public int Edad { get; set; } = 18;

        public void N()
        {
            Console.WriteLine($" Edad: {Edad}");
        }
    }

    public class ClaseCiudad
    {
        public string Ciudad { get; set; } = "neiva";

        public void C()
        {
            Console.WriteLine($" Ciudad: {Ciudad}");
        }
    }

    public class ClaseCargo
    {
        public string Cargo { get; set; } = "desarrollador de software";

        public void C()
        {
            Console.WriteLine($" Cargo: {Cargo}");
        }
    }

    public class ClaseSalario
    {
        public decimal Salario { get; set; } = 10.000m;

        public void S()
        {
            Console.WriteLine($" Salario: {Salario}");
        }
    }
}