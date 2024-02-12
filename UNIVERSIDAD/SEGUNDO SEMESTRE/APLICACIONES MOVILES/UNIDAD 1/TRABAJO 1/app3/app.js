// Función para convertir grados Celsius a grados Fahrenheit
function celsiusToFahrenheit(gradosCelsius) {
    var gradosFahrenheit = (gradosCelsius * 9/5) + 32;
    return gradosFahrenheit;
}

// Ejercicio
var temperaturaCelsius = 35;
var temperaturaFahrenheit = celsiusToFahrenheit(temperaturaCelsius);

console.log(temperaturaCelsius + " grados Celsius son equivalentes a " + temperaturaFahrenheit + " grados Fahrenheit.");