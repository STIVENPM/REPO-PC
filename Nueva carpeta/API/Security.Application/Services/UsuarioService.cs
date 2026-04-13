using Microsoft.EntityFrameworkCore;
using Security.Application.Security;
using Security.Domain.Entities;
using Security.Infrastructure.Data;

namespace Security.Application.Services
{
    public class UsuarioService
    {
        private readonly SecurityDbContext _context;

        public UsuarioService(SecurityDbContext context)
        {
            _context = context;
        }

        public async Task<Usuario> Registrar(string nombreUsuario, string contrasenaPlano)
        {
            var usuario = new Usuario
            {
                NombreUsuario = nombreUsuario,
                ContrasenaHash = PasswordHasher.Hash(contrasenaPlano),
                EstadoUsuario = true,
                TipoAutenticacion = "SQL",
                FechaCreacion = DateTime.Now
            };

            _context.Usuarios.Add(usuario);
            await _context.SaveChangesAsync();
            return usuario;
        }

        public async Task<List<Usuario>> Listar()
        {
            return await _context.Usuarios.ToListAsync();
        }
    }
}
