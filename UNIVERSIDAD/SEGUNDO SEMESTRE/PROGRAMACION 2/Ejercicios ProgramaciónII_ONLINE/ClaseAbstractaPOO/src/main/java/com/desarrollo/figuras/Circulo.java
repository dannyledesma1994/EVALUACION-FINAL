
package com.desarrollo.figuras;
//clase hija -> clase padre abstracta
public class Circulo extends FiguraGeometrica{
    
    public Circulo(String nombreFigura){
        super(nombreFigura);
    }

    //Implementando el comportamiento del método abstracto
    @Override //anotación -> implementación de métodos
    public String dibujar() {
        return "Dibujando un círculo...";
    }
}
