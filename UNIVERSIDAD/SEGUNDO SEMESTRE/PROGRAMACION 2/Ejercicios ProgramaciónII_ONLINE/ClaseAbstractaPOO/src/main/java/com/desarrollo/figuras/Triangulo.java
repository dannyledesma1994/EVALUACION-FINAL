
package com.desarrollo.figuras;

public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(String nombreFigura){
        super(nombreFigura);
    }

    @Override
    public String dibujar() {
        return "Dibujando un triángulo...";
    }

}
