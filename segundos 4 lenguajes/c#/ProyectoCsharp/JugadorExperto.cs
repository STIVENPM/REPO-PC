namespace ProyectoJugadores
{
    public class JugadorExperto
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorExperto()
        {
            Nombre = "Experto";
            Nivel = 20;
        }

        public JugadorExperto(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorExperto Copy(JugadorExperto j)
        {
            return new JugadorExperto(j.Nombre, j.Nivel);
        }
    }
}
