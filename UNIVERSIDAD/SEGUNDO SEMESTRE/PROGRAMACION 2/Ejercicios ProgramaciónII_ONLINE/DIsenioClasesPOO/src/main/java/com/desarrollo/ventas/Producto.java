package com.desarrollo.ventas;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contProducto = 0;

    //sobrecarga de constructores: existe más de un constructor en la misma clase
    private Producto() {
        this.idProducto = ++contProducto;
    }

    public Producto(String nombre, double precio) {
        //llamar un constructor dentro de otro
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContProducto() {
        return contProducto;
    }
    
    
}
