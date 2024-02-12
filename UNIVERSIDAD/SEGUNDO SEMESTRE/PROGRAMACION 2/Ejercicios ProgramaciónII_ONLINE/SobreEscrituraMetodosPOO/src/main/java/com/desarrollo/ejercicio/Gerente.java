package com.desarrollo.ejercicio;

public class Gerente extends Empleado {

    //Clase hija
    private String depertamento;

    public Gerente(String nombre, double sueldo, int aniosExperiencia, String departamento) {
        super(nombre, sueldo, aniosExperiencia);
        this.depertamento = departamento;
    }

    //sobreescribir el método de la clase padre
    @Override  //anotación -> informativo
    public String obtenerInformacion() {
        return "Nombre: " + super.nombre + "\n"
                + "Sueldo: " + super.sueldo + "\n"
                + "Años de experiencia: " + super.aniosExperiencia + "\n"
                + "Departamento: " + this.depertamento;
    }

    public String getDepertamento() {
        return depertamento;
    }

    public void setDepertamento(String depertamento) {
        this.depertamento = depertamento;
    }

}
