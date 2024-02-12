package com.desarrollo.introduccion;

//clase principal
public class ClaseEjecutablePersona {

    public static void main(String[] args) {
        //Crear objeto: instanciar la clase
        Persona persona1 = new Persona();  //Referencia de la clase

        //objeto-> accedemos a la clase plantilla
        //atributos
        persona1.nombre = "Viviana";
        persona1.edad = 30;
        persona1.genero = 'F';
        //métodos
        persona1.informacionPersona();

        //Segundo objeto
        Persona persona2 = new Persona();
        
        persona2.nombre="Ariel";
        persona2.edad=9;
        persona2.genero='M';
        
        persona2.informacionPersona();

    }
}
