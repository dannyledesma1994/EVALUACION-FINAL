package com.desarrollo.operaciones;

//clase plantilla
public class Operacion {

    //atributos
    double num1;  //variables de clase
    double num2;

    //palabra this: reservada - indica que atributos son parte del objeto (manipulados)
    //se usa para evitar el ocultamiento de la variable: atributos y parámetros tienen el mismo nombre
    public Operacion(double num1, double num2) {// variables locales -> parámetros
        this.num1 = num1; //8
        this.num2 = num2;  //8
    }

    //métodos sin parámetros
    public void sumar() {
        double resultado;  //variable local 
        resultado = this.num1 + this.num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void restar() {
        double resultado;
        resultado = this.num1 - this.num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public void multiplicar() {
        double resultado;
        resultado = this.num1 * this.num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public void dividir() {
        double resultado;
        if (this.num1 == 0 && this.num2 == 0) {
            System.out.println("INDETERMINACIÓN");
        } else if (this.num2 == 0) {
            System.out.println("NO EXISTE DIVISIÓN PARA CERO");
        } else {
            resultado = this.num1 / this.num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}
