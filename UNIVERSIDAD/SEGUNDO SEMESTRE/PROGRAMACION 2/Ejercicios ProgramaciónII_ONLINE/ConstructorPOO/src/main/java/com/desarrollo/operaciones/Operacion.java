package com.desarrollo.operaciones;

//clase plantilla
public class Operacion {

    //atributos
    double num1;
    double num2;

    //constructores: Se encargan de inicializar los atributos que son parte del objeto (manipulados)
    //constructor vacío: inicializa los atributos en default(cero, null)
    //Nota: el nombre del constructor siempre es igual al nombre de la clase
    //public Operacion(){
    //el cuerpo del constructor esta vacío
    //System.out.println("Constructor vacío");
    //}
    //constructor no vacío: inicializa los atributos en valores diferentes al default
//    public Operacion(){
//        num1=15;
//        num2=3;
//    }
    //constructor no vacio - parámetros: inicializa los atributos en valores diferentes al defualt mediante parámetros
    public Operacion(double param1, double param2) {
        num1 = param1; //7
        num2 = param2;  //2
    }

    //métodos sin parámetros
    public void sumar() {
        double resultado;
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void restar() {
        double resultado;
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public void multiplicar() {
        double resultado;
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public void dividir() {
        double resultado;
        if (num1 == 0 && num2 == 0) {
            System.out.println("INDETERMINACIÓN");
        } else if (num2 == 0) {
            System.out.println("NO EXISTE DIVISIÓN PARA CERO");
        } else {
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}
