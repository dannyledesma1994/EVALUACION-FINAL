
package com.desarrollo.datos;
//interface
public interface AccesoDatos {
    //constantes
    public static final int MAX_REGISTROS=10;
    
    //no tiene constructor
    
    
    //métodos abstractos
    public abstract void insertar();
    public abstract void listar();
}
