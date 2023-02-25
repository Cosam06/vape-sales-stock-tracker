/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiappmacua;

import java.awt.Color;
import Internalpages.*;
import Internalpages.dashBoardPage;

public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }
    Color navcolor = new Color(255, 153, 0);
    Color headcolor = new Color(255, 102, 102);
    Color bodycolor = new Color(255, 153, 153);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userpane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reportspane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(255, 153, 0));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(255, 153, 0));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("USER PAGE");
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 50));

        userpane.setBackground(new java.awt.Color(255, 153, 0));
        userpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpaneMouseExited(evt);
            }
        });
        userpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD ");
        userpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        navbar.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 50));

        reportspane.setBackground(new java.awt.Color(255, 153, 0));
        reportspane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportspaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportspaneMouseExited(evt);
            }
        });
        reportspane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("REPORTS ");
        reportspane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        navbar.add(reportspane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, 50));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 140, 550);

        header.setBackground(new java.awt.Color(255, 102, 102));
        header.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(header);
        header.setBounds(140, 0, 630, 40);

        maindesktop.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(140, 40, 630, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
        dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
        dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void userpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseEntered
        userpane.setBackground(bodycolor);
    }//GEN-LAST:event_userpaneMouseEntered

    private void userpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseExited
        userpane.setBackground(navcolor);
    }//GEN-LAST:event_userpaneMouseExited

    private void reportspaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspaneMouseEntered
        reportspane.setBackground(bodycolor);
    }//GEN-LAST:event_reportspaneMouseEntered

    private void reportspaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspaneMouseExited
        reportspane.setBackground(navcolor);
    }//GEN-LAST:event_reportspaneMouseExited

    private void userpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseClicked
    dashBoardPage dbp = new dashBoardPage();
    maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_userpaneMouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        Userpage up = new Userpage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportspane;
    private javax.swing.JPanel userpane;
    // End of variables declaration//GEN-END:variables
}
