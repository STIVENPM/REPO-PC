namespace Security.Domain.Entities;

public class Permiso
{
    public int PermisoID { get; set; }
    public string NombrePermiso { get; set; } = string.Empty; // SELECT, INSERT, UPDATE, DELETE
    public string? Descripcion { get; set; }
}
