using Microsoft.EntityFrameworkCore;
using Security.Infrastructure.Data;
using Security.Application.Services;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllers();

// OpenAPI (Swagger)
builder.Services.AddOpenApi();

// EF Core + SQL Server (DbContext)
builder.Services.AddDbContext<SecurityDbContext>(options =>
    options.UseSqlServer(
        builder.Configuration.GetConnectionString("SecurityConnection")
    )
);

// ✅ Registrar tu lógica (Application)
builder.Services.AddScoped<UsuarioService>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.MapOpenApi();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();
