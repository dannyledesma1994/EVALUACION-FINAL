// Definición del objeto agenda con un array de contactos
var agenda = {
    contactos: [
        {
            nombre: "RODRIGO",
            telefono: "0980941778",
            direccion: "CALLE JUAN BENIGNO VELA"
        },
        {
            nombre: "BOLIVAR",
            telefono: "0983546364",
            direccion: "AVENIDA LAS AMERICAS"
        },
        {
            nombre: "LUCHO",
            telefono: "0946745277",
            direccion: "PLAZA SANTO DOMINGO"
        }
    ]
};

// Función para mostrar en la consola el nombre y teléfono de cada contacto en la agenda
function mostrarContactos(agenda) {
    console.log("Lista de contactos:");
    
    // Iteramos sobre el array de contactos
    for (var i = 0; i < agenda.contactos.length; i++) {
        var contacto = agenda.contactos[i];
        console.log("Nombre: " + contacto.nombre + ", Teléfono: " + contacto.telefono);
    }
}

// Llamamos a la función con el objeto agenda como argumento
mostrarContactos(agenda);