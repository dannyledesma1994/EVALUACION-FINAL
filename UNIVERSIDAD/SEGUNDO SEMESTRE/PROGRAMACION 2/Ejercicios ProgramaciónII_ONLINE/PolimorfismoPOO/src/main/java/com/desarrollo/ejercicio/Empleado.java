package com.desarrollo.ejercicio;

public class Empleado {

    //Clase padre
    protected String nombre;
    protected double sueldo;
    protected int aniosExperiencia;

    public Empleado(String nombre, double sueldo, int aniosExperiencia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.aniosExperiencia = aniosExperiencia;
    }

    //método a sobreescribir
    public String obtenerInformacion() {
        return "Nombre: " + this.nombre + "\n"
                + "Sueldo: " + this.sueldo + "\n"
                + "Años de experiencia: " + this.aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
