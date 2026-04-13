namespace ProyectoJugadores
{
    public class JugadorCurador
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorCurador()
        {
            Nombre = "";
            Nivel = 0;
        }

        public JugadorCurador(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorCurador Copy(JugadorCurador j)
        {
            return new JugadorCurador(j.Nombre, j.Nivel);
        }
    }
}
