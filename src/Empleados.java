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
public class Empleados extends EmpleadoPOA {

    Conexion objConexion = new Conexion();

    @Override
    public boolean eliminarEmpleado(int cedula_empleado) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM empleado WHERE cedula_emple = " + cedula_empleado;
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objConexion.conex.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar empleado " + e.getMessage());
        }

        return resultado;

    }

    @Override
    public String consultarEmpleado(int cedula_emple) {
        String resultado = "";
        try {
            String sqlConsultar = "select*from empleado cedula_emple = " + cedula_emple;
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + "-"
                        + rs.getString(3) + "-"
                        + rs.getString(4) + "-"
                        + rs.getString(5) + "-"
                        + rs.getString(6) + "-"
                        + rs.getString(7) + "-"
                        + rs.getString(8) + "-"
                        + rs.getString(9) + "-"
                        + rs.getString(10) + "-"
                        + rs.getString(11) + "-"                           
                                             
                        + rs.getString(14);

            }

            rs.close(); // resultado de la consultad del Query
            objConexion.conex.close();

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean insertarEmpleado(int cedula_empleado, String nombre, String apellido, String genero, String direccion, String fecha_nacimiento, String estado_civil, String codigo_cargo, String hora_entrada, String hora_salida, String telefono, float sueldo, int empresa_ruc) {
        boolean resultado = false;
        try {
            String sql = "insert into empleado (cedula_emple, nombre,apellido,genero, direccion,fecha_nacimiento, estado_civil, codigo_cargo, hora_entrada, hora_salida, telefono, sueldo,empresa_ruc) values('"+cedula_empleado+"','" + nombre + "','" + apellido + "','" + genero + "','" + direccion + "','" + fecha_nacimiento + "','" + estado_civil + "','" + codigo_cargo + "','" + hora_entrada + "','" + hora_salida + "','" + telefono + "','" + sueldo + "','" + empresa_ruc + "')";
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;

            }
            //cerrar las conexiones 
            objConexion.conex.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar empleados " + e.getMessage());
        }

        return resultado;

    }

    @Override
    public boolean actualizarEmpleado(int cedula_empleado, String nombre, String apellido, String genero, String direccion, String fecha_nacimiento, String estado_civil, String codigo_cargo, String hora_entrada, String hora_salida, String telefono, float sueldo, int empresa_ruc) {
        boolean resultado = false;
        try {
            String sql = "update empleado set cedula_empleado ='"+cedula_empleado+"' ,  nombre = '" + nombre + "',apellido='" + apellido + "',genero='" + genero + "',direccion='" + direccion + "',fecha_nacimiento='" + fecha_nacimiento + "',estado_civil='" + estado_civil + "',codigo_cargo='" + codigo_cargo + "',hora_entrada='" + hora_entrada + "',hora_salida='" + hora_salida + "',telefono='" + telefono + "',sueldo='" + sueldo + "',empresa_ruc='" + empresa_ruc + "' where cedula_emple = '" + cedula_empleado + "' ";
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objConexion.conex.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar empleado " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet cargarEmpleado() {
        ResultSet resultado = null;
        try {
            String sql = "Select cedula_emple,nombre, apellido,genero, direccion,fecha_nacimiento, estado_civil, codigo_cargo, "
                    + "hora_entrada, hora_salida,telefono, sueldo,empresa_ruc from empleado";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }

   
    

   
}
