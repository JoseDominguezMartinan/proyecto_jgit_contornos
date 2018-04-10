/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomavencontornos;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
         initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        bCrear = new javax.swing.JButton();
        bClonar = new javax.swing.JButton();
        bInicialiar = new javax.swing.JButton();
        bCommit = new javax.swing.JButton();
        bPush = new javax.swing.JButton();
        bMarcar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Gestion de repositorios");

        bCrear.setText("Crear repositorio remoto ");
        bCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCrearMouseClicked(evt);
            }
        });

        bClonar.setText("clonar");
        bClonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bClonarMouseClicked(evt);
            }
        });

        bInicialiar.setText("Inicialiar");
        bInicialiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bInicialiarMouseClicked(evt);
            }
        });

        bCommit.setText("commit");
        bCommit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCommitMouseClicked(evt);
            }
        });

        bPush.setText("Push");
        bPush.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bPushMouseClicked(evt);
            }
        });
        bPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPushActionPerformed(evt);
            }
        });

        bMarcar.setText("Marcar proyecto local ");
        bMarcar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMarcarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bCommit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPush, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bMarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bInicialiar)
                        .addGap(18, 18, 18)
                        .addComponent(bClonar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo)
                .addGap(38, 38, 38)
                .addComponent(bMarcar)
                .addGap(18, 18, 18)
                .addComponent(bCrear)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInicialiar)
                    .addComponent(bClonar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPush)
                    .addComponent(bCommit))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCrearMouseClicked
        // TODO add your handling code here:
        Metodos.crearRepo(JOptionPane.showInputDialog("inserte el nombre que le quiere dar al repositorio"));
    }//GEN-LAST:event_bCrearMouseClicked

    private void bClonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClonarMouseClicked
        // TODO add your handling code here:
        Metodos.ClonarRepo(JOptionPane.showInputDialog("Inserte la url a clonar"), JOptionPane.showInputDialog("Inserte el nombre para el repositorio "));
    }//GEN-LAST:event_bClonarMouseClicked

    private void bInicialiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInicialiarMouseClicked
        // TODO add your handling code here:
        Metodos.inicializarRepositorio(JOptionPane.showInputDialog("ruta local a inicializar "));
    }//GEN-LAST:event_bInicialiarMouseClicked

    private void bCommitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCommitMouseClicked
        // TODO add your handling code here:
        Metodos.crearCommit(JOptionPane.showInputDialog("Descripción del commit "), JOptionPane.showInputDialog("indique la ruta remota "));
        
    }//GEN-LAST:event_bCommitMouseClicked

    private void bPushMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPushMouseClicked
        // TODO add your handling code here:
        Metodos.hacerPush(JOptionPane.showInputDialog("Inserte ruta remota"));
    }//GEN-LAST:event_bPushMouseClicked

    private void bPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPushActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bPushActionPerformed

    private void bMarcarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMarcarMouseClicked
        // TODO add your handling code here:
        Metodos.marcarRepo(JOptionPane.showInputDialog("Indica el proyecto local a gestionar"));
    }//GEN-LAST:event_bMarcarMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClonar;
    private javax.swing.JButton bCommit;
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bInicialiar;
    private javax.swing.JButton bMarcar;
    private javax.swing.JButton bPush;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
