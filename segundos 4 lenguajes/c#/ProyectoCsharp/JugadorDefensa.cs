namespace ProyectoJugadores
{
    public class JugadorDefensa
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorDefensa()
        {
            Nombre = "";
            Nivel = 0;
        }

        public JugadorDefensa(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorDefensa Copy(JugadorDefensa j)
        {
            return new JugadorDefensa(j.Nombre, j.Nivel);
        }
    }
}
