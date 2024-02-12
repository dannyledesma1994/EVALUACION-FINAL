
package com.desarrollo.datos;

//clase que implementa una interface
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde Oracle...");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Oracle...");
    }
    
}
