package com.desarrollo.ejercicios;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        //Concepto Autoboxing: permite transformar un dato primitivo a objeto
        Integer valorObjeto = 10;
        System.out.println("Valor objeto es: " + valorObjeto);
        System.out.println("Valor objeto - decimal: " + valorObjeto.doubleValue());

        //Concpeto Unboxing: permite transformar un dato objeto a primitivo
        int valorPrimitivo = valorObjeto;
        System.out.println("Valor primito es: " + valorPrimitivo);
    }

}
