
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Empresa extends javax.swing.JFrame {
    public int indice;  
    /**
     * Creates new form Empresa
     */
      private DefaultTableModel modeloTablaEmpresa;
    
  
    
    public Empresa() {
         modeloTablaEmpresa = new DefaultTableModel(null,getColumn());
        initComponents();
        cargarTablaEmpresa();     
          
        
    }
    
     private String[] getColumn(){
        String columnas[] = new String[]{"ruc","nombre","direccion","telefono","propietario"};
        return columnas;
    }
    //Metodo par cargar tabla
    private void cargarTablaEmpresa(){
     Empresas Objempresas = new Empresas();
        ResultSet result = Objempresas.cargarEmpresa();
        try {
            //creamos un arreglo de 3 sectores
            Object Datos [] = new Object[5];
            while (result.next()) {
                for (int i = 0; i <5; i++) {
                    Datos[i]=result.getObject(i+1) ;
                }
                modeloTablaEmpresa.addRow(Datos);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDir = new javax.swing.JTextField();
        txtNomEmp = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtProp = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Ruc");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("EMPRESA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Propietario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtRuc.setEditable(false);
        txtRuc.setText("0");
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        getContentPane().add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, -1));

        btnConsultar.setBackground(new java.awt.Color(51, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar ");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(51, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
            }
        });
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        txtNomEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomEmpActionPerformed(evt);
            }
        });
        txtNomEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomEmpKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, -1));

        txtProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPropActionPerformed(evt);
            }
        });
        getContentPane().add(txtProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, -1));

        btnNext.setBackground(new java.awt.Color(51, 255, 255));
        btnNext.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 130, -1));

        tblEmpresa.setModel(modeloTablaEmpresa);
        tblEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpresa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 310, 190));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        
    }//GEN-LAST:event_txtRucActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
         // Elimino el registro del JTable y la tabla empresa

        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        
        
        // Asigno el indice del elemento seleccionado
        indice = tblEmpresa.getSelectedRow();

        // Asigno a ruc el elemento a eliminar
        int ruc =  Integer.parseInt((String)modelo.getValueAt(indice, 0));

        // Elimino el registro del JTable
        modelo.removeRow(indice);
        
        Empresas objEmpresas = new Empresas();
         // Elimino el registro de la tabla ciudad
         boolean resultado = objEmpresas.eliminarEmpresas(ruc);
        // Imprimo el mensaje para indicar si se eliminó o no el registro
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "El registro se elimino.");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR: No se elimino el registro.");
        }
        
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActionPerformed
        // TODO add your handling code here:
          txtDir.transferFocus();
        
    }//GEN-LAST:event_txtDirActionPerformed

    private void txtNomEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomEmpActionPerformed
        // TODO add your handling code here:
          txtNomEmp.transferFocus();
    }//GEN-LAST:event_txtNomEmpActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
          txtTel.transferFocus();
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPropActionPerformed
        // TODO add your handling code here:
          txtProp.transferFocus();
    }//GEN-LAST:event_txtPropActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
    Empleado obj = new Empleado();
    obj.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        
         Empresas objEmpresas = new Empresas();
         int ruc = Integer.parseInt(txtRuc.getText());
         
            
        
            JOptionPane.showMessageDialog(null, objEmpresas.consultarEmpresas(1));
        
        
           
        txtRuc.setText("");
        txtNomEmp.setText("");
        txtDir.setText("");
        txtTel.setText("");
        txtProp.setText("");
        txtNomEmp.requestFocus();
      
                                         
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
         
        // Limpio los campos
         // *** Limpio los Campos ***  
        txtRuc.setText("");
        txtNomEmp.setText("");
        txtDir.setText("");
        txtTel.setText("");
        txtProp.setText("");
        txtNomEmp.requestFocus();        
        
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        if (txtNomEmp.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Digite Su nombre  ");
           txtNomEmp.requestFocus();
           return;
           
       }
       if (txtDir.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Digite Su direccion ");
           txtDir.requestFocus();
           return;
        
       }
        if (txtTel.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Digite Su telefono ");
           txtTel.requestFocus();
           return;
        
       }
         if (txtProp.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Digite el nombre del propíetario ");
           txtProp.requestFocus();
           return;
        
       }
        
        
       
         Empresas objEmpresas = new Empresas();
         int ruc = Integer.parseInt(txtRuc.getText());
        String nombres = txtNomEmp.getText();
        String direccion = txtDir.getText();
        String telefono = txtTel.getText();
        String propietario = txtProp.getText();
        
        if (ruc==0) {
            
        
        boolean resultado = objEmpresas.insertarEmpresas(ruc,nombres, direccion, telefono,propietario);
        if (resultado== true) {
            JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro");
            modeloTablaEmpresa.setNumRows(0); 
            cargarTablaEmpresa();
        }else{
            JOptionPane.showMessageDialog(null, "Erro al inserta su datos ");
            }
        }else{
            boolean resultado = objEmpresas.actualizarEmpresas(ruc, nombres, direccion, telefono,propietario);
            if (resultado== true) {
            JOptionPane.showMessageDialog(null, "Se actualizo el registro");
            modeloTablaEmpresa.setNumRows(0); 
            cargarTablaEmpresa();
        }else{
            JOptionPane.showMessageDialog(null, "Error al actualizar  ");
            }
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNomEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomEmpKeyTyped
        // TODO add your handling code here:
        
        char  validar = evt.getKeyChar();
    if(Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();

        JOptionPane.showMessageDialog(rootPane,"Ingresa el nombre de empresa");
}
 
        
        
    }//GEN-LAST:event_txtNomEmpKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume(); {
        
        }      
        
         char validar=evt.getKeyChar();
         if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane,"Ingrensar su numero ");
        }
        
    }//GEN-LAST:event_txtTelKeyTyped

    private void tblEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpresaMouseClicked
        // TODO add your handling code here:
           // TODO add your handling code here:
       int seleccion = tblEmpresa.rowAtPoint(evt.getPoint());
       txtRuc.setText(String.valueOf(tblEmpresa.getValueAt(seleccion,0)));
        txtNomEmp.setText(String.valueOf(tblEmpresa.getValueAt(seleccion,1)));
        txtDir.setText(String.valueOf(tblEmpresa.getValueAt(seleccion,2)));
         txtTel.setText(String.valueOf(tblEmpresa.getValueAt(seleccion,3)));
        txtProp.setText(String.valueOf(tblEmpresa.getValueAt(seleccion,4)));
    }//GEN-LAST:event_tblEmpresaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpresa;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNomEmp;
    private javax.swing.JTextField txtProp;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

   
}
