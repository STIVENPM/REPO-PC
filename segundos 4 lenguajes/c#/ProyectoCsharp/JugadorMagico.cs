namespace ProyectoJugadores
{
    public class JugadorMagico
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorMagico()
        {
            Nombre = "Mago";
            Nivel = 5;
        }

        public JugadorMagico(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorMagico Copy(JugadorMagico j)
        {
            return new JugadorMagico(j.Nombre, j.Nivel);
        }
    }
}
