namespace Security.Domain.Entities;

public class Auditoria
{
    public int AuditoriaID { get; set; }
    public int? UsuarioID { get; set; }

    public string? Accion { get; set; }
    public DateTime Fecha { get; set; } = DateTime.Now;

    public string? Descripcion { get; set; }
    public string? IP_Origen { get; set; }
    public string? Aplicacion { get; set; }

    public Usuario? Usuario { get; set; }
}
