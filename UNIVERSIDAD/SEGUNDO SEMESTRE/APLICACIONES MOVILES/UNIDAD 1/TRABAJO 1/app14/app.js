// Definición del objeto cuenta con al menos 3 cuentas
var cuenta1 = {
    numeroCuenta: "227646543256",
    saldo: 1500
};

var cuenta2 = {
    numeroCuenta: "227427549567",
    saldo: 2500
};

var cuenta3 = {
    numeroCuenta: "238452369456",
    saldo: 1000
};

// Función para calcular el saldo total de todas las cuentas en un array
function calcularSaldoTotal(cuentas) {
    var saldoTotal = 0;

    // Iteramos sobre el array de cuentas
    for (var i = 0; i < cuentas.length; i++) {
        saldoTotal += cuentas[i].saldo;
    }

    return saldoTotal;
}

// Creación de un array de cuentas
var arrayDeCuentas = [cuenta1, cuenta2, cuenta3];

// Llamamos a la función con el array de cuentas como argumento
var saldoTotalCuentas = calcularSaldoTotal(arrayDeCuentas);

// Imprimimos el resultado en la consola
console.log("El saldo total de todas las cuentas es: $" + saldoTotalCuentas);
