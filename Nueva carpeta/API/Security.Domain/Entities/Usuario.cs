namespace Security.Domain.Entities;

public class Usuario
{
    public int UsuarioID { get; set; }

    public string NombreUsuario { get; set; } = string.Empty;

    // 🔒 Codificación negra: nunca se guarda la contraseña en texto
    public string ContrasenaHash { get; set; } = string.Empty;

    public bool EstadoUsuario { get; set; } = true; // activo / inactivo

    public string TipoAutenticacion { get; set; } = "SQL";
    // SQL | Windows

    public DateTime FechaCreacion { get; set; } = DateTime.Now;

    public DateTime? UltimoAcceso { get; set; }
}
