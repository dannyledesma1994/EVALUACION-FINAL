
package com.desarrollo.datos;

public class ImplementacionMySql implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde MySQL...");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde MySQL...");
    }
    
}
