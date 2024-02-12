package com.desarrollo.controlador;

import com.desarrollo.modelo.*;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestionEmpleados {

    private EmpleadoDAO datos = new EmpleadoDAOImpl();

    public int insertarEmpleado(String nombre, String apellido, String cedula, String tipoEmpleado, String direccion, Date fecha) {
        int registros;
        //Crear el objeto 
        EmpleadoDTO empleado = new EmpleadoDTO(nombre, apellido, cedula, tipoEmpleado, direccion, fecha);
        registros = datos.insert(empleado);
        return registros;
    }

    public void listarEmpleados(DefaultTableModel model) {
        ArrayList<EmpleadoDTO> listaEmpleados = datos.select();
        for (int i = 0; i < listaEmpleados.size(); i++) {

            model.addRow(new Object[]{
                listaEmpleados.get(i).getId(),
                listaEmpleados.get(i).getNombre(),
                listaEmpleados.get(i).getApellido(),
                listaEmpleados.get(i).getCedula(),
                listaEmpleados.get(i).getFecha(),
                listaEmpleados.get(i).getTipoEmpleado(),
                listaEmpleados.get(i).getDireccion()
            });
        }
    }

//    public int actualizarEmpleado(int id, String nombre, String apellido, String cedula, double sueldo, String tipoEmpleado, String direccion) {
//        int registros;
////Crear objeto
//        //EmpleadoDTO empleado = new EmpleadoDTO(id, nombre, apellido, cedula, sueldo, tipoEmpleado, direccion);
//        //registros = datos.update(empleado);
//        return registros;
//    }

    public int eliminarEmpleado(int id) {
        int registros;
        //Crear objeto
        EmpleadoDTO empleado = new EmpleadoDTO(id);
        registros = datos.delete(empleado);
        return registros;
    }

}
