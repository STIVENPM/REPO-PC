namespace Security.Domain.Entities;

public class UsuarioRol
{
    public int UsuarioID { get; set; }
    public int RolID { get; set; }

    public DateTime FechaAsignacion { get; set; } = DateTime.Now;

    public Usuario? Usuario { get; set; }
    public Rol? Rol { get; set; }
}
