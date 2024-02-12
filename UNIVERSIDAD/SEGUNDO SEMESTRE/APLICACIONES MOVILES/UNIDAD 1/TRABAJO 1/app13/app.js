// Definición de dos objetos libro
var libro1 = {
    titulo: "El Señor de los Anillos",
    autor: "J.R.R. Tolkien",
    añoPublicacion: 1954
};

var libro2 = {
    titulo: "Cien años de soledad",
    autor: "Gabriel García Márquez",
    añoPublicacion: 1967
};

// Función para mostrar en la consola el título y autor de cada libro en un array
function mostrarLibros(libros) {
    console.log("Lista de libros:");
    
    // Iteramos sobre el array de libros
    for (var i = 0; i < libros.length; i++) {
        var libro = libros[i];
        console.log("Título: " + libro.titulo + ", Autor: " + libro.autor);
    }
}

// Creación de un array de libros
var arrayDeLibros = [libro1, libro2];

// Llamamos a la función con el array de libros como argumento
mostrarLibros(arrayDeLibros);
