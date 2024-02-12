
package com.clasejecutable;


public class Claseplantillacaja {
    //atributos
    double alto;
    double profundo;
    double ancho;

    //métodos sin parámetros
    public void multiplicar() {
        double resultado;
        resultado = alto * profundo * ancho;
        System.out.println("El VOLUMEN DE LA CAJA ES: " + resultado);
    }
    
}
