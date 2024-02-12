package com.desarrollo.modelo;

import java.util.ArrayList;

public interface EmpleadoDAO {

    //métodos abstractos
    public abstract int insert(EmpleadoDTO empleado);

    public abstract ArrayList<EmpleadoDTO> select();

    public abstract int update(EmpleadoDTO empleado);

    public abstract int delete(EmpleadoDTO empleado);

}
