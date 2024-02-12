package com.desarrollo.ejercicio;

public class ClaseEjecutablePolimorfismo {

    public static void main(String[] args) {
        //Polimorfismo
        //-Crear un sólo objeto -> padre/interface
        //-En tiempo de ejecución este objeto tome diferentes
        //referencias de clases
        //-Exista polimorfismo: sobreescritura de métodos/implementación de métodos

        Empleado empleado;  //objeto de la clase padre

        empleado = new Empleado("Viviana Flores", 1200, 10);
        System.out.println(empleado.obtenerInformacion());

        System.out.println("");
        System.out.println("-----------------------------------");
        empleado = new Gerente("Carlos Aguas", 1500, 15, "Sistemas");
        System.out.println(empleado.obtenerInformacion());
    }
}
