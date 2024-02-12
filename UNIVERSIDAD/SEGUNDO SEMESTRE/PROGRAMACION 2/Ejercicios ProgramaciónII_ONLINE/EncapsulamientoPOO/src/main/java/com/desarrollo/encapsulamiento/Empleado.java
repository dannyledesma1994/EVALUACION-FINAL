package com.desarrollo.encapsulamiento;

public class Empleado {

    //atributos
    //encapsulamiento: ocultar el estado del objeto (variables)
    private String nombre;
    private String codigo;
    private int horasTrabajadas;
    private double valorHora;

    //constructor
    public Empleado(String nombre, String codigo, int horasTrabajadas, double valorHora) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    //métodos
    //métodos setter: modificar el valor del atributo encapsulado
    //Métods getters: retornan el dato del atributo encapsulado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void sueldo() {
        double sueldo;
        sueldo = this.horasTrabajadas * this.valorHora;
        System.out.println("El sueldo es: " + sueldo);
    }

    //método toString
    @Override  //anotación - sobreescribiendo el método
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", codigo=" + codigo + ", horasTrabajadas=" + horasTrabajadas + ", valorHora=" + valorHora + '}';
    }
    
}
