package com.desarrollo.encapsulamiento;

import java.util.Scanner;

public class ClaseEjecutableEmpleado {

    public static void main(String[] args) {
        String nombre, codigo;
        int horasTrabajadas;
        double valorHora;

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("--INFORMACIÓN EMPLEADO--");
        System.out.println("Nombre: ");
        nombre = sc.next();
        System.out.println("Código: ");
        codigo = sc.next();
        System.out.println("Horas trabajadas: ");
        horasTrabajadas = sc.nextInt();
        System.out.println("Valor hora: ");
        valorHora = sc.nextDouble();
        Empleado empleado = new Empleado(nombre, codigo, horasTrabajadas, valorHora);
        
        //llamar atributo
        //empleado.nombre="Karen";  //directa -ERROR
        //System.out.println("Nombre: "+empleado.nombre);  //directa - EEROR
        
        //llamar métodos setters
        empleado.setNombre("Ariel");
  
        //llamar métodos getters
        System.out.println("Nombre: "+empleado.getNombre());
        
        System.out.println(empleado.toString());
        empleado.sueldo();
    }
}
