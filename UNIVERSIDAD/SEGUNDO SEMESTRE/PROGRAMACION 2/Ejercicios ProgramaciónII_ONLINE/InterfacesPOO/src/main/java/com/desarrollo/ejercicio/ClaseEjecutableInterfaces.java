
package com.desarrollo.ejercicio;

import com.desarrollo.datos.*;

public class ClaseEjecutableInterfaces {

    public static void main(String[] args) {
        
        //instarciar interface: no es permitido
        //AccesoDatos datos=new AccesoDatos();
        
        //Polimorfismo
        AccesoDatos datos;
        
        datos=new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        
        
        datos=new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        
       
    }
}
