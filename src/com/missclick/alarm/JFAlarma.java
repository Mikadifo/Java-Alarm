/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.missclick.alarm;

/**
 *
 * @author Fernanda
 */
public class JFAlarma extends javax.swing.JFrame {

    /**
     * Creates new form JFAlarma
     */
    public JFAlarma() {
        initComponents();
        this.setTitle("Alarma");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SPNHora = new javax.swing.JSpinner();
        SPNMinuto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        butGuardar = new javax.swing.JButton();
        TxtNombreAlarma = new javax.swing.JTextField();
        CbxLunes = new javax.swing.JCheckBox();
        CbxMartes = new javax.swing.JCheckBox();
        CbxMiercoles = new javax.swing.JCheckBox();
        CbxJueves = new javax.swing.JCheckBox();
        CbxVienes = new javax.swing.JCheckBox();
        CbxSabado = new javax.swing.JCheckBox();
        CbxDomingo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Alarma ");
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Programar alarma ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora:");

        SPNHora.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SPNHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        SPNHora.setEnabled(false);

        SPNMinuto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SPNMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        SPNMinuto.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de Alarma :");

        butGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        butGuardar.setForeground(new java.awt.Color(255, 255, 255));
        butGuardar.setText("Guardar Alarma");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        TxtNombreAlarma.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombreAlarma.setForeground(new java.awt.Color(0, 0, 0));

        CbxLunes.setForeground(new java.awt.Color(255, 255, 255));
        CbxLunes.setText("Lunes");

        CbxMartes.setForeground(new java.awt.Color(255, 255, 255));
        CbxMartes.setText("Martes");

        CbxMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        CbxMiercoles.setText("Miercoles");

        CbxJueves.setForeground(new java.awt.Color(255, 255, 255));
        CbxJueves.setText("Jueves");

        CbxVienes.setForeground(new java.awt.Color(255, 255, 255));
        CbxVienes.setText("Viernes");

        CbxSabado.setForeground(new java.awt.Color(255, 255, 255));
        CbxSabado.setText("Sábado");
        CbxSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxSabadoActionPerformed(evt);
            }
        });

        CbxDomingo.setForeground(new java.awt.Color(255, 255, 255));
        CbxDomingo.setText("Domingo");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repetición:");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.....", "1.Ghost Power", "2.Wait Music", "3.Reggae Drum", "4.Drum C", " " }));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escoger Sonido:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/missclick/alarm/alarma.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(CbxVienes)
                .addGap(38, 38, 38)
                .addComponent(CbxSabado)
                .addGap(39, 39, 39)
                .addComponent(CbxDomingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(11, 11, 11)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SPNHora, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CbxLunes))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CbxMartes)
                                                .addGap(32, 32, 32)
                                                .addComponent(CbxMiercoles))
                                            .addComponent(SPNMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel1)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbxJueves)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butGuardar)
                        .addGap(31, 31, 31)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombreAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(SPNHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPNMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxLunes)
                    .addComponent(CbxMartes)
                    .addComponent(CbxMiercoles)
                    .addComponent(CbxJueves))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxVienes)
                    .addComponent(CbxDomingo)
                    .addComponent(CbxSabado))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(butGuardar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
       
    }//GEN-LAST:event_butGuardarActionPerformed

    private void CbxSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxSabadoActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CbxDomingo;
    private javax.swing.JCheckBox CbxJueves;
    private javax.swing.JCheckBox CbxLunes;
    private javax.swing.JCheckBox CbxMartes;
    private javax.swing.JCheckBox CbxMiercoles;
    private javax.swing.JCheckBox CbxSabado;
    private javax.swing.JCheckBox CbxVienes;
    private javax.swing.JSpinner SPNHora;
    private javax.swing.JSpinner SPNMinuto;
    private javax.swing.JTextField TxtNombreAlarma;
    private javax.swing.JButton butGuardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
