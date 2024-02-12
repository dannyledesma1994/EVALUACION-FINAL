// Función para calcular la suma de los elementos de un arreglo
function sumaDeElementos(arreglo) {
// Utilizamos el método reduce para sumar los elementos del arreglo
    var suma = arreglo.reduce(function(acumulador, elemento) {
        return acumulador + elemento;
    }, 0); 
// El segundo parámetro de reduce establece el valor inicial del acumulador (en este caso, 0)

    return suma;
}

// Ejercicio
var miArreglo = [8, 12, 18, 20, 25];
var resultadoSuma = sumaDeElementos(miArreglo);

console.log("La suma de los elementos del arreglo es:", resultadoSuma);