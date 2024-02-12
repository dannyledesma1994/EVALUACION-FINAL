// Definición del objeto producto
var producto = {
    nombre: "Pantalon",
    precio: 20,
    cantidad: 3
};

// Función para imprimir el producto multiplicando el precio por la cantidad
function imprimirProductoConTotal(producto) {
    // Calculamos el total multiplicando el precio por la cantidad
    var total = producto.precio * producto.cantidad;

    // Imprimimos los detalles del producto y el total en la consola
    console.log("Producto: " + producto.nombre);
    console.log("Precio: $" + producto.precio);
    console.log("Cantidad: " + producto.cantidad);
    console.log("Total: $" + total);
}

// Llamamos a la función con el objeto producto como argumento
imprimirProductoConTotal(producto);