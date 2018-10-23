/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Productos.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DIEGO
 */
public class Producto extends ProductoPOA{
  Conexion objConexion = new Conexion();
    @Override
    public boolean insertarProducto(String nombre, String modelo, String marca, float precio_compra, float precio_venta) {
        boolean resultado = false;
        try {
           
           String sql="insert into producto ( nombre,modelo, marca,precio_compra,precio_venta) values('"+nombre+"','"+modelo+"','"+marca+"','"+precio_compra+"','"+precio_venta+"')"; 
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
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar "+e.getMessage());
        }
      
       return resultado;
    }

    @Override
    public boolean actualizarProducto(int id_prod, String nombre, String modelo, String marca, float precio_compra, float precio_venta) {
       boolean resultado = false;
        try {
            String sql="update producto set nombres = '"+nombre+"','"+modelo+"','"+marca+"','"+precio_compra+"' ,'"+precio_venta+"'  where id = '"+id_prod+"' ";
            Statement st= objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor>0) {
                resultado = true;
            }
            
            objConexion.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar producto "+e.getMessage());
        }
       
       
       return resultado;

    }

    @Override
    public boolean eliminarProducto(int id_prod) {
           boolean resultado = false;
        try {
            String sql = "delete from producto where cod_producto = "+id_prod;
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
    public String consultarProducto(int id_prod) {
           String resultado ="";
        try {
            String sqlConsultar = "select*from producto id_prod = "+ id_prod;
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

    
    public ResultSet cargarProducto(){
       ResultSet resultado = null;
        try {
            String sql = "Select nombre, modelo, marca, precio, precio_Venta from producto";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
       return resultado;
    }

/**
 *
 * @author DIEGO
 */
}