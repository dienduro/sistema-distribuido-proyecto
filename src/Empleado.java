
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
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
public class Empleado extends javax.swing.JFrame {

    private DefaultTableModel modeloTablaEmpleado;
    public int indice;

    /**
     *
     * }
     *
     */
    public Empleado() {
        initComponents();

        ComboBoxRues cb = new ComboBoxRues();
        DefaultComboBoxModel modeloRuesEmple = new DefaultComboBoxModel(cb.mostrarRues());
        cmbEmpresa.setModel(modeloRuesEmple);

    }

    //Metodo para cargar las columnas en la tabla
//    private String[] getColumn() {
//        String columnas[] = new String[]{"nombre", "apellido", "genero", " direccion", "fecha_nacimiento", " estado_civil", " codigo_cargo"
//            + "Hora_entrada", "Hora_salida", "telefono", " sueldo"};
//        return columnas;
//    }
    private void getColumn() {
        modeloTablaEmpleado = (DefaultTableModel) tblEmpleado.getModel();

        modeloTablaEmpleado.addColumn("ID");
        modeloTablaEmpleado.addColumn("Nombre");
        modeloTablaEmpleado.addColumn("Apellido");
        modeloTablaEmpleado.addColumn("Genero");
        modeloTablaEmpleado.addColumn("Direccion");
        modeloTablaEmpleado.addColumn("Fecha_nacimineto");
        modeloTablaEmpleado.addColumn("Estado civil");
        modeloTablaEmpleado.addColumn("cargo");
        modeloTablaEmpleado.addColumn("Hora entrada");
        modeloTablaEmpleado.addColumn("Hora Salida");
        modeloTablaEmpleado.addColumn("Telefono");
        modeloTablaEmpleado.addColumn("Sueldo");
        modeloTablaEmpleado.addColumn("Empresa Ruc");

    }

    //Metodo par cargar tabla
    private void cargarTablaEmpleado() {
        Empleados ObjEmpleados = new Empleados();
        modeloTablaEmpleado = (DefaultTableModel) tblEmpleado.getModel();
        ResultSet resultado = ObjEmpleados.cargarEmpleado();
        try {
            //creamos un arreglo de 3 sectores
            Object Datos[] = new Object[13];
            while (resultado.next()) {
                for (int i = 0; i < 13; i++) {
                    Datos[i] = resultado.getObject(i + 1);
                }
                modeloTablaEmpleado.addRow(Datos);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCumple = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtCodigoCargo = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraDeSalida = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        cmbEmpresa = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Genero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Direccion ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Fecha Nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        txtCedula.setText("0");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 110, -1));

        txtGenero.setText("M/F");
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 110, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, -1));

        txtCumple.setText("dd/mm/aa");
        txtCumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCumpleActionPerformed(evt);
            }
        });
        getContentPane().add(txtCumple, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 110, -1));

        btnConsultar.setBackground(new java.awt.Color(51, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar ");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(51, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(51, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 170, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setText("Estado Civil ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Codigo Cargo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 160, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setText("Hora Entrada");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 160, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setText("Hora  De Salida");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 170, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Telefono");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 110, -1));

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 170, -1));

        txtCodigoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCargoActionPerformed(evt);
            }
        });
        txtCodigoCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoCargoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 170, -1));

        txtHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 170, -1));

        txtHoraDeSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraDeSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHoraDeSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 170, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 170, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("Empresa_Ruc");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 150, -1));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 650, 160));

        btnNext.setBackground(new java.awt.Color(51, 255, 255));
        btnNext.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setText("Sueldo ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 120, -1));

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 170, -1));

        getContentPane().add(cmbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 210, 170, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setText("Nombre");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnActualizar.setText("Actalizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/91134-OIW11W-632.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblEmpleado.getModel();

        // Asigno el indice del elemento seleccionado
        indice = tblEmpleado.getSelectedRow();

        // Asigno a idCiudad el elemento a eliminar
        int cedula_emple = Integer.parseInt(txtCedula.getText());

        // Elimino el registro del JTable
        modelo.removeRow(indice);
        
        Empleados objEmpleados = new Empleados();
        // Elimino el registro de la tabla proveedor
     try {
        boolean resultado = objEmpleados.eliminarEmpleado(cedula_emple);
        // Imprimo el mensaje para indicar si se eliminó o no el registro
         
     
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "El registro se elimino.");
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: No se elimino el registro.");
        }       // TODO add your handling code here:
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
      }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        modeloTablaEmpleado = (DefaultTableModel) tblEmpleado.getModel();
        modeloTablaEmpleado.setColumnCount(0);
        modeloTablaEmpleado.setRowCount(0);
        getColumn();
        cargarTablaEmpleado();

