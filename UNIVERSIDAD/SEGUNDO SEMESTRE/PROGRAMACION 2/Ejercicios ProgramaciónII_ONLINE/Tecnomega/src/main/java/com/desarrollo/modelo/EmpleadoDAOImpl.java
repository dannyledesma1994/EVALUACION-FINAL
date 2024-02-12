package com.desarrollo.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoDAOImpl implements EmpleadoDAO {

    private static final String SQL_INSERT = "INSERT INTO personas (nombre, apellido, cedula, tipo_empleado, direccion, fecha) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM personas";
    private static final String SQL_UPDATE = "UPDATE personas SET nombre=?, apellido=?, cedula=?, tipo_empleado=?, direccion=? WHERE id=?";
    private static final String SQL_DELETE = "DELETE FROM personas WHERE id=?";

    @Override
    public int insert(EmpleadoDTO empleado) {
        int registros = 0;
        try {
            //1. Generar el objeto de conexión.
            Connection conn = Conexion.getConeccion();
            //2. Crear el objeto para preparar la query
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT);
            //3. Indicar los valores para ejecutar la query
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getCedula());
            //stmt.setDouble(4, empleado.getSueldo());
            stmt.setString(4, empleado.getTipoEmpleado());
            stmt.setString(5, empleado.getDireccion());
            stmt.setDate(6, empleado.getFecha());
            //4. Ejecutar query
            registros = stmt.executeUpdate(); //1-> si todo se ejecutó correctamente / 0-> si algo falló
            //5. Cerrar los objetos de conexión
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }

    @Override
    public ArrayList<EmpleadoDTO> select() {
        ArrayList<EmpleadoDTO> listaEmpleados = new ArrayList();
        try {
            Connection conn = Conexion.getConeccion();
            PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
            //3. Ejecutar la query
            ResultSet rs = stmt.executeQuery();

            //4. Verificar los registros
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String cedula = rs.getString(4);
                //double sueldo = rs.getDouble(5);
                String tipoEmpleado = rs.getString(5);
                String direccion = rs.getString(6);
                Date fecha=rs.getDate(7);

                //Crear objeto
                EmpleadoDTO empleado = new EmpleadoDTO(id, nombre, apellido, cedula, tipoEmpleado, direccion, fecha);
                //añadir a la lista
                listaEmpleados.add(empleado);
            }

            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return listaEmpleados;
    }

    @Override
    public int update(EmpleadoDTO empleado) {
        int registros = 0;
        try {
            Connection conn = Conexion.getConeccion();
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getCedula());
            //stmt.setDouble(4, empleado.getSueldo());
            stmt.setString(4, empleado.getTipoEmpleado());
            stmt.setString(5, empleado.getDireccion());
            //asignar id a la query
            stmt.setInt(6, empleado.getId());

            registros = stmt.executeUpdate();

            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }

    @Override
    public int delete(EmpleadoDTO empleado) {
        int registros = 0;
        try {
            Connection conn = Conexion.getConeccion();
            PreparedStatement stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, empleado.getId());
            registros = stmt.executeUpdate();

            Conexion.close(stmt);
            Conexion.close(conn);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }

}
