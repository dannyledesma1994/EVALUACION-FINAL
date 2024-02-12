package com.clasejecutable;

import java.util.Scanner;

public class Claseejecutablecaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
            // Crear una instancia de la clase Claseplantillacaja
            Claseplantillacaja miCaja = new Claseplantillacaja();

            // Solicitar los datos por teclado
            System.out.print("Ingrese el alto de la caja: ");
            miCaja.alto = scanner.nextDouble();

            System.out.print("Ingrese el profundo de la caja: ");
            miCaja.profundo = scanner.nextDouble();

            System.out.print("Ingrese el ancho de la caja: ");
            miCaja.ancho = scanner.nextDouble();

            // Llamar al método multiplicar de la Claseplantillacaja
            miCaja.multiplicar();
         
         
    }
}