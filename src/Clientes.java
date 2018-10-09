
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    private DefaultTableModel modeloTabla;
    
    public Clientes() {
        modeloTabla = new DefaultTableModel(null,getColumn());
        //cargarTabla();
        initComponents();
        
    }
    private String[] getColumn(){
        String columnas[] = new String[]{"id","Nombre","apellido"};
        return columnas;
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
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnSiguientes = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("EMPRESAS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(156, 11, 160, 26);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Id ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 53, 62, 21);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId);
        txtId.setBounds(120, 60, 126, 20);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 103, 59, 21);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Apellido ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 131, 67, 34);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 100, 126, 20);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(120, 140, 126, 20);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 170);

        btnConsultar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnConsultar.setText("Consultar ");
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(20, 320, 120, 40);

        btnSiguientes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSiguientes.setText("Siguientes");
        getContentPane().add(btnSiguientes);
        btnSiguientes.setBounds(260, 320, 130, 40);

        btnLimpiar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(400, 320, 110, 40);

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar ");
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(150, 320, 100, 40);

        tblRegistro.setModel(modeloTabla);
        jScrollPane1.setViewportView(tblRegistro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 180, 300, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}