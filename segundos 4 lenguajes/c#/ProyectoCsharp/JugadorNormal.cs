namespace ProyectoJugadores
{
    public class JugadorNormal
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorNormal()
        {
            Nombre = "Juan";
            Nivel = 10;
        }

        public JugadorNormal(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorNormal Copy(JugadorNormal j)
        {
            return new JugadorNormal(j.Nombre, j.Nivel);
        }
    }
}
