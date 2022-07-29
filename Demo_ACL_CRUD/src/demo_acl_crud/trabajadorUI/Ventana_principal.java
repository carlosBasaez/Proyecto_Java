package demo_acl_crud.trabajadorUI;

//importamos package y clase conexion
import demo_acl_crud.trabajador.trabajador;
import demo_acl_crud.trabajadorBD.conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ventana_principal extends javax.swing.JFrame {

    //proceso de limpieza de tabla
    DefaultTableModel modelo;

    public Ventana_principal() {
        initComponents();

        //centrar ventana
        setLocationRelativeTo(null);

        String[] titulos = {"RUT", "Nombre", "Correo", "Direccion"};
        modelo = new DefaultTableModel(null, titulos);
        grid_trabajadores.setModel(modelo);

        MostrarDatos();
        DesactivarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grid_trabajadores = new javax.swing.JTable();
        agregar_trabajador = new javax.swing.JButton();
        editar_trabajador = new javax.swing.JButton();
        borrar_trabajador = new javax.swing.JButton();
        rut_trabajador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombre_trabajador = new javax.swing.JTextField();
        correo_trabajador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccion_trabajador = new javax.swing.JTextField();
        conexion_bd = new javax.swing.JButton();
        actualizar_bd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        grid_trabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        grid_trabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_trabajadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_trabajadores);

        agregar_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agregar_trabajador.setText("Agregar");
        agregar_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_trabajadorActionPerformed(evt);
            }
        });

        editar_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editar_trabajador.setText("Editar");
        editar_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_trabajadorActionPerformed(evt);
            }
        });

        borrar_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        borrar_trabajador.setText("Borrar");
        borrar_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_trabajadorActionPerformed(evt);
            }
        });

        rut_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rut_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rut_trabajadorActionPerformed(evt);
            }
        });
        rut_trabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rut_trabajadorKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("RUT (Sin puntos y con guión):");

        nombre_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre_trabajador.setToolTipText("");
        nombre_trabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_trabajadorKeyTyped(evt);
            }
        });

        correo_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        correo_trabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correo_trabajadorKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Correo electrónico:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Dirección");

        direccion_trabajador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        direccion_trabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccion_trabajadorKeyTyped(evt);
            }
        });

        conexion_bd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conexion_bd.setText("Probar conexión");
        conexion_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexion_bdActionPerformed(evt);
            }
        });

        actualizar_bd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        actualizar_bd.setText("Actualizar");
        actualizar_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_bdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Gestión de trabajadores");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_acl_crud/trabajadorUI/logoPredt.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(agregar_trabajador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(nombre_trabajador)
                            .addComponent(correo_trabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(direccion_trabajador)
                            .addComponent(rut_trabajador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actualizar_bd)
                                .addGap(90, 90, 90)
                                .addComponent(editar_trabajador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addComponent(borrar_trabajador)
                                .addGap(68, 68, 68)
                                .addComponent(conexion_bd))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(175, 175, 175))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rut_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correo_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(direccion_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(agregar_trabajador)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar_trabajador)
                    .addComponent(borrar_trabajador)
                    .addComponent(conexion_bd)
                    .addComponent(actualizar_bd))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conexion_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexion_bdActionPerformed
        //probar conexion 
        conexion objeto_conn = new conexion();
    }//GEN-LAST:event_conexion_bdActionPerformed

    private void agregar_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_trabajadorActionPerformed
        conexion objecto_conn = new conexion();

        trabajador obj_trabajador = RecuperarDatosUI();
        //futura actualizacion, set el rut despues de una consulta para luego comprobar si el rut es igual al que se esta insertando
        // %s toma los strings despues de la coma
        String SentenciaInsertar
                = String.format("INSERT INTO Trabajador (RUT, Nombre, Correo, Direccion) VALUES ('%s', '%s', '%s', '%s');",
                        obj_trabajador.getRut(), obj_trabajador.getNombre(), obj_trabajador.getCorreo(), obj_trabajador.getDireccion());

        objecto_conn.Insertar(SentenciaInsertar);
        this.modelo.setRowCount(0);
        MostrarDatos();
        DesactivarBotones();
        //puede ir un mensaje y luego limpiar casillas
        JOptionPane.showMessageDialog(null, "Se ha agregado con exito el usuario: " + obj_trabajador.getNombre());
        LimpiarTexto();

    }//GEN-LAST:event_agregar_trabajadorActionPerformed

    //llenar la tabla de la interfaz
    public void MostrarDatos() {
        conexion objecto_conn = new conexion();
        try {
            ResultSet resultado = objecto_conn.consultarRegistro("SELECT * FROM Trabajador;");

            while (resultado.next()) {
                Object[] obj_usuario = {resultado.getString("RUT"), resultado.getString("Nombre"), resultado.getString("Correo"), resultado.getString("Direccion")};
                modelo.addRow(obj_usuario);
            }

        } catch (Exception e) {
            System.out.println("error al consultar los registros desde la interfaz" + e);
        }
    }

    //limpiamos la tabla 
    public void LimpiarTabla() {
        modelo.setRowCount(0);
    }

    //recupera los datos de las casillas
    public trabajador RecuperarDatosUI() {
        trabajador obj_trabajador = new trabajador();
        //tomamos los datos de los jtexfield
        obj_trabajador.setRut(rut_trabajador.getText());
        obj_trabajador.setNombre(nombre_trabajador.getText());
        obj_trabajador.setCorreo(correo_trabajador.getText());
        obj_trabajador.setDireccion(direccion_trabajador.getText());

        return obj_trabajador;
    }

    //Limpiar las casillas de texto
    public void LimpiarTexto() {
        rut_trabajador.setText("");
        nombre_trabajador.setText("");
        correo_trabajador.setText("");
        direccion_trabajador.setText("");
    }

    //activar y desactivar botomes
    public void ActivarBotones() {
        editar_trabajador.setEnabled(true);
        borrar_trabajador.setEnabled(true);
    }

    //desactivar botones
    public void DesactivarBotones() {
        editar_trabajador.setEnabled(false);
        borrar_trabajador.setEnabled(false);
    }

    //actualiza los datos 
    private void actualizar_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_bdActionPerformed
        LimpiarTabla();
        MostrarDatos();
    }//GEN-LAST:event_actualizar_bdActionPerformed

    private void grid_trabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_trabajadoresMouseClicked
        // Para dar click a un dato y pasarlo a las cajas de texto
        //si se dio click
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();

            //le pasamos los datos de la tabla a los jtextfield
            rut_trabajador.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            nombre_trabajador.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            correo_trabajador.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            direccion_trabajador.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());

            ActivarBotones();
        }
    }//GEN-LAST:event_grid_trabajadoresMouseClicked

    private void borrar_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_trabajadorActionPerformed
        // borraremos al usuario de la bd, dentro de un mensaje de alerta cuando se quiera borrar
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este usuario?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            conexion objecto_conn = new conexion();

            trabajador obj_trabajador = RecuperarDatosUI();

            // %s toma los strings despues de la coma
            String SentenciaBorrar = String.format("DELETE FROM Trabajador WHERE RUT LIKE '%s'", obj_trabajador.getRut());

            objecto_conn.Insertar(SentenciaBorrar);
            this.modelo.setRowCount(0);
            MostrarDatos();
            //borra las casillas y bloquea botones
            LimpiarTexto();
            DesactivarBotones();
        } else {
            LimpiarTexto();
        }
    }//GEN-LAST:event_borrar_trabajadorActionPerformed

    private void editar_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_trabajadorActionPerformed
        // editar los registros
        conexion objecto_conn = new conexion();

        trabajador obj_trabajador = RecuperarDatosUI();

        // %s toma los strings despues de la coma
        String SentenciaInsertar
                = String.format("UPDATE Trabajador SET Nombre= '%s', Correo = '%s', Direccion = '%s' WHERE RUT LIKE '%s';",
                        obj_trabajador.getNombre(), obj_trabajador.getCorreo(), obj_trabajador.getDireccion(), obj_trabajador.getRut());

        objecto_conn.Insertar(SentenciaInsertar);
        this.modelo.setRowCount(0);
        MostrarDatos();

        //mostrar mensaje y limpiar
        LimpiarTexto();
        DesactivarBotones();
    }//GEN-LAST:event_editar_trabajadorActionPerformed

    private void rut_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rut_trabajadorActionPerformed
        // ignorar
    }//GEN-LAST:event_rut_trabajadorActionPerformed

    private void rut_trabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rut_trabajadorKeyTyped
        // limitar caracteres
        if (rut_trabajador.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_rut_trabajadorKeyTyped

    private void nombre_trabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_trabajadorKeyTyped
        //limitar caracteres
        if (nombre_trabajador.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_nombre_trabajadorKeyTyped

    private void correo_trabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correo_trabajadorKeyTyped
        // limitar caracteres
        if (correo_trabajador.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_correo_trabajadorKeyTyped

    private void direccion_trabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_trabajadorKeyTyped
        // limtiar caracteres
        if (direccion_trabajador.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_direccion_trabajadorKeyTyped

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_bd;
    private javax.swing.JButton agregar_trabajador;
    private javax.swing.JButton borrar_trabajador;
    private javax.swing.JButton conexion_bd;
    private javax.swing.JTextField correo_trabajador;
    private javax.swing.JTextField direccion_trabajador;
    private javax.swing.JButton editar_trabajador;
    private javax.swing.JTable grid_trabajadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_trabajador;
    private javax.swing.JTextField rut_trabajador;
    // End of variables declaration//GEN-END:variables
}
