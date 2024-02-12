
package com.desarrollo.ejercicio;


public class ClaseEjecutableSobreEscrituraMetodos {

    public static void main(String[] args) {
        //Probar métodos sobreescritos
        Empleado empleado=new Empleado("Viviana Flores", 1200, 10);
        System.out.println(empleado.obtenerInformacion());
        
        System.out.println("");
        System.out.println("-----------------------------------");
        Gerente gerente=new Gerente("Carlos Aguas", 1500, 15, "Sistemas");
        System.out.println(gerente.obtenerInformacion());
    }
}
