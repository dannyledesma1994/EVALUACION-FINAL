// Función para comparar dos números y determinar cuál es mayor y cuál es menor
function compararNumeros(numero1, numero2) {
    if (numero1 > numero2) {
        return "El número " + numero1 + " es mayor que " + numero2 + ", y " + numero2 + " es menor que " + numero1;
    } else if (numero1 < numero2) {
        return "El número " + numero2 + " es mayor que " + numero1 + ", y " + numero1 + " es menor que " + numero2;
    } else {
        return "Ambos números son iguales";
    }
}

// Ejercicio
var numeroA = 15;
var numeroB = 8;
var resultadoComparacion = compararNumeros(numeroA, numeroB);

console.log(resultadoComparacion);