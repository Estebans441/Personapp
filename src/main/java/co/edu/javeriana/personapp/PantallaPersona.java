package co.edu.javeriana.personapp;

import co.edu.javeriana.personapp.model.dao.PersonaDAO;
import co.edu.javeriana.personapp.model.dao.impl.PersonaDAOImpl;
import co.edu.javeriana.personapp.model.dto.PersonaDTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaPersona extends javax.swing.JFrame {

    public PantallaPersona() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoGenero = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaCc = new javax.swing.JTextField();
        cajaEdad = new javax.swing.JTextField();
        radioM = new javax.swing.JRadioButton();
        radioF = new javax.swing.JRadioButton();
        radioO = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        botInsertar = new javax.swing.JButton();
        botBuscar = new javax.swing.JButton();
        botRefres = new javax.swing.JButton();
        botCont = new javax.swing.JButton();
        botMod = new javax.swing.JButton();
        botElim = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        botIrTel = new javax.swing.JButton();
        botSalir2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmergente = new javax.swing.JLabel();
        txtContar = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(180, 255, 250));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titulo.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 153, 153));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titulo.setText("PERSONAPP");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Genero");

        jLabel4.setText("Edad");

        jLabel5.setText("cc");

        grupoGenero.add(radioM);
        radioM.setText("M");
        radioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMActionPerformed(evt);
            }
        });

        grupoGenero.add(radioF);
        radioF.setText("F");
        radioF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFActionPerformed(evt);
            }
        });

        grupoGenero.add(radioO);
        radioO.setText("O");
        radioO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOActionPerformed(evt);
            }
        });

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Edad", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        botInsertar.setBackground(new java.awt.Color(255, 255, 204));
        botInsertar.setText("Insertar");
        botInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInsertarActionPerformed(evt);
            }
        });

        botBuscar.setBackground(new java.awt.Color(255, 255, 204));
        botBuscar.setText("Buscar");
        botBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscarActionPerformed(evt);
            }
        });

        botRefres.setBackground(new java.awt.Color(255, 255, 204));
        botRefres.setText("Refrescar");
        botRefres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRefresActionPerformed(evt);
            }
        });

        botCont.setBackground(new java.awt.Color(255, 255, 204));
        botCont.setText("Contar");
        botCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botContActionPerformed(evt);
            }
        });

        botMod.setBackground(new java.awt.Color(255, 255, 204));
        botMod.setText("Modificar");
        botMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botModActionPerformed(evt);
            }
        });

        botElim.setBackground(new java.awt.Color(255, 255, 204));
        botElim.setText("Eliminar");
        botElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botElimActionPerformed(evt);
            }
        });

        botIrTel.setBackground(new java.awt.Color(204, 255, 255));
        botIrTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botIrTel.setText("Ir a Telefono");
        botIrTel.setToolTipText("");
        botIrTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIrTelActionPerformed(evt);
            }
        });

        botSalir2.setBackground(new java.awt.Color(204, 255, 255));
        botSalir2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botSalir2.setText("Salir");
        botSalir2.setToolTipText("");
        botSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalir2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel6.setText("Personas:");

        txtContar.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaCc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioM)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioF)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioO))
                                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(botBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(botRefres)
                        .addGap(18, 18, 18)
                        .addComponent(botCont)
                        .addGap(18, 18, 18)
                        .addComponent(botMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botElim)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                                .addComponent(botSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtContar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botIrTel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEmergente)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaCc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(txtEmergente)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioM)
                    .addComponent(radioF)
                    .addComponent(radioO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botInsertar)
                    .addComponent(botBuscar)
                    .addComponent(botRefres)
                    .addComponent(botCont)
                    .addComponent(botMod)
                    .addComponent(botElim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botIrTel)
                    .addComponent(txtContar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botSalir2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInsertarActionPerformed
        
        //Def genero
        char genero;
        if(radioM.isSelected()) genero = 'M';
        else if(radioF.isSelected()) genero = 'F';
        else genero = 'O';
        
        //Crea persona
        PersonaDTO p1 = new PersonaDTO((long) Integer.parseInt(cajaCc.getText()), cajaNombre.getText(), cajaApellido.getText(), (short) Integer.parseInt(cajaEdad.getText()), genero);
        System.out.println("p1: " + p1);
        //Persona DAO
        PersonaDAO pdao = new PersonaDAOImpl();
        PersonaDTO p2 = pdao.create(p1);
        
        //Ventana emergente        
        if(p2 != null) JOptionPane.showMessageDialog(null, "Persona agregada con exito!");
        else JOptionPane.showMessageDialog(null, "No se pudo agregar a la persona. Verifique que no dejo ningun campo en blanco");       
    }//GEN-LAST:event_botInsertarActionPerformed

    private void botBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscarActionPerformed
        PersonaDAO pdao = new PersonaDAOImpl();
        PersonaDTO p = pdao.findById((long) Integer.parseInt(cajaCc.getText()));
        
        DefaultTableModel model = (DefaultTableModel) tablaPersonas.getModel();
        
        int filas = tablaPersonas.getRowCount();
        for (int i = 0;filas>i; i++) model.removeRow(0);
            
        model.addRow(new Object[]{p.getCedula(), p.getNombre(), p.getApellido(), p.getEdad(), p.getGenero()});
        
        System.out.println(p);
    }//GEN-LAST:event_botBuscarActionPerformed

    private void botRefresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRefresActionPerformed
        PersonaDAO pdao = new PersonaDAOImpl();
        List<PersonaDTO> personas = pdao.findAll();
        
        DefaultTableModel model = (DefaultTableModel) tablaPersonas.getModel();
        
        int filas = tablaPersonas.getRowCount();
        for (int i = 0;filas>i; i++) model.removeRow(0);
            
        for(PersonaDTO p : personas) model.addRow(new Object[]{p.getCedula(), p.getNombre(), p.getApellido(), p.getEdad(), p.getGenero()});
    }//GEN-LAST:event_botRefresActionPerformed

    private void botContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botContActionPerformed
        PersonaDAO pdao = new PersonaDAOImpl();
        Integer cant = pdao.count();
        txtContar.setText("Cantidad de personas: " + cant);
        JOptionPane.showMessageDialog(null, "Cantidad de personas: " + cant);
    }//GEN-LAST:event_botContActionPerformed

    private void botModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botModActionPerformed

    private void botElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botElimActionPerformed
        //Persona DAO para eliminar
        PersonaDAO pdao = new PersonaDAOImpl();
        Boolean eliminado = pdao.delete((long) Integer.parseInt(cajaCc.getText()));
        
        //Ventana emergente
        if(eliminado) JOptionPane.showMessageDialog(null, "Persona Eliminada con exito!");
        else JOptionPane.showMessageDialog(null, "No se pudo eliminar a la persona. Verifique que la cedula esta bien ingresada o que la persona existe en el sistema"); 
        
    }//GEN-LAST:event_botElimActionPerformed

    private void botIrTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIrTelActionPerformed
        PantallaTelefono p = new PantallaTelefono();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botIrTelActionPerformed

    private void botSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalir2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_botSalir2ActionPerformed

    private void radioOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOActionPerformed

    private void radioFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFActionPerformed

    private void radioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMActionPerformed


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
            java.util.logging.Logger.getLogger(PantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBuscar;
    private javax.swing.JButton botCont;
    private javax.swing.JButton botElim;
    private javax.swing.JButton botInsertar;
    private javax.swing.JButton botIrTel;
    private javax.swing.JButton botMod;
    private javax.swing.JButton botRefres;
    private javax.swing.JButton botSalir2;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCc;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton radioF;
    private javax.swing.JRadioButton radioM;
    private javax.swing.JRadioButton radioO;
    private javax.swing.JTable tablaPersonas;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtContar;
    private javax.swing.JLabel txtEmergente;
    // End of variables declaration//GEN-END:variables
}
