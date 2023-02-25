/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Internalpages;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author SCC-PC
 */
public class dashBoardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashBoardPage
     */
    public dashBoardPage() {
        initComponents();
       this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null); 
        
    }
    Color navcolor = new Color(255, 153, 0);
    Color headcolor = new Color(255, 102, 102);
    Color bodycolor = new Color(255, 153, 153);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manager = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 160, 180);

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel1.setText("Vape Sales & Stock Tracker ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 440, 70);

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel2.setText("Additional System Description");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 300, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 180));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(null);

        settings.setBackground(new java.awt.Color(255, 102, 102));
        settings.setPreferredSize(new java.awt.Dimension(170, 170));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconsfolder/icons8-gear-100.png"))); // NOI18N
        settings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, -1));

        jLabel4.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel4.setText("Settings");
        settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        jPanel2.add(settings);
        settings.setBounds(440, 90, 170, 150);

        manager.setBackground(new java.awt.Color(255, 102, 102));
        manager.setPreferredSize(new java.awt.Dimension(170, 170));
        manager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managerMouseExited(evt);
            }
        });
        manager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconsfolder/icons8-admin-settings-male-100.png"))); // NOI18N
        manager.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel6.setText("Manager User ");
        manager.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, -1));

        jPanel2.add(manager);
        manager.setBounds(20, 90, 170, 150);

        reports.setBackground(new java.awt.Color(255, 102, 102));
        reports.setPreferredSize(new java.awt.Dimension(170, 170));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconsfolder/icons8-reports-100.png"))); // NOI18N
        reports.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        jLabel8.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel8.setText("Reports ");
        reports.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        jPanel2.add(reports);
        reports.setBounds(230, 90, 170, 150);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 640, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerMouseEntered
        manager.setBackground(navcolor);
    }//GEN-LAST:event_managerMouseEntered

    private void managerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerMouseExited
       manager.setBackground(headcolor);
    }//GEN-LAST:event_managerMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(navcolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(headcolor);
    }//GEN-LAST:event_reportsMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
         settings.setBackground(headcolor);
    }//GEN-LAST:event_settingsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel manager;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel settings;
    // End of variables declaration//GEN-END:variables
}