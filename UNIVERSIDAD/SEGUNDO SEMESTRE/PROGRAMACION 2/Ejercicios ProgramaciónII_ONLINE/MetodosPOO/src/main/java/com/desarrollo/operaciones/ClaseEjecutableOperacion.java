package com.desarrollo.operaciones;

public class ClaseEjecutableOperacion {

    public static void main(String[] args) {
        double resultado;

        //Crear objeto: instanciar la clase
        Operacion op = new Operacion();

        //llamar métodos con parámetros
        //llamar método void
        op.sumarVoid(7, 3); //datos para el método: argumentos
        //llmar método return
        //opción 1
        resultado = op.sumarReturn(4, 10);
        System.out.println("El resultado de la suma es: " + resultado);
        //opción 2
        System.out.println("El resultado de la suma es: "+op.sumarReturn(2, 2));

    }
}
