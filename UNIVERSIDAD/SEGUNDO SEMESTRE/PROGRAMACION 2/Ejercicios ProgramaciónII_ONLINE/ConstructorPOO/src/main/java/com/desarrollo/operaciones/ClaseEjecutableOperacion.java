package com.desarrollo.operaciones;

import java.util.Scanner;

public class ClaseEjecutableOperacion {

    public static void main(String[] args) {

        int op;
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        //Operacion op=new Operacion();
        //Operacion operacion = new Operacion(25, 5);
        do {
            System.out.println("");
            System.out.println("--MENÚ DE OPERACIONES--");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Escoja una opción: ");
            op = sc.nextInt();

            System.out.println("");
            System.out.println("Ingrese el primer número: ");
            num1 = sc.nextDouble();  //200
            System.out.println("Ingrese el segundo número: ");
            num2 = sc.nextDouble();  //8
            //instanciar la clase
            Operacion operacion = new Operacion(num1, num2);

            switch (op) {
                case 1:
                    operacion.sumar();
                    break;
                case 2:
                    operacion.restar();
                    break;
                case 3:
                    operacion.multiplicar();
                    break;
                case 4:
                    operacion.dividir();
                    break;
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR NUESTRO PROGRAMA");
                    break;
            }
        } while (op != 5);
    }
}
