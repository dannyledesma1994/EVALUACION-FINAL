
package com.desarrollo.figuras;
//clase padre -> abstracta
public abstract class FiguraGeometrica {
    //1. Estructura general
    //2. No se necesita materializar el objeto
    //3. Usamos métodos abstractos
    protected String nombreFigura;
    
    protected FiguraGeometrica(String nombreFigura){
        this.nombreFigura=nombreFigura;
    }

    //método abstracto
    //no tiene definido su comportamiento
    public abstract String dibujar();
    
    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    @Override
    public String toString() {
        return "Figura Geométrica{" + "Nombre figura=" + nombreFigura + '}';
    }
}