//        txtCedula.setText("0");
//        txtNombre.setText("");
//        txtApellido.setText("");
//        txtCodigoCargo.setText("");
//        txtCumple.setText("");
//        txtDireccion.setText("");
//        txtEstado.setText("");
//        txtGenero.setText("");
//        txtHoraDeSalida.setText("");
//        txtHoraEntrada.setText("");
//        txtSueldo.setText("");
//        txtTelefono.setText("");
//        txtNombre.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su nombre  ");
            txtNombre.requestFocus();
            return;

        }
        if (txtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su direccion ");
            txtDireccion.requestFocus();
            return;

        }
        if (txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su telefono ");
            txtTelefono.requestFocus();
            return;

        }
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite el nombre del propíetario ");
            txtApellido.requestFocus();
            return;

        }
        Empleados objEmpleados = new Empleados();
        ComboBoxRues cb = (ComboBoxRues) cmbEmpresa.getSelectedItem();

        Empresas objEmpresas = new Empresas();

        int cedula_empleado = Integer.parseInt(txtCedula.getText());
        int empresa_ruc = cb.getId();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String apellido = txtApellido.getText();
        String genero = txtGenero.getText();
        String fecha_nacimiento = txtCumple.getText();
        String estado_civil = txtEstado.getText();
        String codigo_cargo = txtCodigoCargo.getText();
        String hora_entrada = txtHoraEntrada.getText();

        String hora_salida = txtHoraDeSalida.getText();
        float sueldo = Float.parseFloat(txtSueldo.getText());

        try {

            boolean resultado = objEmpleados.insertarEmpleado(cedula_empleado, nombre, apellido, genero, direccion, fecha_nacimiento, estado_civil, codigo_cargo, hora_entrada, hora_salida, telefono, sueldo, empresa_ruc);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro");
                modeloTablaEmpleado.setNumRows(0);
                cargarTablaEmpleado();
            } else {
                JOptionPane.showMessageDialog(null, "Erro al inserta su datos ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "");

        }

    }

    private void txtNomEmpKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa el nombre de empresa");
        }

    }

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        {

        }

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrensar su numero ");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        modeloTablaEmpleado = (DefaultTableModel) tblEmpleado.getModel();

        txtCedula.setText("0");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCodigoCargo.setText("");
        txtCumple.setText("");
        txtDireccion.setText("");
        txtEstado.setText("");
        txtGenero.setText("");
        txtHoraDeSalida.setText("");
        txtHoraEntrada.setText("");
        txtSueldo.setText("");
        txtTelefono.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Empleados objEmpleados = new Empleados();
        ComboBoxRues cb = (ComboBoxRues) cmbEmpresa.getSelectedItem();

        Empresas objEmpresas = new Empresas();

        int cedula_empleado = Integer.parseInt(txtCedula.getText());
        int empresa_ruc = cb.getId();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String apellido = txtApellido.getText();
        String genero = txtGenero.getText();
        String fecha_nacimiento = txtCumple.getText();
        String estado_civil = txtEstado.getText();
        String codigo_cargo = txtCodigoCargo.getText();
        String hora_entrada = txtHoraEntrada.getText();

        String hora_salida = txtHoraDeSalida.getText();
        float sueldo = Float.parseFloat(txtSueldo.getText());
        try {
            boolean resultado = objEmpleados.actualizarEmpleado( cedula_empleado, nombre, apellido, genero, direccion, fecha_nacimiento, estado_civil, codigo_cargo, hora_entrada, hora_salida, telefono, sueldo,  empresa_ruc);
        if (resultado == true){
            JOptionPane.showMessageDialog(null, "Se actualizo el registro");
            modeloTablaEmpleado.setNumRows(0);
            cargarTablaEmpleado();
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar  ");
        }
          
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        int seleccion = tblEmpleado.rowAtPoint(evt.getPoint());
        txtApellido.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 0)));
        txtCedula.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 1)));
        txtCodigoCargo.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 2)));
        txtCumple.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 3)));
        txtDireccion.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 4)));
        txtEstado.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 5)));
        txtGenero.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 6)));
        txtHoraDeSalida.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 7)));
        txtHoraEntrada.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 8)));
        txtNombre.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 9)));
        txtSueldo.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 10)));
        txtTelefono.setText(String.valueOf(tblEmpleado.getValueAt(seleccion, 11)));
        
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
          char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa tu NOMBRE EMPLEADO ");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        
          char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa tu apellido EMPLEADO ");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
         txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
         txtApellido.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
         txtGenero.transferFocus();
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
         txtDireccion.transferFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCumpleActionPerformed
        // TODO add your handling code here:
         txtCumple.transferFocus();
    }//GEN-LAST:event_txtCumpleActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
         txtEstado.transferFocus();
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtCodigoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCargoActionPerformed
        // TODO add your handling code here:
         txtCodigoCargo.transferFocus();
    }//GEN-LAST:event_txtCodigoCargoActionPerformed

    private void txtHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEntradaActionPerformed
        // TODO add your handling code here:
         txtHoraEntrada.transferFocus();
    }//GEN-LAST:event_txtHoraEntradaActionPerformed

    private void txtHoraDeSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraDeSalidaActionPerformed
        // TODO add your handling code here:
         txtHoraDeSalida.transferFocus();
    }//GEN-LAST:event_txtHoraDeSalidaActionPerformed

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa tu estado empleado");
        }
    }//GEN-LAST:event_txtEstadoKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
        txtSueldo.transferFocus();
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume(); 
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume(); 
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void txtCodigoCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCargoKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume(); 
    }//GEN-LAST:event_txtCodigoCargoKeyTyped

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoCargo;
    private javax.swing.JTextField txtCumple;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtHoraDeSalida;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
