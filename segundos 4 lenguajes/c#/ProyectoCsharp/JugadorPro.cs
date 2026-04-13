namespace ProyectoJugadores
{
    public class JugadorPro
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorPro()
        {
            Nombre = "Juan";
            Nivel = 10;
        }

        public JugadorPro(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorPro Copy(JugadorPro j)
        {
            return new JugadorPro(j.Nombre, j.Nivel);
        }
    }
}
