namespace Security.Domain.Entities;

public class RolPermiso
{
    public int RolID { get; set; }
    public int PermisoID { get; set; }

    public DateTime FechaAsignacion { get; set; } = DateTime.Now;

    // Navegación
    public Rol? Rol { get; set; }
    public Permiso? Permiso { get; set; }
}
