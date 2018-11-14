/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
import Comprobante_De_Venta.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Comprobante extends ComprobantePOA {

    Conexion objConexion = new Conexion();

    @Override
    public boolean insertarComprobante(String fecha, int codigo_cliente, int cliente_id_cliente, int producto_id_prod) {
        boolean resultado = false;
        try {
            String sql = "insert into  comprobante_venta ( fecha, codigo_cliente,cliente_id_cliente,producto_id_prod) values('" + fecha + "','" + codigo_cliente + "','"+cliente_id_cliente+"','"+producto_id_prod+"')";
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
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar Comprobante_Venta " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public boolean actualizarComprobante(int id_comprobante, int codigo_cliente, String fecha, int cliente_id_cliente, int producto_id_prod) {
        boolean resultado = false;
        try {
            String sql = "update comprobante_venta set fecha = '" + fecha + "','" + codigo_cliente + "' where id_comprobante = '" + id_comprobante + "' ";
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objConexion.conex.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar Comprobante_Venta " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public boolean eliminarComprobante(int id_comprobante) {
        boolean resultado = false;
        try {
            String sql = "delete from Comprobante_Venta where id_comprobante = " + id_comprobante;
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objConexion.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar comprobante " + e.getMessage());
        }

        return resultado;

    }

    @Override
    public String consultarComprobante(int id_comprobante) {
        String resultado = "";
        try {
            String sqlConsultar = "select*from Comprobante_Venta id_comprobante = " + id_comprobante;
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + "-"
                        + rs.getString(3) + "-"
                        + rs.getString(4);

            }

            rs.close(); // resultado de la consultad del Query
            objConexion.conex.close();

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet cargarComprobante() {
        ResultSet resultado = null;
        try {
            String sql = "Select id_comprobante , fecha, codigo_cliente,cliente_id_cliente,producto_id_prod from comprobante_venta";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }

    public ResultSet consultarCmbCli() {
        ResultSet resultado = null;
        try {
            String sentenciaSql = "select id_cliente, nombre from cliente";
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            resultado = st.executeQuery(sentenciaSql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al consultar: " + e.getMessage());
        }
        return resultado;

    }

    public ResultSet consultarCmbProd() {
        ResultSet resultado = null;
        try {
            String sentenciaSql = "select id_prod, nombre from producto";
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            resultado = st.executeQuery(sentenciaSql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al consultar: " + e.getMessage());
        }
        return resultado;
    }
}
