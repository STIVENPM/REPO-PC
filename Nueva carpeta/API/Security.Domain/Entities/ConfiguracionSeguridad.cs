namespace Security.Domain.Entities;

public class ConfiguracionSeguridad
{
    public int ConfiguracionID { get; set; }  // ← así, exactamente

    public string NombreConfiguracion { get; set; } = string.Empty;
    public string ValorConfiguracion { get; set; } = string.Empty;
    public string? Descripcion { get; set; }
}
