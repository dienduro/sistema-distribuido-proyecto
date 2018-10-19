/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Empleados.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DIEGO
 */
public class Empleados extends EmpleadoPOA{

    @Override
    public boolean insertarEmpleado(String nombre, String apellido, String genero, String direccion, String fecha_nacimiento, String estado_civil, String codigo_cargo, double hora_entrada, double hora_salida, String telefono, float sueldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarEmpleado(int cedula_empleado, String nombre, String apellido, String genero, String direccion, String fecha_nacimiento, String estado_civil, String codigo_cargo, double hora_entrada, double hora_salida, String telefono, float sueldo, int empresa_ruc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarEmpleado(int cedula_empleado, int empresa_ruc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarEmpleado(int cedula_empleado, int empresa_ruc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

/**
 *
 * @author DIEGO
 */

}
