namespace Security.Domain.Entities;

public class Rol
{
    public int RolID { get; set; }
    public string NombreRol { get; set; } = string.Empty;   // Ej: db_owner, db_datareader
    public string? Descripcion { get; set; }
}
