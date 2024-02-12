// Función para comparar tres números y determinar cuál es mayor y cuál es menor
function compararTresNumeros(numero1, numero2, numero3) {
    var mayor, menor;

    // Comparación para encontrar el mayor
    if (numero1 >= numero2 && numero1 >= numero3) {
        mayor = numero1;
    } else if (numero2 >= numero1 && numero2 >= numero3) {
        mayor = numero2;
    } else {
        mayor = numero3;
    }

    // Comparación para encontrar el menor
    if (numero1 <= numero2 && numero1 <= numero3) {
        menor = numero1;
    } else if (numero2 <= numero1 && numero2 <= numero3) {
        menor = numero2;
    } else {
        menor = numero3;
    }

    return "El número mayor es " + mayor + " y el número menor es " + menor;
}

// Ejercicio
var num1 = 20;
var num2 = 5;
var num3 = 15;

var resultadoComparacion = compararTresNumeros(num1, num2, num3);
console.log(resultadoComparacion);