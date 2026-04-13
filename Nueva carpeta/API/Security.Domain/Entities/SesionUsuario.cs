using System.ComponentModel.DataAnnotations;

namespace Security.Domain.Entities;

public class SesionUsuario
{
    [Key]
    public int SesionID { get; set; }

    public int UsuarioID { get; set; }

    public DateTime FechaInicio { get; set; } = DateTime.Now;
    public DateTime? FechaFin { get; set; }

    public string? IP_Origen { get; set; }
    public string? EstadoSesion { get; set; } = "Activo";

    public Usuario? Usuario { get; set; }
}
