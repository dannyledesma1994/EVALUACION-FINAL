// Función para contar la cantidad de vocales en un string
function contarVocales(cadena) {
    // Convertimos la cadena a minúsculas para considerar las vocales en mayúsculas y minúsculas
    var cadenaMinusculas = cadena.toLowerCase();

    var conteoVocales = 0;

    // Iteramos sobre cada caracter de la cadena y contamos las vocales
    for (var i = 0; i < cadenaMinusculas.length; i++) {
        var caracterActual = cadenaMinusculas.charAt(i);

        // Verificamos si el caracter es una vocal
        if (caracterActual === 'a' || caracterActual === 'e' || caracterActual === 'i' || caracterActual === 'o' || caracterActual === 'u') {
            conteoVocales++;
        }
    }

    return conteoVocales;
}

// Ejercicio
var miString = "Bienvenidos a mi mundo de la programacion";
var cantidadVocales = contarVocales(miString);

console.log("La cantidad de vocales en el string es:", cantidadVocales);