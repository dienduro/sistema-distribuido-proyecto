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

    @Override
    public boolean insertarProducto(String nombre, String modelo, String marca, float precio_compra, float precio_venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarProducto(int id_prod, String nombre, String modelo, String marca, float precio_compra, float precio_venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProducto(int id_prod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarProducto(int id_prod) {
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