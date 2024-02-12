// Definición del objeto alumno
var alumno = {
    nombre: "LUIS",
    edad: 20,
    calificaciones: [8, 9, 7, 9, 6]
};

// Función para calcular el promedio de las calificaciones
function calcularPromedioCalificaciones(alumno) {
    var sumatoria = 0;

    // Sumamos todas las calificaciones
    for (var i = 0; i < alumno.calificaciones.length; i++) {
        sumatoria += alumno.calificaciones[i];
    }

    // Calculamos el promedio dividiendo la sumatoria por la cantidad de calificaciones
    var promedio = sumatoria / alumno.calificaciones.length;

    return promedio;
}

// Llamamos a la función con el objeto alumno como argumento
var promedioCalificaciones = calcularPromedioCalificaciones(alumno);

// Imprimimos el resultado en la consola
console.log("El promedio de las calificaciones de " + alumno.nombre + " es: " + promedioCalificaciones);