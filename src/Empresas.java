/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Empresa.Empresas.*; 
import Empresa.EmpresasPOA;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class Empresas extends EmpresasPOA{
    
    Conexion objConexion = new Conexion();
   
         
    @Override
    public boolean insertarEmpresas(int ruc, String nombre, String direccion, String telefono, String propietario) {
       
    boolean resultado = false;
        try {
            String sql = "insert into empresas (ruc,nombre,direccion,telefono,propietario)values('"+ruc+"','"+nombre+"','"+direccion+"','"+telefono+"','"+propietario+"') ";
       objConexion.conectar();
       Statement st = objConexion.conex.createStatement();
       int valor = st.executeUpdate(sql);
       if(valor>0){
           resultado = true;
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean actualizarEmpresas(int ruc, String nombre, String direccion, String telefono, String propietario) {
        boolean resultado = false;
    try{
       String sql = "update empresas set ruc='"+ruc+"', nombre ='"+nombre+"',direccion='"+direccion+"',telefono='"+telefono+"',propietario='"+propietario+"' where ruc = '"+ruc+"' ";
       objConexion.conectar();
       Statement st = objConexion.conex.createStatement();
       int valor = st.executeUpdate(sql);
       if(valor>0){
           resultado = true;
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarEmpresas(int ruc) {
        
      
      boolean resultado = false ;
      try{
          String sql = "delete from empresas where ruc = "+ruc;
          objConexion.conectar();
          Statement st = objConexion.conex.createStatement();
         int valor = st.executeUpdate(sql);
       if(valor>0){
           resultado = true;
           
         }
       //Se cierran las conexiones.
            objConexion.conex.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar"+e.getMessage());
        }
        return resultado;
    }  
   
    @Override
    public String consultarEmpresas(int ruc) {
     
        String resultado ="";
        try {
            String sqlConsultar = "select*from empresas ruc = "+ruc;
            objConexion.conectar();
            Statement st = objConexion.conex.createStatement();
            ResultSet rs  = st.executeQuery(sqlConsultar);
            while (rs.next()) {
               resultado += rs.getString(2)+"-"
               +rs.getString(3)+"-"
               +rs.getString(4)
               +rs.getString(5)
               +rs.getInt(6);
                
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

    public ResultSet cargarEmpresa(){
       ResultSet resultado = null;
        try {
            String sql = "Select ruc,nombre, direccion,  telefono, propietario from empresas";
            objConexion.conectar(); // abrimos la conexion
            Statement st = objConexion.conex.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
       return resultado;
    }

  public ResultSet consultarEmpresaRuc(){
        ResultSet resultado = null;
        try {
            String sentenciaSql = "select ruc, nombre from empresas";
            objConexion.conectar();
            Statement st =objConexion.conex.createStatement();
            resultado = st.executeQuery(sentenciaSql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al consultar: " + e.getMessage());
        }
        return resultado;
    }


   
  
    

    
}
