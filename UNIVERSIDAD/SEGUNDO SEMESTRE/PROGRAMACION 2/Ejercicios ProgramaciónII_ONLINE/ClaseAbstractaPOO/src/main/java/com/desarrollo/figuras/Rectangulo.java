package com.desarrollo.figuras;

public class Rectangulo extends FiguraGeometrica{
    
    public Rectangulo(String nombreFigura){
        super(nombreFigura);
    }

    @Override
    public String dibujar() {
        return "Dibujando un rectángulo...";
    }
}
