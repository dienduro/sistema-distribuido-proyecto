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
    public boolean insertarProducto(String nombre, String modelo, String marca,
            float precio_compra, float precio_venta) {
            boolean resultado = false;
        try {
           
           String sql="insert into producto ( nombre,modelo, marca,precio_compra,precio_venta)"
                   + " values('"+nombre+"','"+modelo+"','"+marca+"','"+precio_compra+"','"+precio_venta+"')"; 
           objConexion.conectar();
                try (Statement st = objConexion.conex.createStatement()) {
                    int valor = st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,valor);
                    if (valor>0) {
                        resultado = true;
                        
                    }
                    //cerrar las conexiones
                    objConexion.conex.close();
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar "+e.getMessage());
        }
      
       return resultado;
    }

    @Override
    public boolean actualizarProducto(int id_prod, String nombre, String modelo, String marca, float precio_compra, float precio_venta) {
       boolean resultado = false;
        try {
            String sql ="UPDATE producto " +
			"SET nombre = ?," +
			"modelo = ?," +
			"marca = ?," +
			"precio_compra = ?," +
                         "precio_venta = ?," +
			"WHERE id_prod = "+id_prod;
          //  String sql= "UPDATE producto SET  nombre=?,modelo=?,marca=?,precio_compra=?,precio_venta =? where id_prod="+id_prod;
          //  String sql= "UPDATE producto SET  nombres= '"+nombre+"',modelos= '"+modelo+"',marcas= '"+marca+"',precio_compras= '"+precio_compra+"',precio_ventas = '"+precio_venta+"' where id_prod='"+id_prod+"'";
            PreparedStatement pst=  objConexion.conex.prepareStatement(sql);
            pst.setString(1, nombre);
	pst.setString(2,modelo );
	pst.setString(3,marca);
	pst.setFloat(4,precio_compra);
	pst.setFloat(5,precio_venta);
            int valor = pst.executeUpdate();
            JOptionPane.showMessageDialog(null,valor);
            if (valor>0) {
                resultado = true;
            }
            
            objConexion.conex.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar producto "+e);
        }
       
       
       return resultado;

    }

    @Override
    public boolean eliminarProducto(int id_prod) {
           boolean resultado = false;
        try {
            String sql = "delete from producto where id_prod ="+id_prod;
            
            Statement st= objConexion.conex.createStatement();
            
            int valor = st.executeUpdate(sql);
            
            if (valor>0) {
                resultado = true;
            }
            else{
            JOptionPane.showMessageDialog(null, valor);
            }
            
            objConexion.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar "+e);
            JOptionPane.showMessageDialog(null,id_prod);
           
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
               try (ResultSet rs = st.executeQuery(sqlConsultar)) {
                   while (rs.next()) {
                       resultado +=
                               rs.getString(1)+"-"
                               +rs.getString(2)+"-"
                               +rs.getString(3)+"_"
                               +rs.getString(4)+"_"
                               +rs.getString(5)+"_"
                               +rs.getString(6)+"_";
                   }
                   // resultado de la consultad del Query
               }
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
            String sql = "Select id_prod, nombre, modelo, marca, precio_compra, precio_venta from producto";
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