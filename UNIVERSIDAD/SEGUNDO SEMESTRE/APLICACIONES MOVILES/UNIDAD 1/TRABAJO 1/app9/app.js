// Función calculadora
function calcular(numero1, numero2, operacion) {
    switch (operacion) {
        case 'sumar':
            return numero1 + numero2;
        case 'restar':
            return numero1 - numero2;
        case 'multiplicar':
            return numero1 * numero2;
        case 'dividir':
            if (numero2 !== 0) {
                return numero1 / numero2;
            } else {
                return 'Error: No es posible dividir por cero.';
            }
        default:
            return 'Operación no válida. Las operaciones válidas son: sumar, restar, multiplicar, dividir.';
    }
}

// Ejercicio
var num1 = 20;
var num2 = 8;
var operacion = 'sumar';

var resultado = calcular(num1, num2, operacion);
console.log("El resultado de la operación " + operacion + " es:", resultado);