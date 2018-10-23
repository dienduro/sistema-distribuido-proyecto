

import Proveedores.*;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Proveedores extends ProveedorPOA{
 Conexion objConexion = new Conexion();
    @Override
    public boolean insertarProveedor(String nombre, String direccion, String telefono) {
      boolean resultado = false;
        try {
           String sql="insert into proveedor (nombres,direccion,telefono) values('"+nombre+"','"+direccion+"','"+telefono+"')"; 
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
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar proveedor  "+e.getMessage());
        }
       
       
       return resultado;

    }

    @Override
    public boolean actualizarProveedor(int ruc_prov, String nombre, String direccion, String telefono) {
           boolean resultado = false;
        try {
            String sql="update proveedores set nombres = '"+nombre+"','"+direccion+"','"+telefono+"', where ruc = '"+ruc_prov+"' ";
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
    public boolean eliminarProveedor(int ruc_prov) {
          boolean resultado = false;
        try {
            String sql = "delete from proveedores where ruc_prov = "+ruc_prov;
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
    public String consultarProveedor(int ruc_prov) {
     String resultado ="";
        try {
            String sqlConsultar = "select*from proveedor ruc = "+ruc_prov;
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
    
     public ResultSet cargarProveedor(){
       ResultSet resultado = null;
        try {
            String sql = "Select nombre, direccion,  Codigo_telefono, Celular from Proveedor";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
       return resultado;
    }
  
    
    
}
