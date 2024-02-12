package com.desarrollo.ventas;

//colecciones: estructuras de datos -> almacena un conjunto de datos
//se almacena valores de tipo objeto
//ArrayList: vector dinámico
import java.util.ArrayList;

public class Orden {

    private int idOrden;
    private ArrayList<Producto> productos;
    private static int contOrden = 0;

    public Orden() {
        this.idOrden = ++contOrden;
        this.productos = new ArrayList();
    }

    public boolean agregarProducto(Producto producto) {
        //agregar en la colección
        productos.add(producto);
        return true;  //confirmación
    }

    public double calcularTotal() {   //1  Mouse  20   //0
        double acumTotal = 0;         //2  Teclado  80  //1
        for (int i = 0; i < this.productos.size(); i++) { //i->posiciones en la colección
            acumTotal += +productos.get(i).getPrecio();
        }
        return acumTotal;
    }

    public ArrayList<Producto> mostrarOrden() {
        return this.productos;
    }

}
