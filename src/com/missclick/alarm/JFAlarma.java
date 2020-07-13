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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 24)); // NOI18N
        jLabel1.setText("Programar alarma ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Hora:");

        SPNHora.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SPNHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        SPNMinuto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SPNMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre de Alarma :");

        butGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        butGuardar.setText("Guardar Alarma");
        butGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarActionPerformed(evt);
            }
        });

        CbxLunes.setText("Lunes");

        CbxMartes.setText("Martes");

        CbxMiercoles.setText("Miercoles");

        CbxJueves.setText("Jueves");

        CbxVienes.setText("Viernes");

        CbxSabado.setText("Sábado");

        CbxDomingo.setText("Domingo");

        jLabel3.setText("Repetición:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(CbxVienes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(CbxSabado)
                        .addGap(18, 18, 18)
                        .addComponent(CbxDomingo)
                        .addGap(184, 184, 184))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SPNHora, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbxLunes))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CbxMartes)
                                        .addGap(32, 32, 32)
                                        .addComponent(CbxMiercoles)
                                        .addGap(39, 39, 39)
                                        .addComponent(CbxJueves))
                                    .addComponent(SPNMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butGuardar)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreAlarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SPNHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPNMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxLunes)
                    .addComponent(CbxMartes)
                    .addComponent(CbxMiercoles)
                    .addComponent(CbxJueves))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxVienes)
                    .addComponent(CbxSabado)
                    .addComponent(CbxDomingo))
                .addGap(40, 40, 40)
                .addComponent(butGuardar)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarActionPerformed
       
    }//GEN-LAST:event_butGuardarActionPerformed

  

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
