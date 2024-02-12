package com.desarrollo.modelo;
//clase entidad: representación de la tabla empleados

import java.sql.Date;


public class EmpleadoDTO { //Patrón de diseño DTO

    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    //private double sueldo;
    private String tipoEmpleado;
    private String direccion;
    private Date fecha;

    //constructores
    //DELETE
    public EmpleadoDTO(int id) {
        this.id = id;
    }

    //INSERT
    public EmpleadoDTO(String nombre, String apellido, String cedula,  String tipoEmpleado, String direccion, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        //this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        this.direccion = direccion;
        this.fecha=fecha;
    }

    //UPDATE-SELECT
    public EmpleadoDTO(int id, String nombre, String apellido, String cedula, String tipoEmpleado, String direccion, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        //this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        this.direccion = direccion;
        this.fecha=fecha;
    }
    
    //getters-setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

//    public double getSueldo() {
//        return sueldo;
//    }
//
//    public void setSueldo(double sueldo) {
//        this.sueldo = sueldo;
//    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
