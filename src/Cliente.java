/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clientes.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class Cliente extends ClientePOA {

    Conexion objConexion = new Conexion();

    @Override
    public boolean insertarCliente(String nombre, String apellido, int empresa_ruc) {
        boolean resultado = false;
        try {
            String sql="insert into cliente (nombre,apellido,empresa_ruc) values('" + nombre + "','" + apellido + "','"+empresa_ruc+"')";
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
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar dato en cliente " + e.getMessage());
        }

        return resultado;

    }

    @Override
    public boolean actualizarCliente(int id_cliente, String nombre, String apellido, int empresa_ruc) {
        boolean resultado = false;
        try {
            String sql = "update cliente set nombres = '" + nombre + "','" + apellido + "' where id = '" + id_cliente + "' ";
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objConexion.conex.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar clientes " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public boolean eliminarCliente(int id_cliente) {
        boolean resultado = false;
        try {
            String sql = "delete from cliente where id_cliente = " + id_cliente;
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objConexion.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar cliente " + e.getMessage());
        }

        return resultado;

    }

    @Override
    public String consultarCliente(int id_cliente) {
        String resultado = "";
        try {
            String sqlConsultar = "select*from cliente id_cliente = " + id_cliente;
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

    public ResultSet cargarCliente() {
        ResultSet resultado = null;
        try {
            String sql = "Select nombre, apellido,empresa_ruc from cliente";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }

//    public ResultSet consultarCmbRuc() {
//        ResultSet resultado = null;
//        try {
//            String sentenciaSql = "select ruc, nombre from empresas";
//            objConexion.conectar();
//            Statement st = objConexion.conex.createStatement();
//            resultado = st.executeQuery(sentenciaSql);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Ocurrio un error al consultar: " + e.getMessage());
//        }
//        return resultado;
//
//    }
}
