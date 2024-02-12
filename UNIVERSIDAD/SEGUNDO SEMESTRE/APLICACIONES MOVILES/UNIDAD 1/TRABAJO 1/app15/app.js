// Definición del objeto carrito con un array de productos
var carrito = {
    productos: [
        { nombre: "BUSOS", precio: 25 },
        { nombre: "ZAPATILLAS", precio: 60 },
        { nombre: "Pantalones", precio: 40 }
    ]
};

// Función para calcular el precio total de los productos en el carrito
function calcularPrecioTotalConDescuento(carrito) {
    var precioTotal = 0;

    // Iteramos sobre el array de productos en el carrito
    for (var i = 0; i < carrito.productos.length; i++) {
        precioTotal += carrito.productos[i].precio;
    }

    // Aplicamos un descuento del 10% si el precio total supera los $100
    if (precioTotal > 100) {
        precioTotal *= 0.9; // Multiplicamos por 0.9 para aplicar el descuento del 10%
    }

    return precioTotal;
}

// Llamamos a la función con el objeto carrito como argumento
var precioTotalConDescuento = calcularPrecioTotalConDescuento(carrito);

// Imprimimos el resultado en la consola
console.log("El precio total con descuento es: $" + precioTotalConDescuento);
