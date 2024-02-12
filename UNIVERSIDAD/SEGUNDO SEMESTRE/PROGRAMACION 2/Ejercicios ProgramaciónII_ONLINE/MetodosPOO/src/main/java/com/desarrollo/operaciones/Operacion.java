package com.desarrollo.operaciones;
//clase plantilla

public class Operacion {

    //atributos
    //métodos con parámetros
    //metodos void: Se ejecuta la acción, pero no retorna un valor
    public void sumarVoid(double num1, double num2) { //parámetros
        double resultado;
        resultado = num1 + num2; //10
        System.out.println("El resultado de la suma es: " + resultado);
    }

    //método return: Se ejecuta la acción, pero si retorna un valor
    public double sumarReturn(double num1, double num2) {
        double resultado;
        resultado = num1 + num2;  //14
        return resultado;  //14 //retornando el valor almacendo en la variable
    }
}
