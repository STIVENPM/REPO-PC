namespace ProyectoJugadores
{
    public class JugadorVIP
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorVIP()
        {
            Nombre = "VIP Juan";
            Nivel = 50;
        }

        public JugadorVIP(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorVIP Copy(JugadorVIP j)
        {
            return new JugadorVIP(j.Nombre, j.Nivel);
        }
    }
}
