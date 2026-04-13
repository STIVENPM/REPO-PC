namespace ProyectoJugadores
{
    public class JugadorNovato
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorNovato()
        {
            Nombre = "Novato";
            Nivel = 1;
        }

        public JugadorNovato(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorNovato Copy(JugadorNovato j)
        {
            return new JugadorNovato(j.Nombre, j.Nivel);
        }
    }
}
