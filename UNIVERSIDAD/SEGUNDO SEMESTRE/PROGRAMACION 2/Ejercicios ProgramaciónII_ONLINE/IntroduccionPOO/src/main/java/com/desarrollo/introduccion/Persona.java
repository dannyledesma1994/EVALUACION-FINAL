package com.desarrollo.introduccion;
//clase plantilla: generar objetos

public class Persona {

    //atributos: características de la clase
    String nombre;
    int edad;
    char genero;

    //métodos: acciones a ejecutar en la clase
    public void informacionPersona() {
        System.out.println("");
        System.out.println("--DETALLE INFORMACIÓN PERSONA--");
        System.out.println("Nombre: " + nombre
                + "\n" + "Edad: " + edad
                + "\n" + "Género: " + genero);
    }
}
