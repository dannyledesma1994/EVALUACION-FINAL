// Función para mostrar todos los números impares en un rango dado
function mostrarNumerosImparesEnRango(inicio, fin) {
    if (inicio > fin) {
        console.log("El inicio del rango debe ser menor o igual al final del rango.");
        return;
    }

    console.log("Números impares en el rango de " + inicio + " a " + fin + ":");

    for (var i = inicio; i <= fin; i++) {
        if (i % 2 !== 0) {
            console.log(i);
        }
    }
}

// Ejercicio
var inicioRango = 9;
var finRango = 29;

mostrarNumerosImparesEnRango(inicioRango, finRango);