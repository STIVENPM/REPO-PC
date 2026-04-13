namespace ProyectoJugadores
{
    public class JugadorBase
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorBase()
        {
            Nombre = "Juan";
            Nivel = 10;
        }

        public JugadorBase(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorBase Copy(JugadorBase j)
        {
            return new JugadorBase(j.Nombre, j.Nivel);
        }
    }
}
