
package com.desarrollo.figuras;

public class Cuadrado extends FiguraGeometrica{
    
    public Cuadrado(String nombreFigura){
        super(nombreFigura);
    }

    @Override
    public String dibujar() {
        return "Dibujando un cuadrado...";
    }
}
