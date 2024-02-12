// Función para calcular el volumen de un cubo
function calcularVolumenCubo(lado) {
    return Math.pow(lado, 3);
}

// Función para calcular el volumen de un cono
function calcularVolumenCono(radio, altura) {
    return (1 / 3) * Math.PI * Math.pow(radio, 2) * altura;
}

// Función para calcular el volumen de una pirámide cuadrangular
function calcularVolumenPiramideCuadrangular(base, altura) {
    return (1 / 3) * Math.pow(base, 2) * altura;
}

// Ejercicio
var ladoCubo = 6;
var radioCono = 4;
var alturaCono = 8;
var basePiramide = 7;
var alturaPiramide = 9;

var volumenCubo = calcularVolumenCubo(ladoCubo);
var volumenCono = calcularVolumenCono(radioCono, alturaCono);
var volumenPiramide = calcularVolumenPiramideCuadrangular(basePiramide, alturaPiramide);

console.log("Volumen del cubo:", volumenCubo);
console.log("Volumen del cono:", volumenCono);
console.log("Volumen de la pirámide cuadrangular:", volumenPiramide)