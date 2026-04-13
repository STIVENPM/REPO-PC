using System.ComponentModel.DataAnnotations;

namespace Security.Domain.Entities;

public class LogError
{
    [Key]
    public int ErrorID { get; set; }

    public DateTime Fecha { get; set; } = DateTime.Now;

    public int? UsuarioID { get; set; }
    public string? TipoError { get; set; }
    public string? Descripcion { get; set; }
    public string? IP_Origen { get; set; }

    public Usuario? Usuario { get; set; }
}
