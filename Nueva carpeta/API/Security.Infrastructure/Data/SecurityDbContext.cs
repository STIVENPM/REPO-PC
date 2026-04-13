using Microsoft.EntityFrameworkCore;
using Security.Domain.Entities;

namespace Security.Infrastructure.Data
{
    public class SecurityDbContext : DbContext
    {
        public SecurityDbContext(DbContextOptions<SecurityDbContext> options)
            : base(options)
        {
        }

        // Tablas
        public DbSet<Usuario> Usuarios => Set<Usuario>();
        public DbSet<Rol> Roles => Set<Rol>();
        public DbSet<UsuarioRol> UsuarioRoles => Set<UsuarioRol>();
        public DbSet<Permiso> Permisos => Set<Permiso>();
        public DbSet<RolPermiso> RolPermisos => Set<RolPermiso>();
        public DbSet<Auditoria> Auditorias => Set<Auditoria>();
        public DbSet<ConfiguracionSeguridad> ConfiguracionesSeguridad => Set<ConfiguracionSeguridad>();
        public DbSet<SesionUsuario> SesionesUsuario => Set<SesionUsuario>();
        public DbSet<LogError> LogsErrores => Set<LogError>();
        public DbSet<PoliticaContrasena> PoliticasContrasena => Set<PoliticaContrasena>();

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);

            // 🔑 CLAVE PRIMARIA EXPLÍCITA (ESTA ES LA QUE FALTABA)
            modelBuilder.Entity<ConfiguracionSeguridad>()
                .HasKey(x => x.ConfiguracionID);

            // Tablas pivote con clave compuesta
            modelBuilder.Entity<UsuarioRol>()
                .HasKey(x => new { x.UsuarioID, x.RolID });

            modelBuilder.Entity<RolPermiso>()
                .HasKey(x => new { x.RolID, x.PermisoID });
        }
    }
}
