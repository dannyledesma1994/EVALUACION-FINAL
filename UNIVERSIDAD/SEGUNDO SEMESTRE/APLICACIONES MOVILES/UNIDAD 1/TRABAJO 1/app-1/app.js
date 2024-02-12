// Función para calcular el área de un cuadrado
function calcularAreaCuadrado(lado) {
    return lado * lado;
}

// Función para calcular el área de un círculo
function calcularAreaCirculo(radio) {
    return Math.PI * Math.pow(radio, 2);
}

// Función para calcular el área de un triángulo
function calcularAreaTriangulo(base, altura) {
    return (base * altura) / 2;
}

// Ejercicio
var ladoCuadrado = 8;
var radioCirculo = 4;
var baseTriangulo = 2;
var alturaTriangulo = 10;

var areaCuadrado = calcularAreaCuadrado(ladoCuadrado);
var areaCirculo = calcularAreaCirculo(radioCirculo);
var areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);

console.log("Área del cuadrado:", areaCuadrado);
console.log("Área del círculo:", areaCirculo);
console.log("Área del triángulo:", areaTriangulo);