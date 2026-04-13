using System.ComponentModel.DataAnnotations;

namespace Security.Domain.Entities;

public class PoliticaContrasena
{
    [Key]
    public int PoliticaID { get; set; }

    public int MinLongitud { get; set; } = 8;
    public int MaxLongitud { get; set; } = 20;

    public bool RequiereMayusculas { get; set; } = true;
    public bool RequiereNumeros { get; set; } = true;
    public bool RequiereSimbolos { get; set; } = true;

    public int CaducidadDias { get; set; } = 90;
}
