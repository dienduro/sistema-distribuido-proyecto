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
 Conexion objConexion = new Conexion();
    @Override
    public boolean insertarEmpleado(String nombre, String apellido, String genero, String direccion, String fecha_nacimiento, String estado_civil, String codigo_cargo, double hora_entrada, double hora_salida, String telefono, float sueldo) {
      
       boolean resultado = false;
        try {
           String sql="insert into empleado (cedula_empleado, Nombre,apellido,genero, direccion,fecha_nacimiento, codigo_cargo, Hora_entrada, Hora_salida, telefono, sueldo) values('"+nombre+"','"+apellido+"','"+genero+"','"+direccion+"','"+fecha_nacimiento+"',,'"+codigo_cargo+"',"
                   + "'"+hora_entrada+"','"+hora_salida+"','"+telefono+"','"+sueldo+"')"; 
           objConexion.conectar();
           Statement st = objConexion.conex.createStatement();
           int valor = st.executeUpdate(sql);
            if (valor>0) {
             resultado = true;
             
            }
            //cerrar las conexiones 
            objConexion.conex.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar empleados "+e.getMessage());
        }
      
       return resultado;
        
    }

    @Override
    public boolean actualizarEmpleado(int cedula_empleado, String nombre, String apellido, String genero, String direccion, String fecha_nacimiento, String estado_civil, String codigo_cargo, double hora_entrada, double hora_salida, String telefono, float sueldo, int empresa_ruc) {
          boolean resultado = false;
        try {
            String sql="update empleado set nombres = '"+nombre+"','"+apellido+"','"+genero+"','"+direccion+"','"+fecha_nacimiento+"',,'"+codigo_cargo+"','"+hora_entrada+"','"+hora_salida+"','"+telefono+"','"+sueldo+"' where cedula_identidad = '"+cedula_empleado+"' ";
            Statement st= objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor>0) {
                resultado = true;
            }
            
            objConexion.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar "+e.getMessage());
        }
       
       
       return resultado;

    }

    @Override
    public boolean eliminarEmpleado(int cedula_empleado, int empresa_ruc) {
        boolean resultado = false;
        try {
            String sql = "delete from empleado where cedula_empleado = "+cedula_empleado;
            Statement st= objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor>0) {
                resultado = true;
            }
            
            objConexion.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar "+e.getMessage());
        }
       
       
       return resultado;
    
    }

    @Override
    public String consultarEmpleado(int cedula_empleado, int empresa_ruc) {
      String resultado ="";
        try {
            String sqlConsultar = "select*from empleado cedula_empleado = "+ cedula_empleado;
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            ResultSet rs  = st.executeQuery(sqlConsultar);
            while (rs.next()) {
               resultado += rs.getString(2)+"-"
               +rs.getString(3)+"-"
               +rs.getString(4);
                
            }
            
            rs.close(); // resultado de la consultad del Query
            objConexion.conex.close();
            
            
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public ResultSet cargarEmpleado(){
       ResultSet resultado = null;
        try {
            String sql = "Select nombre, apellido,genero, direccion,fecha_nacimiento, codigo_cargo, "
                    + "Hora_entrada, Hora_salida,telefono, sueldo from empleado";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
       return resultado;
    }

}
