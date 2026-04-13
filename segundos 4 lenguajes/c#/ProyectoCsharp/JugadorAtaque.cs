namespace ProyectoJugadores
{
    public class JugadorAtaque
    {
        public string Nombre { get; set; }
        public int Nivel { get; set; }

        public JugadorAtaque()
        {
            Nombre = "";
            Nivel = 0;
        }

        public JugadorAtaque(string nombre, int nivel)
        {
            Nombre = nombre;
            Nivel = nivel;
        }

        public static JugadorAtaque Copy(JugadorAtaque j)
        {
            return new JugadorAtaque(j.Nombre, j.Nivel);
        }
    }
}
