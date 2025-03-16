using Evaluacion.Services;

var builder = WebApplication.CreateBuilder(args);

// Agregar servicios al contenedor.
builder.Services.AddControllersWithViews();

// Registrar el servicio DragonService para que pueda ser inyectado en los controladores.
builder.Services.AddHttpClient<DragonService>();

var app = builder.Build();

// Configurar el pipeline de la aplicación.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
}

app.UseStaticFiles();

app.UseRouting();

// Configurar las rutas de los controladores
app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Dragon}/{action=Index}/{id?}");

app.Run();
